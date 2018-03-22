package seedu.recipe.ui;

import static seedu.recipe.ui.util.AutoCompletionUtil.APPLICATION_KEYWORDS;
import static seedu.recipe.ui.util.AutoCompletionUtil.MAX_SUGGESTIONS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javafx.geometry.Side;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import seedu.recipe.ui.util.TextInputProcessorUtil;

//@@author hoangduong1607
/**
 * The component that is responsible for showing a suggestion list for auto-completion
 */
public class SuggestionsPopUp extends ContextMenu {

    private CommandBox commandBox;
    private TextArea commandTextArea;
    private TextInputProcessorUtil textInputProcessor;

    protected SuggestionsPopUp(CommandBox commandBox) {
        super();
        this.commandBox = commandBox;
        commandTextArea = commandBox.getCommandTextArea();
        textInputProcessor = new TextInputProcessorUtil();
    }

    /**
     * Hides suggestions
     */
    protected void hideSuggestions() {
        if  (isShowing()) {
            hide();
        }
    }

    /**
     * Shows suggestions for commands when users type in Command Box
     */
    protected void showSuggestions() {
        textInputProcessor.setContent(commandTextArea.getText());
        textInputProcessor.setFont(commandTextArea.getFont());
        String lastWord = textInputProcessor.getLastWord();
        // finds suggestions and displays
        findSuggestions(lastWord, Arrays.asList(APPLICATION_KEYWORDS));

        // gets caret position based on input text and font
        double anchorX = findDisplayPositionX(textInputProcessor.getCaretPositionX());
        double anchorY = findDisplayPositionY(textInputProcessor.getCaretPositionY());

        show(commandTextArea, Side.BOTTOM, anchorX, anchorY);
    }

    /**
     * Finds possible suggestions from {@code word} and
     * list of valid suggestions {@code textList}.
     */
    private void findSuggestions(String prefix, List<String> dictionary) {
        getItems().clear();
        Collections.sort(dictionary);

        for (String suggestion : dictionary) {
            if (suggestion.startsWith(prefix)) {
                addSuggestion(suggestion);
            }

            if (getItems().size() == MAX_SUGGESTIONS) {
                break;
            }
        }
    }

    /**
     * Finds X-coordinate to display SuggestionsPopUp in CommandBox
     */
    double findDisplayPositionX(double caretPositionX) {
        return commandBox.getRoot().getLayoutX() + commandTextArea.getInsets().getLeft() + caretPositionX;
    }

    /**
     * Finds Y-coordinate to display SuggestionsPopUp in CommandBox
     */
    double findDisplayPositionY(double caretPositionY) {
        return Math.min(-commandTextArea.getHeight() + commandTextArea.getInsets().getTop()
                + commandTextArea.getInsets().getBottom() + caretPositionY, -commandTextArea.getInsets().getBottom());
    }

    /**
     * Adds a suggestion to suggestion list
     */
    private void addSuggestion(String suggestion) {
        MenuItem item = new MenuItem(suggestion);
        textInputProcessor.setContent(commandTextArea.getText());
        item.setOnAction(event -> commandBox.replaceText(textInputProcessor.replaceLastWord(item.getText())));
        getItems().add(item);
    }
}
