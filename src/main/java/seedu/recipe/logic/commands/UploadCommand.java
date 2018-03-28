//@@author nicholasangcx
package seedu.recipe.logic.commands;

import static seedu.recipe.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.recipe.ui.util.CloudStorageUtil.ACCESS_TOKEN;
import static seedu.recipe.ui.util.CloudStorageUtil.APP_KEY;
import static seedu.recipe.ui.util.CloudStorageUtil.APP_SECRET;
import static seedu.recipe.ui.util.CloudStorageUtil.RECIPE_BOOK_FILE;
import static seedu.recipe.ui.util.CloudStorageUtil.CLIENT_IDENTIFIER;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWebAuth;
import com.dropbox.core.v2.DbxClientV2;
import com.google.common.base.Strings;

import seedu.recipe.commons.util.FileUtil;
import seedu.recipe.logic.commands.exceptions.UploadCommandException;
import seedu.recipe.ui.util.CloudStorageUtil;

/**
 * Uploads all recipes online, specifically to Dropbox.
 */
public class UploadCommand extends Command {

    public static final String COMMAND_WORD = "upload";
    public static final String MESSAGE_SUCCESS = "Upload success!";
    public static final String MESSAGE_FAILURE = "Failed to upload!";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Uploads all recipes to your Dropbox with the "
            + "specified filename, with no spaces. It will only take in the first parameter. Filename cannot start "
            + "with blackslash or frontslash or have two slashes consecutively.\n"
            + "Parameters: KEYWORD\n"
            + "Example: " + COMMAND_WORD + " RecipeBook";


    private final String xmlExtensionFilename;

    /**
     * Creates an UploadCommand to upload recipebook.xml to Dropbox with the
     * specified {@code String XmlExtensionFilename}
     */
    public UploadCommand(String xmlExtensionFilename) {
        this.xmlExtensionFilename = xmlExtensionFilename;
    }

    @Override
    public CommandResult execute() throws UploadCommandException {
        if (Strings.isNullOrEmpty(ACCESS_TOKEN)) {
            getDbAuthorization();
        }
        CommandResult result = upload();
        return result;
    }

    /**
     * Creates a Dropbox client with the user's {@code ACCESS_TOKEN}
     * and uploads file specified by {@code RECIPE_BOOK_FILE} to their Dropbox account
     * @return {@code CommandResult}
     * @throws DbxException
     */
    private CommandResult upload() throws UploadCommandException {
        // Create Dropbox client
        DbxRequestConfig config = DbxRequestConfig.newBuilder(CLIENT_IDENTIFIER).build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        // Upload "recipebook.xml" to Dropbox
        try (InputStream in = new FileInputStream(RECIPE_BOOK_FILE)) {
            client.files().uploadBuilder("/" + xmlExtensionFilename)
                    .withAutorename(true)
                    .uploadAndFinish(in);
        } catch (IOException e) {
            return new CommandResult(MESSAGE_FAILURE);
        } catch (DbxException dbe) {
            throw new UploadCommandException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, MESSAGE_USAGE));
        }
        return new CommandResult(MESSAGE_SUCCESS);
    }

    private void getDbAuthorization() {
        // Read app info file (contains app key and app secret)
        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);

        // Run through Dropbox API authorization process
        DbxRequestConfig requestConfig = new DbxRequestConfig("ReciRecipe");
        DbxWebAuth webAuth = new DbxWebAuth(requestConfig, appInfo);

        DbxWebAuth.Request webAuthRequest = DbxWebAuth.newRequestBuilder()
                .withNoRedirect()
                .withForceReapprove(Boolean.FALSE)
                .build();

        String authorizationUrl = webAuth.authorize(webAuthRequest);
        System.out.println(authorizationUrl);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof UploadCommand // instanceof handles nulls
                && xmlExtensionFilename.equals(((UploadCommand) other).xmlExtensionFilename));
    }
}
//@@author
