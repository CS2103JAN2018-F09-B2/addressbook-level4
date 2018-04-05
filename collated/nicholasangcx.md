# nicholasangcx
###### /build/reports/jacoco/coverage/html/seedu.recipe.commons.events.ui/UploadRecipesEvent.java.html
``` html
package seedu.recipe.commons.events.ui;

import seedu.recipe.commons.events.BaseEvent;

/**
 * Indicates a request to upload recipes to Dropbox
 */
<span class="fc" id="L9">public class UploadRecipesEvent extends BaseEvent {</span>

    @Override
    public String toString() {
<span class="fc" id="L13">        return this.getClass().getSimpleName();</span>
    }
}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.model.tag/TagContainsKeywordsPredicate.java.html
``` html
package seedu.recipe.model.tag;

import java.util.List;
import java.util.function.Predicate;

import seedu.recipe.model.recipe.Recipe;

/**
 * Tests that a {@code Recipe}'s {@code Tags} matches any of the keywords given.
 */
public class TagContainsKeywordsPredicate implements Predicate&lt;Recipe&gt; {
    private final List&lt;String&gt; keywords;

<span class="fc" id="L15">    public TagContainsKeywordsPredicate(List&lt;String&gt; keywords) {</span>
<span class="fc" id="L16">        this.keywords = keywords;</span>
<span class="fc" id="L17">    }</span>

    @Override
    public boolean test(Recipe recipe) {
        /*figure out why cannot work
           return keywords.stream()
                    .anyMatch(keyword -&gt; Recipe.getTags().contains(keyword));

         */
<span class="fc" id="L26">        return keywords.stream()</span>
<span class="fc" id="L27">                    .anyMatch(keyword -&gt; recipe.getTags().stream()</span>
                        .anyMatch(tag -&gt; tag.tagName.equals(keyword)));
    }

    @Override
    public boolean equals(Object other) {
<span class="fc bfc" id="L33" title="All 4 branches covered.">        return other == this // short circuit if same object</span>
                || (other instanceof TagContainsKeywordsPredicate // instanceof handles nulls
<span class="fc bfc" id="L35" title="All 2 branches covered.">                &amp;&amp; this.keywords.equals(((TagContainsKeywordsPredicate) other).keywords)); // state check</span>
    }

}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.parser/UploadCommandParser.java.html
``` html
package seedu.recipe.logic.parser;

import static seedu.recipe.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.recipe.commons.exceptions.IllegalValueException;
import seedu.recipe.logic.commands.UploadCommand;
import seedu.recipe.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new UploadCommand object
 */
<span class="fc" id="L13">public class UploadCommandParser implements Parser&lt;UploadCommand&gt; {</span>

    /**
     * Parses the given {@code String} of arguments in the context of the UploadCommand
     * and returns an UploadCommand object for execution.
     *
     * @throws ParseException if the user input does not conform the expected format
     */
    public UploadCommand parse(String args) throws ParseException {
<span class="fc" id="L22">        String trimmedArgs = args.trim();</span>
<span class="fc" id="L23">        String[] tagKeywords = trimmedArgs.split(&quot;\\s+&quot;);</span>
<span class="fc" id="L24">        String filename = tagKeywords[0];</span>
<span class="fc bfc" id="L25" title="All 2 branches covered.">        if (filename.isEmpty()) {</span>
<span class="fc" id="L26">            throw new ParseException(</span>
<span class="fc" id="L27">                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, UploadCommand.MESSAGE_USAGE));</span>
        }
        try {
<span class="fc" id="L30">            String xmlExtensionFilename = ParserUtil.parseFilename(filename);</span>
<span class="fc" id="L31">            return new UploadCommand(xmlExtensionFilename);</span>
<span class="fc" id="L32">        } catch (IllegalValueException ive) {</span>
<span class="fc" id="L33">            throw new ParseException(</span>
<span class="fc" id="L34">                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, UploadCommand.MESSAGE_USAGE));</span>
        }
    }
}
//@author
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.parser/TagCommandParser.java.html
``` html
package seedu.recipe.logic.parser;

import static seedu.recipe.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import java.util.Arrays;

import seedu.recipe.logic.commands.TagCommand;
import seedu.recipe.logic.parser.exceptions.ParseException;
import seedu.recipe.model.tag.TagContainsKeywordsPredicate;


/**
 * Parses input arguments and creates a new TagCommand object
 */
<span class="fc" id="L16">public class TagCommandParser implements Parser&lt;TagCommand&gt; {</span>

    private static final String REGEX = &quot;\\s+&quot;;

    /**
     * Parses the given {@code String} of arguments in the context of the TagCommand
     * and returns an TagCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public TagCommand parse(String args) throws ParseException {
<span class="fc" id="L26">        String trimmedArgs = args.trim();</span>
<span class="fc bfc" id="L27" title="All 2 branches covered.">        if (trimmedArgs.isEmpty()) {</span>
<span class="fc" id="L28">            throw new ParseException(</span>
<span class="fc" id="L29">                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, TagCommand.MESSAGE_USAGE));</span>
        }

<span class="fc" id="L32">        String[] tagKeywords = trimmedArgs.split(REGEX);</span>

<span class="fc" id="L34">        return new TagCommand(new TagContainsKeywordsPredicate(Arrays.asList(tagKeywords)), tagKeywords);</span>
    }

}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.parser/ParserUtil.java.html
``` html
    /**
     * Parses {@code String filename} into a {@code String XmlExtensionFilename}.
     * A .xml extension will be added to the original filename.
     *
     * @throws IllegalValueException if the give {@code filename} is invalid.
     */
    public static String parseFilename(String filename) throws IllegalValueException {
<span class="fc" id="L454">        requireNonNull(filename);</span>
<span class="fc bfc" id="L455" title="All 2 branches covered.">        if (!Filename.isValidFilename(filename)) {</span>
<span class="fc" id="L456">            throw new IllegalValueException(Filename.MESSAGE_FILENAME_CONSTRAINTS);</span>
        }
<span class="fc" id="L458">        return filename + &quot;.xml&quot;;</span>
    }
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui.util/CloudStorageUtil.java.html
``` html
package seedu.recipe.ui.util;

import static java.util.Objects.requireNonNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.DbxAuthFinish;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWebAuth;
import com.dropbox.core.v2.DbxClientV2;

import seedu.recipe.commons.util.FileUtil;
import seedu.recipe.logic.commands.UploadCommand;

/**
 * Contains data and methods needed for cloud storage
 * (uploading to dropbox) purposes.
 */
<span class="nc" id="L25">public class CloudStorageUtil {</span>

<span class="fc" id="L27">    private static final String RECIPE_DATA_FOLDER = FileUtil.getPath(&quot;data/&quot;);</span>
<span class="fc" id="L28">    private static final File RECIPE_BOOK_FILE = new File(RECIPE_DATA_FOLDER + &quot;recipebook.xml&quot;);</span>
    private static final String CLIENT_IDENTIFIER = &quot;dropbox/recirecipe&quot;;

    private static final String APP_KEY = &quot;0kj3cb9w27d66n8&quot;;
    private static final String APP_SECRET = &quot;7stnncfsyvgim60&quot;;
    private static final String AUTHORIZATION_DOMAIN = &quot;https://www.dropbox.com/1/oauth2/authorize?&quot;;
    private static final String AUTHORIZATION_URL = AUTHORIZATION_DOMAIN + &quot;response_type=code&amp;client_id=&quot;
                                                    + APP_KEY;

<span class="fc" id="L37">    private static final DbxRequestConfig config = DbxRequestConfig.newBuilder(CLIENT_IDENTIFIER).build();</span>

<span class="fc" id="L39">    private static String accessToken = null;</span>
<span class="fc" id="L40">    private static String uploadFilename = null;</span>

    /**
     * Returns true if CloudStorageUtil already has an access token.
     */
    public static boolean hasAccessToken() {
<span class="fc bfc" id="L46" title="All 2 branches covered.">        if (accessToken == null) {</span>
<span class="fc" id="L47">            return false;</span>
        } else {
<span class="fc" id="L49">            return true;</span>
        }
    }

    /**
     * Creates a Dropbox client with the user's {@code getAccessToken()}
     * and uploads file specified by {@code RECIPE_BOOK_FILE} to their Dropbox account
     *
     * @throws DbxException
     */
    public static void upload() {
        // Ensures access token has been obtained
<span class="nc" id="L61">        requireNonNull(CloudStorageUtil.getAccessToken());</span>

        // Create Dropbox client
<span class="nc" id="L64">        DbxClientV2 client = new DbxClientV2(config, CloudStorageUtil.getAccessToken());</span>

        // Upload &quot;recipebook.xml&quot; to Dropbox
<span class="nc" id="L67">        try (InputStream in = new FileInputStream(RECIPE_BOOK_FILE)) {</span>
<span class="nc" id="L68">            client.files().uploadBuilder(&quot;/&quot; + uploadFilename)</span>
<span class="nc" id="L69">                    .withAutorename(true)</span>
<span class="nc" id="L70">                    .uploadAndFinish(in);</span>
<span class="nc" id="L71">            System.out.println(&quot;File has been uploaded&quot;);</span>
<span class="nc bnc" id="L72" title="All 8 branches missed.">        } catch (IOException | DbxException e) {</span>
<span class="nc" id="L73">            throw new AssertionError(UploadCommand.MESSAGE_FAILURE + &quot; Invalid access token.&quot;);</span>
<span class="nc" id="L74">        }</span>

<span class="nc" id="L76">    }</span>

    /**
     * Takes in the authorization code
     * @param code given by Dropbox after user has allowed access
     * and converts it into the access token that can be used to upload files
     */
    public static void processAuthorizationCode(String code) {
        // Converts authorization code to access token
<span class="fc" id="L85">        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);</span>
<span class="fc" id="L86">        DbxWebAuth webAuth = new DbxWebAuth(config, appInfo);</span>
        try {
<span class="nc" id="L88">            DbxAuthFinish authFinish = webAuth.finishFromCode(code);</span>
<span class="nc" id="L89">            accessToken = authFinish.getAccessToken();</span>
<span class="fc" id="L90">        } catch (DbxException e) {</span>
<span class="fc" id="L91">            throw new AssertionError(UploadCommand.MESSAGE_FAILURE + &quot; Invalid authorization code&quot;);</span>
<span class="nc" id="L92">        }</span>
<span class="nc" id="L93">        upload();</span>
<span class="nc" id="L94">    }</span>

    public static void setAccessToken(String token) {
<span class="fc" id="L97">        accessToken = token;</span>
<span class="fc" id="L98">    }</span>

    private static String getAccessToken() {
<span class="nc" id="L101">        return accessToken;</span>
    }

    public static void setUploadFilename(String uploadFilename) {
<span class="fc" id="L105">        CloudStorageUtil.uploadFilename = uploadFilename;</span>
<span class="fc" id="L106">    }</span>

    public static String getAuthorizationUrl() {
<span class="nc" id="L109">        return AUTHORIZATION_URL;</span>
    }
}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.commands/Command.java.html
``` html
    /**
     * Constructs a feedback message to summarise an operation that displayed
     * a listing of persons with the specified tags.
     *
     * @param displaySize indicates the number of people listed, used to generate summary
     * @param tagKeywords the tags searched for, used to generate summary
     * @return summary message for persons displayed
     */
    public static String getMessageForTagListShownSummary(int displaySize, String tagKeywords) {
<span class="fc" id="L36">        return String.format(Messages.MESSAGE_RECIPES_WITH_TAGS_LISTED_OVERVIEW, displaySize, tagKeywords);</span>
    }
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.commands/TagCommand.java.html
``` html
package seedu.recipe.logic.commands;

import java.util.Arrays;

import seedu.recipe.model.tag.TagContainsKeywordsPredicate;

/**
 * Finds and lists all recipes in address book whose tag contains any of the argument keywords.
 * Keyword matching is case sensitive.
 */
public class TagCommand extends Command {

    public static final String COMMAND_WORD = &quot;tag&quot;;

    public static final String MESSAGE_USAGE = COMMAND_WORD + &quot;: Finds all recipes whose tags contain any of &quot;
            + &quot;the specified keywords (case-sensitive) and displays them as a list with index numbers.\n&quot;
            + &quot;Parameters: KEYWORD [MORE_KEYWORDS]...\n&quot;
            + &quot;Example: &quot; + COMMAND_WORD + &quot; favourite&quot;;

    // Contains a list of strings of the keywords
    private final TagContainsKeywordsPredicate predicate;
    private final String[] tagKeywords;

<span class="fc" id="L25">    public TagCommand(TagContainsKeywordsPredicate predicate, String[] tagKeywords) {</span>
<span class="fc" id="L26">        this.predicate = predicate;</span>
<span class="fc" id="L27">        this.tagKeywords = tagKeywords;</span>
<span class="fc" id="L28">    }</span>

    @Override
    public CommandResult execute() {
<span class="fc" id="L32">        model.updateFilteredRecipeList(predicate);</span>
<span class="fc" id="L33">        return new CommandResult(getMessageForTagListShownSummary</span>
<span class="fc" id="L34">                                    (model.getFilteredRecipeList().size(), Arrays.toString(tagKeywords)));</span>
    }

    @Override
    public boolean equals(Object other) {
<span class="fc bfc" id="L39" title="All 4 branches covered.">        return other == this // short circuit if same object</span>
                || (other instanceof TagCommand // instanceof handles nulls
<span class="fc bfc" id="L41" title="All 2 branches covered.">                &amp;&amp; this.predicate.equals(((TagCommand) other).predicate)); // state check</span>
    }
}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.commands/AccessTokenCommand.java.html
``` html
package seedu.recipe.logic.commands;

import seedu.recipe.ui.util.CloudStorageUtil;

/**
 * Takes in the access token given by dropbox and saves it in the app
 * to allow user to upload files easily.
 */
public class AccessTokenCommand extends Command {

    public static final String COMMAND_WORD = &quot;token&quot;;
    public static final String MESSAGE_SUCCESS = &quot;Upload Success!&quot;;
    public static final String MESSAGE_USAGE = COMMAND_WORD + &quot;: Takes in the access token given by Dropbox &quot;
            + &quot;to allow user to upload files. *ONLY use this command directly after the upload command.*\n&quot;
            + &quot;Parameters: TOKEN\n&quot;
            + &quot;Example: &quot; + COMMAND_WORD + &quot;VALID_ACCESS_TOKEN&quot;;

    private final String accessCode;

<span class="fc" id="L21">    public AccessTokenCommand(String code) {</span>
<span class="fc" id="L22">        this.accessCode = code;</span>
<span class="fc" id="L23">    }</span>

    @Override
    public CommandResult execute() {
<span class="nc" id="L27">        CloudStorageUtil.processAuthorizationCode(accessCode);</span>
<span class="nc" id="L28">        return new CommandResult(MESSAGE_SUCCESS);</span>
    }

    @Override
    public boolean equals(Object other) {
<span class="fc bfc" id="L33" title="All 4 branches covered.">        return other == this // short circuit if same object</span>
                || (other instanceof AccessTokenCommand // instanceof handles nulls
<span class="fc bfc" id="L35" title="All 2 branches covered.">                &amp;&amp; accessCode.equals(((AccessTokenCommand) other).accessCode));</span>
    }
}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.commands/UploadCommand.java.html
``` html
package seedu.recipe.logic.commands;

import static seedu.recipe.storage.model.Filename.MESSAGE_FILENAME_CONSTRAINTS;

import seedu.recipe.commons.core.EventsCenter;
import seedu.recipe.commons.events.ui.UploadRecipesEvent;
import seedu.recipe.ui.util.CloudStorageUtil;

/**
 * Uploads all recipes online, specifically to Dropbox.
 */
public class UploadCommand extends Command {

    public static final String COMMAND_WORD = &quot;upload&quot;;
    public static final String MESSAGE_SUCCESS = &quot;Upload Success!&quot;;
    public static final String MESSAGE_FAILURE = &quot;Failed to upload!&quot;;
    public static final String MESSAGE_ACCESS_TOKEN = &quot;Copy and paste the code given by dropbox.\n&quot;
            + &quot;Example: token VALID_ACCESS_TOKEN&quot;;

    public static final String MESSAGE_USAGE = COMMAND_WORD + &quot;: Uploads all recipes to your Dropbox with the &quot;
            + &quot;specified filename, with no spaces. It will only take in the first parameter. &quot;
            + MESSAGE_FILENAME_CONSTRAINTS + &quot;\n&quot;
            + &quot;Parameters: KEYWORD\n&quot;
            + &quot;Example: &quot; + COMMAND_WORD + &quot; RecipeBook&quot;;

    private final String xmlExtensionFilename;

    /**
     * Creates an UploadCommand to upload recipebook.xml to Dropbox with the
     * specified {@code String XmlExtensionFilename}
     */
<span class="fc" id="L33">    public UploadCommand(String xmlExtensionFilename) {</span>
<span class="fc" id="L34">        this.xmlExtensionFilename = xmlExtensionFilename;</span>
<span class="fc" id="L35">        CloudStorageUtil.setUploadFilename(xmlExtensionFilename);</span>
<span class="fc" id="L36">    }</span>

    @Override
    public CommandResult execute() {
<span class="pc bpc" id="L40" title="1 of 2 branches missed.">        if (CloudStorageUtil.hasAccessToken()) {</span>
<span class="nc" id="L41">            CloudStorageUtil.upload();</span>
<span class="nc" id="L42">            return new CommandResult(MESSAGE_SUCCESS);</span>
        }
<span class="fc" id="L44">        EventsCenter.getInstance().post(new UploadRecipesEvent());</span>
<span class="fc" id="L45">        return new CommandResult(MESSAGE_ACCESS_TOKEN);</span>
    }

    @Override
    public boolean equals(Object other) {
<span class="fc bfc" id="L50" title="All 4 branches covered.">        return other == this // short circuit if same object</span>
                || (other instanceof UploadCommand // instanceof handles nulls
<span class="fc bfc" id="L52" title="All 2 branches covered.">                &amp;&amp; xmlExtensionFilename.equals(((UploadCommand) other).xmlExtensionFilename));</span>
    }
}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui/BrowserPanel.java.html
``` html
    @Subscribe
    private void handleUploadRecipesEvent(UploadRecipesEvent event) {
<span class="nc" id="L174">        loadPageExternalBrowser(CloudStorageUtil.getAuthorizationUrl());</span>
<span class="nc" id="L175">    }</span>
```
###### /src/test/java/seedu/recipe/ui/testutil/CloudStorageUtilTest.java
``` java
package seedu.recipe.ui.testutil;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import seedu.recipe.ui.util.CloudStorageUtil;

public class CloudStorageUtilTest {

    private static final String WRONG_AUTHORIZATION_CODE = "abcdefg";
    private static final String ACCESS_TOKEN_STUB = "adjhsj";

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void hasAccessToken() {
        CloudStorageUtil.setAccessToken(null);
        assertFalse(CloudStorageUtil.hasAccessToken());

        CloudStorageUtil.setAccessToken(ACCESS_TOKEN_STUB);
        assertTrue(CloudStorageUtil.hasAccessToken());
    }

    @Test
    public void processInvalidAuthorizationCode() {
        thrown.expect(AssertionError.class);
        CloudStorageUtil.processAuthorizationCode(WRONG_AUTHORIZATION_CODE);
        assertFalse(CloudStorageUtil.hasAccessToken());
    }
}
```
###### /src/test/java/seedu/recipe/logic/parser/TagCommandParserTest.java
``` java
package seedu.recipe.logic.parser;

import static seedu.recipe.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.recipe.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.recipe.logic.parser.CommandParserTestUtil.assertParseSuccess;

import java.util.Arrays;

import org.junit.Test;

import seedu.recipe.logic.commands.TagCommand;
import seedu.recipe.model.tag.TagContainsKeywordsPredicate;

public class TagCommandParserTest {

    private TagCommandParser parser = new TagCommandParser();

    @Test
    public void parseEmptyArgThrowsParseException() {
        assertParseFailure(parser, "     ", String.format(MESSAGE_INVALID_COMMAND_FORMAT, TagCommand.MESSAGE_USAGE));
    }

    @Test
    public void parseValidArgsReturnsTagCommand() {
        // no leading and trailing whitespaces
        TagCommand expectedTagCommand =
                new TagCommand(new TagContainsKeywordsPredicate(Arrays.asList("friends", "owesMoney")),
                                    new String[] {"friends", "owesMoney"});
        assertParseSuccess(parser, "friends owesMoney", expectedTagCommand);

        // multiple whitespaces between keywords
        assertParseSuccess(parser, " \n friends \n \t owesMoney  \t", expectedTagCommand);
    }
}
```
###### /src/test/java/seedu/recipe/logic/parser/RecipeBookParserTest.java
``` java
    @Test
    public void parseCommand_tag() throws Exception {
        List<String> keywords = Arrays.asList("friends", "family", "owesMoney");
        TagCommand command = (TagCommand) parser.parseCommand(
                TagCommand.COMMAND_WORD + " " + keywords.stream().collect(Collectors.joining(" ")));
        assertEquals(new TagCommand(new TagContainsKeywordsPredicate(keywords),
                keywords.toArray(new String[0])), command);
    }

    @Test
    public void parseCommand_upload() throws Exception {
        String filename = "RecipeBook";
        UploadCommand command = (UploadCommand) parser.parseCommand(
                UploadCommand.COMMAND_WORD + " " + filename);
        assertEquals(new UploadCommand(filename + ".xml"), command);
    }
```
###### /src/test/java/seedu/recipe/logic/parser/AccessTokenCommandParserTest.java
``` java
package seedu.recipe.logic.parser;

import static seedu.recipe.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.recipe.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.recipe.logic.parser.CommandParserTestUtil.assertParseSuccess;

import org.junit.Test;

import seedu.recipe.logic.commands.AccessTokenCommand;

public class AccessTokenCommandParserTest {

    private static final String DUMMY_ACCESS_CODE = "valid_access_code";
    private AccessTokenCommandParser parser = new AccessTokenCommandParser();

    @Test
    public void parseEmptyArgThrowsParseException() {
        assertParseFailure(parser, "     ", String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                AccessTokenCommand.MESSAGE_USAGE));
    }

    @Test
    public void parseValidArgsReturnsUploadCommand() {
        // code taken from an actual dropbox authorization process
        AccessTokenCommand expectedAccessTokenCommand =
                new AccessTokenCommand(DUMMY_ACCESS_CODE);
        assertParseSuccess(parser, "valid_access_code", expectedAccessTokenCommand);

        // trim leading and trailing whitespaces
        assertParseSuccess(parser, "  valid_access_code  ", expectedAccessTokenCommand);
    }
}
```
###### /src/test/java/seedu/recipe/logic/parser/UploadCommandParserTest.java
``` java
package seedu.recipe.logic.parser;

import static seedu.recipe.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.recipe.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.recipe.logic.parser.CommandParserTestUtil.assertParseSuccess;

import org.junit.Test;

import seedu.recipe.logic.commands.UploadCommand;

public class UploadCommandParserTest {

    private UploadCommandParser parser = new UploadCommandParser();

    @Test
    public void parseEmptyArgThrowsParseException() {
        assertParseFailure(parser, "     ", String.format(MESSAGE_INVALID_COMMAND_FORMAT, UploadCommand.MESSAGE_USAGE));
    }

    @Test
    public void parseValidArgsReturnsUploadCommand() {
        // no leading and trailing whitespaces
        UploadCommand expectedUploadCommand =
                new UploadCommand("RecipeBook.xml");
        assertParseSuccess(parser, "RecipeBook", expectedUploadCommand);

        // ignores subsequent keywords after the first
        assertParseSuccess(parser, " \n RecipeBook \n \t otherBook \t", expectedUploadCommand);
    }

    @Test
    public void parseInvalidArgsThrowsParseException() {
        assertParseFailure(parser, "recipe/book", String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                UploadCommand.MESSAGE_USAGE));
    }
}
```
###### /src/test/java/seedu/recipe/logic/parser/ParserUtilTest.java
``` java
    @Test
    public void parseFilename_null_throwsNullPointerException() throws Exception {
        thrown.expect(NullPointerException.class);
        ParserUtil.parseFilename(null);
    }

    @Test
    public void parseFilename_invalidValue_throwsIllegalValueException() throws Exception {
        thrown.expect(IllegalValueException.class);
        ParserUtil.parseFilename(INVALID_FILENAME);
    }

    @Test
    public void parseFilename_validValueWithoutWhitespace_returnsString() throws Exception {
        String expectedFilename = VALID_FILENAME_1 + ".xml";
        assertEquals(expectedFilename, ParserUtil.parseFilename(VALID_FILENAME_1));
    }
```
###### /src/test/java/seedu/recipe/logic/commands/UploadCommandTest.java
``` java
package seedu.recipe.logic.commands;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static seedu.recipe.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.recipe.logic.commands.UploadCommand.MESSAGE_ACCESS_TOKEN;
import static seedu.recipe.testutil.TypicalRecipes.getTypicalRecipeBook;

import org.junit.Test;

import seedu.recipe.model.Model;
import seedu.recipe.model.ModelManager;
import seedu.recipe.model.UserPrefs;
import seedu.recipe.ui.util.CloudStorageUtil;

public class UploadCommandTest {

    private Model model = new ModelManager(getTypicalRecipeBook(), new UserPrefs());

    @Test
    public void equals() {
        String firstTest = "RecipeBook1";
        String secondTest = "Recipe_Book_1";

        UploadCommand uploadFirstCommand = new UploadCommand(firstTest);
        UploadCommand uploadSecondCommand = new UploadCommand(secondTest);

        // same object -> returns true
        assertTrue(uploadFirstCommand.equals(uploadFirstCommand));

        // same values -> returns true
        UploadCommand uploadFirstCommandCopy = new UploadCommand(firstTest);
        assertTrue(uploadFirstCommandCopy.equals(uploadFirstCommand));

        // different types -> returns false
        assertFalse(uploadFirstCommand.equals(1));
        assertFalse(uploadFirstCommand.equals(new HelpCommand()));
        assertFalse(uploadFirstCommand.equals("anything"));

        // null -> returns false
        assertFalse(uploadFirstCommand.equals(null));

        // different recipe -> returns false
        assertFalse(uploadFirstCommand.equals(uploadSecondCommand));
    }

    @Test
    public void execute_inputWithValidArgs_noAccessToken() {
        UploadCommand uploadCommand = new UploadCommand("recipebook.xml");
        CloudStorageUtil.setAccessToken(null);
        assertCommandSuccess(uploadCommand, model, MESSAGE_ACCESS_TOKEN, model);
    }
}
```
###### /src/test/java/seedu/recipe/logic/commands/TagCommandTest.java
``` java
package seedu.recipe.logic.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static seedu.recipe.commons.core.Messages.MESSAGE_RECIPES_WITH_TAGS_LISTED_OVERVIEW;
import static seedu.recipe.testutil.TypicalRecipes.ALICE;
import static seedu.recipe.testutil.TypicalRecipes.BENSON;
import static seedu.recipe.testutil.TypicalRecipes.CARL;
import static seedu.recipe.testutil.TypicalRecipes.getTypicalRecipeBook;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import seedu.recipe.logic.CommandHistory;
import seedu.recipe.logic.UndoRedoStack;
import seedu.recipe.model.Model;
import seedu.recipe.model.ModelManager;
import seedu.recipe.model.RecipeBook;
import seedu.recipe.model.UserPrefs;
import seedu.recipe.model.recipe.Recipe;
import seedu.recipe.model.tag.TagContainsKeywordsPredicate;

/**
 * Contains integration tests (interaction with the Model) for {@code TagCommand}.
 */

public class TagCommandTest {
    private Model model = new ModelManager(getTypicalRecipeBook(), new UserPrefs());

    @Test
    public void equals() {
        TagContainsKeywordsPredicate firstPredicate =
                new TagContainsKeywordsPredicate(Collections.singletonList("first"));
        String[] firstArray = {"first"};
        TagContainsKeywordsPredicate secondPredicate =
                new TagContainsKeywordsPredicate(Collections.singletonList("second"));
        String[] secondArray = {"second"};

        TagCommand tagFirstCommand = new TagCommand(firstPredicate, firstArray);
        TagCommand tagSecondCommand = new TagCommand(secondPredicate, secondArray);

        // same object -> returns true
        assertTrue(tagFirstCommand.equals(tagFirstCommand));

        // same values -> returns true
        TagCommand tagFirstCommandCopy = new TagCommand(firstPredicate, firstArray);
        assertTrue(tagFirstCommand.equals(tagFirstCommandCopy));

        // different types -> returns false
        assertFalse(tagFirstCommand.equals(1));

        // null -> returns false
        assertFalse(tagFirstCommand == null);

        // different recipe -> returns false
        assertFalse(tagFirstCommand.equals(tagSecondCommand));
    }

    @Test
    public void executeZeroKeywordsNoRecipeFound() {
        String userInput = " ";
        String[] keywords = userInput.split("\\s+");
        String expectedMessage = String.format(MESSAGE_RECIPES_WITH_TAGS_LISTED_OVERVIEW, 0,
                                                    Arrays.toString(keywords));
        TagCommand command = prepareCommand(" ");
        assertCommandSuccess(command, expectedMessage, Collections.emptyList());
    }

    @Test
    public void executeMultipleKeywordsMultipleRecipesFound() {
        String userInput = "family owesMoney";
        String[] keywords = userInput.split("\\s+");
        String expectedMessage = String.format(MESSAGE_RECIPES_WITH_TAGS_LISTED_OVERVIEW, 3,
                                                    Arrays.toString(keywords));
        TagCommand command = prepareCommand(userInput);
        assertCommandSuccess(command, expectedMessage, Arrays.asList(ALICE, BENSON, CARL));
    }

    /**
     * Parses {@code userInput} into a {@code TagCommand}.
     */
    private TagCommand prepareCommand(String userInput) {

        TagCommand command =
                new TagCommand(new TagContainsKeywordsPredicate(Arrays.asList(userInput.split("\\s+"))),
                                        userInput.split("\\s+"));
        command.setData(model, new CommandHistory(), new UndoRedoStack());
        return command;
    }

    /**
     * Asserts that {@code command} is successfully executed, and<br>
     *     - the command feedback is equal to {@code expectedMessage}<br>
     *     - the {@code FilteredList<Recipe>} is equal to {@code expectedList}<br>
     *     - the {@code RecipeBook} in model remains the same after executing the {@code command}
     */
    private void assertCommandSuccess(TagCommand command, String expectedMessage, List<Recipe> expectedList) {
        RecipeBook expectedRecipeBook = new RecipeBook(model.getRecipeBook());
        CommandResult commandResult = command.execute();

        assertEquals(expectedMessage, commandResult.feedbackToUser);
        assertEquals(expectedList, model.getFilteredRecipeList());
        assertEquals(expectedRecipeBook, model.getRecipeBook());
    }
}
```
###### /src/test/java/seedu/recipe/logic/commands/AccessTokenCommandTest.java
``` java
package seedu.recipe.logic.commands;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AccessTokenCommandTest {

    private static final String INVALID_AUTHORIZATION_CODE = "wrong_format";

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void equals() {
        String firstTest = "firstCode";
        String secondTest = "secondCode";

        AccessTokenCommand accessTokenFirstCommand = new AccessTokenCommand(firstTest);
        AccessTokenCommand accessTokenSecondCommand = new AccessTokenCommand(secondTest);

        // same object -> returns true
        assertTrue(accessTokenFirstCommand.equals(accessTokenFirstCommand));

        // same values -> returns true
        AccessTokenCommand accessTokenFirstCommandCopy = new AccessTokenCommand(firstTest);
        assertTrue(accessTokenFirstCommandCopy.equals(accessTokenFirstCommand));

        // different types -> returns false
        assertFalse(accessTokenFirstCommand.equals(1));
        assertFalse(accessTokenFirstCommand.equals(new HelpCommand()));
        assertFalse(accessTokenFirstCommand.equals("anything"));

        // null -> returns false
        assertFalse(accessTokenFirstCommand.equals(null));

        // different recipe -> returns false
        assertFalse(accessTokenFirstCommand.equals(accessTokenSecondCommand));
    }

    @Test
    public void execute_invalidAuthorizationCode() {
        thrown.expect(AssertionError.class);
        AccessTokenCommand command = new AccessTokenCommand(INVALID_AUTHORIZATION_CODE);
        command.execute();
    }
}
```
###### /src/test/java/seedu/recipe/storage/model/FilenameTest.java
``` java
package seedu.recipe.storage.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.recipe.testutil.Assert;

public class FilenameTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        Assert.assertThrows(NullPointerException.class, () -> new Filename(null));
    }

    @Test
    public void constructor_invalidFilename_throwsIllegalArgumentException() {
        String invalidFilename = "";
        Assert.assertThrows(IllegalArgumentException.class, () -> new Filename(invalidFilename));
    }

    @Test
    public void isValidFilename() {
        // null Filename
        Assert.assertThrows(NullPointerException.class, () -> Filename.isValidFilename(null));

        // blank Filename
        assertFalse(Filename.isValidFilename("")); // empty string
        assertFalse(Filename.isValidFilename(" ")); // spaces only

        // invalid Filename
        assertFalse(Filename.isValidFilename("test.Filename")); // invalid character .
        assertFalse(Filename.isValidFilename("test|test")); // invalid character |
        assertFalse(Filename.isValidFilename("test/filename")); // invalid character /

        // valid Filename
        assertTrue(Filename.isValidFilename("Recipe2Book")); // alphanumeric filename
        assertTrue(Filename.isValidFilename("RecipeBook(1)")); // valid characters ()
        assertTrue(Filename.isValidFilename("Recipe_Book")); // valid character _
    }
}
```
###### /src/test/java/seedu/recipe/model/tag/TagContainsKeywordsPredicateTest.java
``` java
package seedu.recipe.model.tag;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import seedu.recipe.testutil.RecipeBuilder;

public class TagContainsKeywordsPredicateTest {

    @Test
    public void equals() {
        List<String> firstPredicateKeywordList = Collections.singletonList("first");
        List<String> secondPredicateKeywordList = Arrays.asList("first", "second");

        TagContainsKeywordsPredicate firstPredicate = new TagContainsKeywordsPredicate(firstPredicateKeywordList);
        TagContainsKeywordsPredicate secondPredicate = new TagContainsKeywordsPredicate(secondPredicateKeywordList);

        // same object -> returns true
        assertTrue(firstPredicate.equals(firstPredicate));

        // same values -> returns true
        TagContainsKeywordsPredicate firstPredicateCopy = new TagContainsKeywordsPredicate(firstPredicateKeywordList);
        assertTrue(firstPredicate.equals(firstPredicateCopy));

        // different types -> returns false
        assertFalse(firstPredicate.equals(1));

        // null -> returns false
        assertFalse(firstPredicate == null);

        // different recipe -> returns false
        assertFalse(firstPredicate.equals(secondPredicate));
    }

    @Test
    public void testTagContainsKeywordsReturnsTrue() {
        // One keyword
        TagContainsKeywordsPredicate predicate = new TagContainsKeywordsPredicate(Collections.singletonList("friends"));
        assertTrue(predicate.test(new RecipeBuilder().build()));

        // Multiple keywords
        predicate = new TagContainsKeywordsPredicate(Arrays.asList("friends", "food"));
        assertTrue(predicate.test(new RecipeBuilder().withTags("friends", "food").build()));

        // Only one matching keyword
        predicate = new TagContainsKeywordsPredicate(Arrays.asList("friends", "food"));
        assertTrue(predicate.test(new RecipeBuilder().build()));
    }

    @Test
    public void testTagDoesNotContainKeywordsReturnsFalse() {
        // Zero keywords
        TagContainsKeywordsPredicate predicate = new TagContainsKeywordsPredicate(Collections.emptyList());
        assertFalse(predicate.test(new RecipeBuilder().build()));

        // Non-matching keyword
        predicate = new TagContainsKeywordsPredicate(Arrays.asList("food"));
        assertFalse(predicate.test(new RecipeBuilder().build()));

        // Keywords match phone, email, name and address, but does not match tag
        predicate = new TagContainsKeywordsPredicate(Arrays.asList
                            ("Food", "12345", "fish", "egg", "Main", "Street"));
        assertFalse(predicate.test(new RecipeBuilder().withName("Food").withPreparationTime("12345")
                .withIngredient("fish, egg").withInstruction("Main Street").build()));
    }
}
```
###### /src/main/java/seedu/recipe/ui/util/CloudStorageUtil.java
``` java
package seedu.recipe.ui.util;

import static java.util.Objects.requireNonNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.DbxAuthFinish;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWebAuth;
import com.dropbox.core.v2.DbxClientV2;

import seedu.recipe.commons.util.FileUtil;
import seedu.recipe.logic.commands.UploadCommand;

/**
 * Contains data and methods needed for cloud storage
 * (uploading to dropbox) purposes.
 */
public class CloudStorageUtil {

    private static final String RECIPE_DATA_FOLDER = FileUtil.getPath("data/");
    private static final File RECIPE_BOOK_FILE = new File(RECIPE_DATA_FOLDER + "recipebook.xml");
    private static final String CLIENT_IDENTIFIER = "dropbox/recirecipe";

    private static final String APP_KEY = "0kj3cb9w27d66n8";
    private static final String APP_SECRET = "7stnncfsyvgim60";
    private static final String AUTHORIZATION_DOMAIN = "https://www.dropbox.com/1/oauth2/authorize?";
    private static final String AUTHORIZATION_URL = AUTHORIZATION_DOMAIN + "response_type=code&client_id="
                                                    + APP_KEY;

    private static final DbxRequestConfig config = DbxRequestConfig.newBuilder(CLIENT_IDENTIFIER).build();

    private static String accessToken = null;
    private static String uploadFilename = null;

    /**
     * Returns true if CloudStorageUtil already has an access token.
     */
    public static boolean hasAccessToken() {
        if (accessToken == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Creates a Dropbox client with the user's {@code getAccessToken()}
     * and uploads file specified by {@code RECIPE_BOOK_FILE} to their Dropbox account
     *
     * @throws DbxException
     */
    public static void upload() {
        // Ensures access token has been obtained
        requireNonNull(CloudStorageUtil.getAccessToken());

        // Create Dropbox client
        DbxClientV2 client = new DbxClientV2(config, CloudStorageUtil.getAccessToken());

        // Upload "recipebook.xml" to Dropbox
        try (InputStream in = new FileInputStream(RECIPE_BOOK_FILE)) {
            client.files().uploadBuilder("/" + uploadFilename)
                    .withAutorename(true)
                    .uploadAndFinish(in);
            System.out.println("File has been uploaded");
        } catch (IOException | DbxException e) {
            throw new AssertionError(UploadCommand.MESSAGE_FAILURE + " Invalid access token.");
        }

    }

    /**
     * Takes in the authorization code
     * @param code given by Dropbox after user has allowed access
     * and converts it into the access token that can be used to upload files
     */
    public static void processAuthorizationCode(String code) {
        // Converts authorization code to access token
        DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);
        DbxWebAuth webAuth = new DbxWebAuth(config, appInfo);
        try {
            DbxAuthFinish authFinish = webAuth.finishFromCode(code);
            accessToken = authFinish.getAccessToken();
        } catch (DbxException e) {
            throw new AssertionError(UploadCommand.MESSAGE_FAILURE + " Invalid authorization code");
        }
        upload();
    }

    public static void setAccessToken(String token) {
        accessToken = token;
    }

    private static String getAccessToken() {
        return accessToken;
    }

    public static void setUploadFilename(String uploadFilename) {
        CloudStorageUtil.uploadFilename = uploadFilename;
    }

    public static String getAuthorizationUrl() {
        return AUTHORIZATION_URL;
    }
}
```
###### /src/main/java/seedu/recipe/ui/BrowserPanel.java
``` java
    @Subscribe
    private void handleUploadRecipesEvent(UploadRecipesEvent event) {
        loadPageExternalBrowser(CloudStorageUtil.getAuthorizationUrl());
    }
```
###### /src/main/java/seedu/recipe/commons/events/ui/UploadRecipesEvent.java
``` java
package seedu.recipe.commons.events.ui;

import seedu.recipe.commons.events.BaseEvent;

/**
 * Indicates a request to upload recipes to Dropbox
 */
public class UploadRecipesEvent extends BaseEvent {

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
```
###### /src/main/java/seedu/recipe/logic/parser/TagCommandParser.java
``` java
package seedu.recipe.logic.parser;

import static seedu.recipe.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import java.util.Arrays;

import seedu.recipe.logic.commands.TagCommand;
import seedu.recipe.logic.parser.exceptions.ParseException;
import seedu.recipe.model.tag.TagContainsKeywordsPredicate;


/**
 * Parses input arguments and creates a new TagCommand object
 */
public class TagCommandParser implements Parser<TagCommand> {

    private static final String REGEX = "\\s+";

    /**
     * Parses the given {@code String} of arguments in the context of the TagCommand
     * and returns an TagCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public TagCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();
        if (trimmedArgs.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, TagCommand.MESSAGE_USAGE));
        }

        String[] tagKeywords = trimmedArgs.split(REGEX);

        return new TagCommand(new TagContainsKeywordsPredicate(Arrays.asList(tagKeywords)), tagKeywords);
    }

}
```
###### /src/main/java/seedu/recipe/logic/parser/UploadCommandParser.java
``` java
package seedu.recipe.logic.parser;

import static seedu.recipe.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.recipe.commons.exceptions.IllegalValueException;
import seedu.recipe.logic.commands.UploadCommand;
import seedu.recipe.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new UploadCommand object
 */
public class UploadCommandParser implements Parser<UploadCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the UploadCommand
     * and returns an UploadCommand object for execution.
     *
     * @throws ParseException if the user input does not conform the expected format
     */
    public UploadCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();
        String[] tagKeywords = trimmedArgs.split("\\s+");
        String filename = tagKeywords[0];
        if (filename.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, UploadCommand.MESSAGE_USAGE));
        }
        try {
            String xmlExtensionFilename = ParserUtil.parseFilename(filename);
            return new UploadCommand(xmlExtensionFilename);
        } catch (IllegalValueException ive) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, UploadCommand.MESSAGE_USAGE));
        }
    }
}
//@author
```
###### /src/main/java/seedu/recipe/logic/parser/ParserUtil.java
``` java
    /**
     * Parses {@code String filename} into a {@code String XmlExtensionFilename}.
     * A .xml extension will be added to the original filename.
     *
     * @throws IllegalValueException if the give {@code filename} is invalid.
     */
    public static String parseFilename(String filename) throws IllegalValueException {
        requireNonNull(filename);
        if (!Filename.isValidFilename(filename)) {
            throw new IllegalValueException(Filename.MESSAGE_FILENAME_CONSTRAINTS);
        }
        return filename + ".xml";
    }
```
###### /src/main/java/seedu/recipe/logic/commands/Command.java
``` java
    /**
     * Constructs a feedback message to summarise an operation that displayed
     * a listing of persons with the specified tags.
     *
     * @param displaySize indicates the number of people listed, used to generate summary
     * @param tagKeywords the tags searched for, used to generate summary
     * @return summary message for persons displayed
     */
    public static String getMessageForTagListShownSummary(int displaySize, String tagKeywords) {
        return String.format(Messages.MESSAGE_RECIPES_WITH_TAGS_LISTED_OVERVIEW, displaySize, tagKeywords);
    }
```
###### /src/main/java/seedu/recipe/logic/commands/AccessTokenCommand.java
``` java
package seedu.recipe.logic.commands;

import seedu.recipe.ui.util.CloudStorageUtil;

/**
 * Takes in the access token given by dropbox and saves it in the app
 * to allow user to upload files easily.
 */
public class AccessTokenCommand extends Command {

    public static final String COMMAND_WORD = "token";
    public static final String MESSAGE_SUCCESS = "Upload Success!";
    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Takes in the access token given by Dropbox "
            + "to allow user to upload files. *ONLY use this command directly after the upload command.*\n"
            + "Parameters: TOKEN\n"
            + "Example: " + COMMAND_WORD + "VALID_ACCESS_TOKEN";

    private final String accessCode;

    public AccessTokenCommand(String code) {
        this.accessCode = code;
    }

    @Override
    public CommandResult execute() {
        CloudStorageUtil.processAuthorizationCode(accessCode);
        return new CommandResult(MESSAGE_SUCCESS);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof AccessTokenCommand // instanceof handles nulls
                && accessCode.equals(((AccessTokenCommand) other).accessCode));
    }
}
```
###### /src/main/java/seedu/recipe/logic/commands/UploadCommand.java
``` java
package seedu.recipe.logic.commands;

import static seedu.recipe.storage.model.Filename.MESSAGE_FILENAME_CONSTRAINTS;

import seedu.recipe.commons.core.EventsCenter;
import seedu.recipe.commons.events.ui.UploadRecipesEvent;
import seedu.recipe.ui.util.CloudStorageUtil;

/**
 * Uploads all recipes online, specifically to Dropbox.
 */
public class UploadCommand extends Command {

    public static final String COMMAND_WORD = "upload";
    public static final String MESSAGE_SUCCESS = "Upload Success!";
    public static final String MESSAGE_FAILURE = "Failed to upload!";
    public static final String MESSAGE_ACCESS_TOKEN = "Copy and paste the code given by dropbox.\n"
            + "Example: token VALID_ACCESS_TOKEN";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Uploads all recipes to your Dropbox with the "
            + "specified filename, with no spaces. It will only take in the first parameter. "
            + MESSAGE_FILENAME_CONSTRAINTS + "\n"
            + "Parameters: KEYWORD\n"
            + "Example: " + COMMAND_WORD + " RecipeBook";

    private final String xmlExtensionFilename;

    /**
     * Creates an UploadCommand to upload recipebook.xml to Dropbox with the
     * specified {@code String XmlExtensionFilename}
     */
    public UploadCommand(String xmlExtensionFilename) {
        this.xmlExtensionFilename = xmlExtensionFilename;
        CloudStorageUtil.setUploadFilename(xmlExtensionFilename);
    }

    @Override
    public CommandResult execute() {
        if (CloudStorageUtil.hasAccessToken()) {
            CloudStorageUtil.upload();
            return new CommandResult(MESSAGE_SUCCESS);
        }
        EventsCenter.getInstance().post(new UploadRecipesEvent());
        return new CommandResult(MESSAGE_ACCESS_TOKEN);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof UploadCommand // instanceof handles nulls
                && xmlExtensionFilename.equals(((UploadCommand) other).xmlExtensionFilename));
    }
}
```
###### /src/main/java/seedu/recipe/logic/commands/TagCommand.java
``` java
package seedu.recipe.logic.commands;

import java.util.Arrays;

import seedu.recipe.model.tag.TagContainsKeywordsPredicate;

/**
 * Finds and lists all recipes in address book whose tag contains any of the argument keywords.
 * Keyword matching is case sensitive.
 */
public class TagCommand extends Command {

    public static final String COMMAND_WORD = "tag";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Finds all recipes whose tags contain any of "
            + "the specified keywords (case-sensitive) and displays them as a list with index numbers.\n"
            + "Parameters: KEYWORD [MORE_KEYWORDS]...\n"
            + "Example: " + COMMAND_WORD + " favourite";

    // Contains a list of strings of the keywords
    private final TagContainsKeywordsPredicate predicate;
    private final String[] tagKeywords;

    public TagCommand(TagContainsKeywordsPredicate predicate, String[] tagKeywords) {
        this.predicate = predicate;
        this.tagKeywords = tagKeywords;
    }

    @Override
    public CommandResult execute() {
        model.updateFilteredRecipeList(predicate);
        return new CommandResult(getMessageForTagListShownSummary
                                    (model.getFilteredRecipeList().size(), Arrays.toString(tagKeywords)));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof TagCommand // instanceof handles nulls
                && this.predicate.equals(((TagCommand) other).predicate)); // state check
    }
}
```
###### /src/main/java/seedu/recipe/model/tag/TagContainsKeywordsPredicate.java
``` java
package seedu.recipe.model.tag;

import java.util.List;
import java.util.function.Predicate;

import seedu.recipe.model.recipe.Recipe;

/**
 * Tests that a {@code Recipe}'s {@code Tags} matches any of the keywords given.
 */
public class TagContainsKeywordsPredicate implements Predicate<Recipe> {
    private final List<String> keywords;

    public TagContainsKeywordsPredicate(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean test(Recipe recipe) {
        /*figure out why cannot work
           return keywords.stream()
                    .anyMatch(keyword -> Recipe.getTags().contains(keyword));

         */
        return keywords.stream()
                    .anyMatch(keyword -> recipe.getTags().stream()
                        .anyMatch(tag -> tag.tagName.equals(keyword)));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof TagContainsKeywordsPredicate // instanceof handles nulls
                && this.keywords.equals(((TagContainsKeywordsPredicate) other).keywords)); // state check
    }

}
```
