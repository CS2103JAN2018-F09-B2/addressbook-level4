package seedu.recipe.ui;

import java.net.URL;
import java.util.logging.Logger;

import com.google.common.eventbus.Subscribe;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.layout.Region;
import javafx.scene.web.WebView;
import seedu.recipe.MainApp;
import seedu.recipe.commons.core.LogsCenter;
import seedu.recipe.commons.events.ui.RecipePanelSelectionChangedEvent;
import seedu.recipe.commons.events.ui.ShareRecipeEvent;
import seedu.recipe.model.recipe.Recipe;
import seedu.recipe.model.recipe.Url;
import seedu.recipe.ui.util.FacebookHandler;

/**
 * The Browser Panel of the App.
 */
public class BrowserPanel extends UiPart<Region> {

    public static final String DEFAULT_PAGE = "default.html";
    public static final String SEARCH_PAGE_URL =
            "https://se-edu.github.io/addressbook-level4/DummySearchPage.html?name=";
    private static final String FXML = "BrowserPanel.fxml";

    private Recipe recipeToShare;

    private final Logger logger = LogsCenter.getLogger(this.getClass());

    @FXML
    private WebView browser;

    public BrowserPanel() {
        super(FXML);

        // To prevent triggering events for typing inside the loaded Web page.
        getRoot().setOnKeyPressed(Event::consume);

        loadDefaultPage();
        registerAsAnEventHandler(this);
    }

    public void loadPage(String url) {
        Platform.runLater(() -> browser.getEngine().load(url));
    }

    private void loadRecipePage(Recipe recipe) {
        loadPage(recipe.getUrl().toString());
    }

    /**
     * Loads a default HTML file with a background that matches the general theme.
     */
    private void loadDefaultPage() {
        URL defaultPage = MainApp.class.getResource(FXML_FILE_FOLDER + DEFAULT_PAGE);
        loadPage(defaultPage.toExternalForm());
    }

    /**
     * Frees resources allocated to the browser.
     */
    public void freeResources() {
        browser = null;
    }

    @Subscribe
    private void handleRecipePanelSelectionChangedEvent(RecipePanelSelectionChangedEvent event) {
        logger.info(LogsCenter.getEventHandlingLogMessage(event));
        loadRecipePage(event.getNewSelection().recipe);
    }

    //@@author RyanAngJY
    @Subscribe
    private void handleShareRecipeEvent(ShareRecipeEvent event) {
        recipeToShare = event.getTargetRecipe();
        String urlToShare = recipeToShare.getUrl().toString();
        UiUtil.copyToClipboard(recipeToShare.getTextFormattedRecipe());

        if (!urlToShare.equals(Url.NULL_URL_REFERENCE)) {
            loadPage(FacebookHandler.getPostDomain() + recipeToShare.getUrl().toString()
                    + FacebookHandler.getRedirectEmbedded());
        } else {
            loadPage(FacebookHandler.REDIRECT_DOMAIN);
        }
    }
    //@@author
}
