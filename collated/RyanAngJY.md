# RyanAngJY
###### /build/reports/jacoco/coverage/html/seedu.recipe.model.util/HtmlFormatter.java.html
``` html
package seedu.recipe.model.util;

import static seedu.recipe.ui.UiPart.FXML_FILE_FOLDER;

import java.net.URL;

import seedu.recipe.MainApp;
import seedu.recipe.model.recipe.Recipe;

/**
 * HTML formatter for Recipe class.
 */
<span class="nc" id="L14">public class HtmlFormatter {</span>

    public static String getHtmlFormat (Recipe recipe) {

<span class="fc" id="L18">        URL recipeCss = MainApp.class.getResource(FXML_FILE_FOLDER + &quot;Recipe.css&quot;);</span>
<span class="fc" id="L19">        URL bootstrapCss = MainApp.class.getResource(FXML_FILE_FOLDER + &quot;bootstrap.css&quot;);</span>

<span class="fc" id="L21">        String name = recipe.getName().toString();</span>
<span class="fc" id="L22">        String cookingTime = recipe.getCookingTime().toString();</span>
<span class="fc" id="L23">        String preparationTime = recipe.getPreparationTime().toString();</span>
<span class="fc" id="L24">        String calories = recipe.getCalories().toString();</span>
<span class="fc" id="L25">        String servings = recipe.getServings().toString();</span>
<span class="fc" id="L26">        String image = recipe.getImage().getUsablePath();</span>
<span class="fc" id="L27">        String ingredient = recipe.getIngredient().toString();</span>
<span class="fc" id="L28">        String instruction = recipe.getInstruction().toString();</span>

<span class="fc" id="L30">        return &quot;&lt;html&gt;&quot;</span>
                + &quot;&lt;head&gt;&quot;
<span class="fc" id="L32">                + &quot;&lt;link rel='stylesheet' type='text/css' href='&quot; + bootstrapCss.toExternalForm() + &quot;' /&gt;&quot;</span>
<span class="fc" id="L33">                + &quot;&lt;link rel='stylesheet' type='text/css' href='&quot; + recipeCss.toExternalForm() + &quot;' /&gt;&quot;</span>
                + &quot;&lt;/head&gt;&quot;
                + &quot;&lt;body&gt;&quot;
                + &quot;&lt;div class='row'&gt;&quot;
                + &quot;&lt;h1 class='name'&gt;&quot; + name + &quot;&lt;/h1&gt;&quot;
                + &quot;&lt;div class='col-sm-6'&gt;&quot;
                + &quot;&lt;div class='col-sm-3'&gt;&quot;
                + &quot;&lt;h5&gt;Cooking Time:&lt;/h5&gt;&quot;
                + &quot;&lt;p&gt;&quot; + cookingTime + &quot;&lt;/p&gt;&quot;
                + &quot;&lt;/div&gt;&quot;
                + &quot;&lt;div class='col-sm-3'&gt;&quot;
                + &quot;&lt;h5&gt;Preparation Time:&lt;/h5&gt;&quot;
                + &quot;&lt;p&gt;&quot; + preparationTime + &quot;&lt;/p&gt;&quot;
                + &quot;&lt;/div&gt;&quot;
                + &quot;&lt;div class='col-sm-3'&gt;&quot;
                + &quot;&lt;h5&gt;Calories:&lt;/h5&gt;&quot;
                + &quot;&lt;p&gt;&quot; + calories + &quot;&lt;/p&gt;&quot;
                + &quot;&lt;/div&gt;&quot;
                + &quot;&lt;div class='col-sm-3'&gt;&quot;
                + &quot;&lt;h5&gt;Servings:&lt;/h5&gt;&quot;
                + &quot;&lt;p&gt;&quot; + servings + &quot;&lt;/p&gt;&quot;
                + &quot;&lt;/div&gt;&quot;
                + &quot;&lt;/div&gt;&quot;
                + &quot;&lt;div class='col-sm-6'&gt;&quot;
                + &quot;&lt;img src='&quot; + image + &quot;' /&gt;&quot;
                + &quot;&lt;/div&gt;&quot;
                + &quot;&lt;div class='col-sm-12'&gt;&quot;
                + &quot;&lt;div class='col-sm-12'&gt;&quot;
                + &quot;&lt;h5&gt;Ingredients:&lt;/h5&gt;&quot;
                + &quot;&lt;p&gt;&quot; + ingredient + &quot;&lt;/p&gt;&quot;
                + &quot;&lt;/div&gt;&quot;
                + &quot;&lt;div class='col-sm-12'&gt;&quot;
                + &quot;&lt;h5&gt;Instructions:&lt;/h5&gt;&quot;
                + &quot;&lt;p&gt;&quot; + instruction + &quot;&lt;/p&gt;&quot;
                + &quot;&lt;/div&gt;&quot;
                + &quot;&lt;/div&gt;&quot;
                + &quot;&lt;/div&gt;&quot;
                + &quot;&lt;/body&gt;&quot;
                + &quot;&lt;/html&gt;&quot;;
    }
}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.model.recipe/Image.java.html
``` html
package seedu.recipe.model.recipe;

import static java.util.Objects.requireNonNull;
import static seedu.recipe.commons.util.AppUtil.checkArgument;

import java.io.File;
import java.net.URL;

import seedu.recipe.MainApp;

/**
 * Represents a Recipe's image in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidImage(String)}
 */
public class Image {

    public static final String NULL_IMAGE_REFERENCE = &quot;-&quot;;
    public static final String FILE_PREFIX = &quot;file:&quot;;
    public static final String MESSAGE_IMAGE_CONSTRAINTS = &quot;Image path should be valid&quot;;
<span class="fc" id="L21">    public static final URL VALID_IMAGE = MainApp.class.getResource(&quot;/images/clock.png&quot;);</span>
<span class="fc" id="L22">    public static final String VALID_IMAGE_PATH = VALID_IMAGE.toExternalForm().substring(5);</span>
    public final String value;

    /**
     * Constructs a {@code Image}.
     *
     * @param imagePath A valid file path.
     */
<span class="fc" id="L30">    public Image(String imagePath) {</span>
<span class="fc" id="L31">        requireNonNull(imagePath);</span>
<span class="fc" id="L32">        checkArgument(isValidImage(imagePath), MESSAGE_IMAGE_CONSTRAINTS);</span>
<span class="fc" id="L33">        this.value = imagePath;</span>
<span class="fc" id="L34">    }</span>

    /**
     *  Returns true if a given string is a valid file path, or no file path has been assigned
     */
    public static boolean isValidImage(String testImagePath) {
<span class="fc bfc" id="L40" title="All 2 branches covered.">        if (testImagePath.equals(NULL_IMAGE_REFERENCE)) {</span>
<span class="fc" id="L41">            return true;</span>
        }
<span class="fc" id="L43">        File image = new File(testImagePath);</span>
<span class="pc bpc" id="L44" title="1 of 4 branches missed.">        if (image.exists() &amp;&amp; !image.isDirectory()) {</span>
<span class="fc" id="L45">            return true;</span>
        }
<span class="fc" id="L47">        return false;</span>
    }

    public String getUsablePath() {
<span class="fc" id="L51">        return FILE_PREFIX + value;</span>
    }

    @Override
    public String toString() {
<span class="fc" id="L56">        return value;</span>
    }

    @Override
    public boolean equals(Object other) {
<span class="pc bpc" id="L61" title="1 of 4 branches missed.">        return other == this // short circuit if same object</span>
                || (other instanceof Image // instanceof handles nulls
<span class="pc bpc" id="L63" title="1 of 2 branches missed.">                &amp;&amp; this.value.equals(((Image) other).value)); // state check</span>
    }

    @Override
    public int hashCode() {
<span class="nc" id="L68">        return value.hashCode();</span>
    }
}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.model.recipe/Url.java.html
``` html
package seedu.recipe.model.recipe;

import static java.util.Objects.requireNonNull;
import static seedu.recipe.commons.util.AppUtil.checkArgument;

import java.net.URL;

/**
 * Represents a Recipe's URL in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidUrl(String)}
 */
public class Url {

    public static final String NULL_URL_REFERENCE = &quot;-&quot;;
    public static final String MESSAGE_URL_CONSTRAINTS = &quot;URL should start with a http:// or https://&quot;;
    public final String value;

    /**
     * Constructs a {@code Url}.
     *
     * @param url A valid Url.
     */
<span class="fc" id="L24">    public Url(String url) {</span>
<span class="fc" id="L25">        requireNonNull(url);</span>
<span class="fc" id="L26">        checkArgument(isValidUrl(url), MESSAGE_URL_CONSTRAINTS);</span>
<span class="fc" id="L27">        this.value = url;</span>
<span class="fc" id="L28">    }</span>

    /**
     *  Returns true if a given string is a valid web url, or no url has been assigned
     */
    public static boolean isValidUrl(String testUrl) {
<span class="fc bfc" id="L34" title="All 2 branches covered.">        if (testUrl.equals(NULL_URL_REFERENCE)) {</span>
<span class="fc" id="L35">            return true;</span>
        }
        try {
<span class="fc" id="L38">            URL url = new URL(testUrl);</span>
<span class="fc" id="L39">            url.toURI();</span>
<span class="fc" id="L40">            return true;</span>
<span class="fc" id="L41">        } catch (Exception e) {</span>
<span class="fc" id="L42">            return false;</span>
        }
    }

    @Override
    public String toString() {
<span class="fc" id="L48">        return value;</span>
    }

    @Override
    public boolean equals(Object other) {
<span class="pc bpc" id="L53" title="1 of 4 branches missed.">        return other == this // short circuit if same object</span>
                || (other instanceof Url // instanceof handles nulls
<span class="fc bfc" id="L55" title="All 2 branches covered.">                &amp;&amp; this.value.equals(((Url) other).value)); // state check</span>
    }

    @Override
    public int hashCode() {
<span class="nc" id="L60">        return value.hashCode();</span>
    }
}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.model.recipe/Recipe.java.html
``` html
    public String getTextFormattedRecipe() {
<span class="fc" id="L105">        return NAME_HEADER + getName() + LINE_BREAK</span>
<span class="fc" id="L106">                + INGREDIENTS_HEADER + getIngredient() + LINE_BREAK</span>
<span class="fc" id="L107">                + INSTRUCTIONS_HEADER + getInstruction() + LINE_BREAK;</span>
    }
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.commons.events.ui/ShareRecipeEvent.java.html
``` html
/**
 * Indicates a request to share a recipe
 */
public class ShareRecipeEvent extends BaseEvent {

    public final int targetIndex;
    public final Recipe recipe;

<span class="fc" id="L16">    public ShareRecipeEvent(Index targetIndex, Recipe recipeToShare) {</span>
<span class="fc" id="L17">        this.targetIndex = targetIndex.getZeroBased();</span>
<span class="fc" id="L18">        this.recipe = recipeToShare;</span>
<span class="fc" id="L19">    }</span>

    @Override
    public String toString() {
<span class="fc" id="L23">        return this.getClass().getSimpleName();</span>
    }

    public Recipe getTargetRecipe() {
<span class="nc" id="L27">        return recipe;</span>
    }
}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.parser/ShareCommandParser.java.html
``` html
/**
 * Parses input arguments and creates a new ShareCommand object
 */
<span class="fc" id="L14">public class ShareCommandParser implements Parser&lt;ShareCommand&gt; {</span>

    /**
     * Parses the given {@code String} of arguments in the context of the ShareCommand
     * and returns an ShareCommand object for execution.
     * @throws ParseException if the user input does not conform to the expected format
     */
    public ShareCommand parse(String args) throws ParseException {
        try {
<span class="fc" id="L23">            Index index = ParserUtil.parseIndex(args);</span>
<span class="fc" id="L24">            return new ShareCommand(index);</span>
<span class="fc" id="L25">        } catch (IllegalValueException ive) {</span>
<span class="fc" id="L26">            throw new ParseException(</span>
<span class="fc" id="L27">                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, ShareCommand.MESSAGE_USAGE));</span>
        }
    }
}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.parser/ParserUtil.java.html
``` html
    /**
     * Parses a {@code String url} into an {@code Url}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code url} is invalid.
     */
    public static Url parseUrl(String url) throws IllegalValueException {
<span class="fc" id="L351">        requireNonNull(url);</span>
<span class="fc" id="L352">        String trimmedUrl = url.trim();</span>
<span class="fc bfc" id="L353" title="All 2 branches covered.">        if (!Url.isValidUrl(trimmedUrl)) {</span>
<span class="fc" id="L354">            throw new IllegalValueException(Url.MESSAGE_URL_CONSTRAINTS);</span>
        }
<span class="fc" id="L356">        return new Url(trimmedUrl);</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; url} into an {@code Optional&lt;Url&gt;} if {@code url} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;Url&gt; parseUrl(Optional&lt;String&gt; url) throws IllegalValueException {
<span class="fc" id="L364">        requireNonNull(url);</span>
<span class="fc bfc" id="L365" title="All 2 branches covered.">        return url.isPresent() ? Optional.of(parseUrl(url.get())) : Optional.empty();</span>
    }

    public static Url getNullReferenceUrl() {
<span class="fc" id="L369">        return new Url(Url.NULL_URL_REFERENCE);</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; url} into an {@code Optional&lt;Url&gt;} if {@code url} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;Url&gt; parseUrlOnInitialAdd(Optional&lt;String&gt; url) throws IllegalValueException {
<span class="fc" id="L377">        requireNonNull(url);</span>
<span class="fc bfc" id="L378" title="All 2 branches covered.">        return url.isPresent() ? Optional.of(parseUrl(url.get())) : Optional.of(getNullReferenceUrl());</span>
    }

    /**
     * Parses a {@code String image} into an {@code image}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code image} is invalid.
     */
    public static Image parseImage(String image) throws IllegalValueException {
<span class="fc" id="L388">        requireNonNull(image);</span>
<span class="fc" id="L389">        String trimmedImage = image.trim();</span>
<span class="fc bfc" id="L390" title="All 2 branches covered.">        if (!Image.isValidImage(trimmedImage)) {</span>
<span class="fc" id="L391">            throw new IllegalValueException(Image.MESSAGE_IMAGE_CONSTRAINTS);</span>
        }
<span class="fc" id="L393">        return new Image(trimmedImage);</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; url} into an {@code Optional&lt;Url&gt;} if {@code url} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;Image&gt; parseImage(Optional&lt;String&gt; image) throws IllegalValueException {
<span class="fc" id="L401">        requireNonNull(image);</span>
<span class="fc bfc" id="L402" title="All 2 branches covered.">        return image.isPresent() ? Optional.of(parseImage(image.get())) : Optional.empty();</span>
    }

    public static Image getNullReferenceImage() {
<span class="fc" id="L406">        return new Image(Image.NULL_IMAGE_REFERENCE);</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; image} into an {@code Optional&lt;Image&gt;} if {@code image} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;Image&gt; parseImageOnInitialAdd(Optional&lt;String&gt; image) throws IllegalValueException {
<span class="fc" id="L414">        requireNonNull(image);</span>
<span class="fc bfc" id="L415" title="All 2 branches covered.">        return image.isPresent() ? Optional.of(parseImage(image.get())) : Optional.of(getNullReferenceImage());</span>
    }
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui.util/UiUtil.java.html
``` html
package seedu.recipe.ui.util;

import static seedu.recipe.ui.CssSyntax.CSS_PROPERTY_BACKGROUND_COLOR;
import static seedu.recipe.ui.CssSyntax.CSS_PROPERTY_TEXT_COLOR;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.regex.Pattern;

import javafx.scene.control.Label;

/**
 * Contains utility methods for UI design.
 */
<span class="nc" id="L17">public class UiUtil {</span>

    public static final String HEX_REGEX = &quot;[A-Fa-f0-9]*&quot;;
    public static final String HEX_COLOR_BLACK = &quot;#000000&quot;;
    public static final String HEX_COLOR_WHITE = &quot;#FFFFFF&quot;;

    public static final String HEX_COLOR_REGEX = &quot;#([A-Fa-f0-9]{6})&quot;;
    private static final char HEX_COLOR_PREFIX = '#';
    private static final String HEX_COLOR_BUFFER = &quot;000000&quot;;
    private static final int HEX_COLOR_LENGTH = 6;

    private static final int NEUTRAL_COLOR_DENSITY = 384;


    /**
     * Returns a hexadecimal string representation of an integer.
     */
    public static String convertIntToHexadecimalString(int integer) {
<span class="fc" id="L35">        return Integer.toHexString(integer);</span>
    }

    /**
     * Returns a valid CSS hexadecimal color code that is as similar
     * as possible to the given string (eg. #f23b21).
     */
    public static String convertStringToValidColorCode(String string) {
<span class="fc" id="L43">        string = removeAllWhitespaceInString(string);</span>

        // HEX_COLOR_BUFFER ensures that the returned value has at least 6 hexadecimal digits
<span class="fc" id="L46">        String extendedHexString = string.concat(HEX_COLOR_BUFFER);</span>

<span class="fc bfc" id="L48" title="All 2 branches covered.">        if (Pattern.matches(HEX_REGEX, string)) {</span>
<span class="fc" id="L49">            return HEX_COLOR_PREFIX + extendedHexString.substring(0, HEX_COLOR_LENGTH);</span>
        } else {
<span class="fc" id="L51">            return HEX_COLOR_WHITE;</span>
        }
    }

    /**
     * Sets the color of a label given a particular background color
     *
     * @@param backgroundColor Preferably a valid CSS hexadecimal color code (eg. #f23b21)
     */
    public static void setLabelColor(Label label, String backgroundColor) {
<span class="fc" id="L61">        backgroundColor = removeAllWhitespaceInString(backgroundColor);</span>
<span class="pc bpc" id="L62" title="1 of 2 branches missed.">        backgroundColor = isValidHexColorCode(backgroundColor) ? backgroundColor : HEX_COLOR_WHITE;</span>

<span class="fc" id="L64">        String textColor = getMatchingColorFromGivenColor(backgroundColor);</span>
<span class="fc" id="L65">        label.setStyle(CSS_PROPERTY_BACKGROUND_COLOR + backgroundColor + &quot;; &quot;</span>
                + CSS_PROPERTY_TEXT_COLOR + textColor + &quot;;&quot;);
<span class="fc" id="L67">    }</span>

    /**
     * Sets the text color of a label
     *
     * @@param backgroundColor Preferably a valid CSS hexadecimal color code (eg. #f23b21)
     */
    public static String getMatchingColorFromGivenColor(String backgroundColor) {
<span class="fc" id="L75">        backgroundColor = removeAllWhitespaceInString(backgroundColor);</span>
<span class="fc bfc" id="L76" title="All 2 branches covered.">        backgroundColor = isValidHexColorCode(backgroundColor) ? backgroundColor : HEX_COLOR_WHITE;</span>

<span class="fc bfc" id="L78" title="All 2 branches covered.">        if (isColorDark(backgroundColor)) {</span>
<span class="fc" id="L79">            return HEX_COLOR_WHITE;</span>
        } else {
<span class="fc" id="L81">            return HEX_COLOR_BLACK;</span>
        }
    }

    /**
     * Returns true if a given color is dark
     *
     * @@param color Preferably a valid CSS hexadecimal color code (eg. #f23b21)
     */
    public static boolean isColorDark(String color) {
<span class="fc" id="L91">        color = removeAllWhitespaceInString(color);</span>
<span class="pc bpc" id="L92" title="1 of 2 branches missed.">        color = isValidHexColorCode(color) ? color : HEX_COLOR_WHITE;</span>

<span class="fc" id="L94">        int lightnessCount = 0;</span>

<span class="fc bfc" id="L96" title="All 2 branches covered.">        for (int i = 1; i &lt; 6; i = i + 2) {</span>
<span class="fc" id="L97">            String colorDensity = color.substring(i, i + 2);</span>
<span class="fc" id="L98">            lightnessCount += Integer.parseInt(colorDensity, 16);</span>
        }

<span class="fc bfc" id="L101" title="All 2 branches covered.">        if (lightnessCount &gt;= NEUTRAL_COLOR_DENSITY) {</span>
<span class="fc" id="L102">            return false;</span>
        }

<span class="fc" id="L105">        return true;</span>
    }

    /**
     * Returns true if a String is a valid CSS hexadecimal color code (eg. #f23b21)
     */
    public static boolean isValidHexColorCode (String string) {
<span class="fc" id="L112">        return Pattern.matches(HEX_COLOR_REGEX, string);</span>
    }

    /**
     * Returns the given string without whitespaces
     */
    public static String removeAllWhitespaceInString(String string) {
<span class="fc" id="L119">        return string.replaceAll(&quot;\\s&quot;, &quot;&quot;);</span>
    }

    /**
     * Copies a given string to the clipboard
     */
    public static void copyToClipboard(String string) {
<span class="nc" id="L126">        Toolkit toolkit = Toolkit.getDefaultToolkit();</span>
<span class="nc" id="L127">        Clipboard clipboard = toolkit.getSystemClipboard();</span>
<span class="nc" id="L128">        StringSelection stringSelection = new StringSelection(string);</span>
<span class="nc" id="L129">        clipboard.setContents(stringSelection, null);</span>
<span class="nc" id="L130">    }</span>
}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui.util/FacebookHandler.java.html
``` html
package seedu.recipe.ui.util;

/**
 * Manages Facebook related commands and execution
 */
<span class="pc bpc" id="L7" title="1 of 2 branches missed.">public class FacebookHandler {</span>

    public static final String ACCESS_TOKEN_IDENTIFIER = &quot;#access_token=&quot;;
    public static final String REDIRECT_DOMAIN = &quot;https://www.facebook.com/&quot;;
    public static final String REDIRECT_EMBEDDED = &quot;&amp;redirect_uri=&quot; + REDIRECT_DOMAIN;
    private static final String APP_ID = &quot;177615459696708&quot;;
    public static final String POST_DOMAIN = &quot;https://www.facebook.com/dialog/feed?%20app_id=&quot;
            + APP_ID + &quot;&amp;display=popup&amp;amp;&amp;link=&quot;;

    private static final String ACCESS_RIGHTS = &quot;user_about_me&quot;;
    private static final String AUTH_URL = &quot;https://graph.facebook.com/oauth/authorize?type=user_agent&amp;client_id=&quot;
            + APP_ID + &quot;&amp;redirect_uri=&quot; + REDIRECT_DOMAIN + &quot;&amp;scope=&quot; + ACCESS_RIGHTS;

    private static final String ACCESS_TOKEN_REGEX = REDIRECT_DOMAIN + &quot;#access_token=(.+)&amp;.*&quot;;
    private static final String EXTRACT_PORTION = &quot;$1&quot;;

<span class="fc" id="L23">    private static String accessToken = null;</span>

    /**
     * Returns true if FacebookHandler already has an access token.
     */
    public static boolean hasAccessToken() {
<span class="fc bfc" id="L29" title="All 2 branches covered.">        if (accessToken == null) {</span>
<span class="fc" id="L30">            return false;</span>
        } else {
<span class="fc" id="L32">            return true;</span>
        }
    }

    /**
     * Checks if an access token is embedded in the url.
     * If access token is found, set the accessToken variable to be the found access token.
     *
     * @return Returns true when access token is found.
     */
    public static boolean checkAndSetAccessToken(String url) {
<span class="fc bfc" id="L43" title="All 2 branches covered.">        if (url.contains(ACCESS_TOKEN_IDENTIFIER)) {</span>
<span class="fc" id="L44">            String token = extractAccessToken(url);</span>
<span class="fc" id="L45">            setAccessToken(token);</span>
<span class="fc" id="L46">            return true;</span>
        } else {
<span class="fc" id="L48">            return false;</span>
        }
    }

    /**
     * Extracts access token from the given URL.
     */
    public static String extractAccessToken(String url) {
<span class="pc bpc" id="L56" title="2 of 4 branches missed.">        assert (url.contains(ACCESS_TOKEN_IDENTIFIER));</span>
<span class="fc" id="L57">        return url.replaceAll(ACCESS_TOKEN_REGEX, EXTRACT_PORTION);</span>
    }

    public static void setAccessToken(String token) {
<span class="fc" id="L61">        accessToken = token;</span>
<span class="fc" id="L62">    }</span>

    public static String getPostDomain() {
<span class="fc" id="L65">        return POST_DOMAIN;</span>
    }

    public static String getRedirectEmbedded() {
<span class="fc" id="L69">        return REDIRECT_EMBEDDED;</span>
    }
}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.commands/ShareCommand.java.html
``` html
/**
 * Shares on Facebook a recipe identified using it's last displayed index from the recipe book.
 */
public class ShareCommand extends Command {

    public static final String COMMAND_WORD = &quot;share&quot;;

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + &quot;: Shares on Facebook the recipe identified by the index number used in the last recipe listing.\n&quot;
            + &quot;Parameters: INDEX (must be a positive integer)\n&quot;
            + &quot;Example: &quot; + COMMAND_WORD + &quot; 1&quot;;

    public static final String MESSAGE_SHARE_RECIPE_SUCCESS = &quot;Recipe To Share: %1$s. &quot;
            + &quot;Do make sure that you have an Internet connection.&quot;;

    private final Index targetIndex;

    private Recipe recipeToShare;

<span class="fc" id="L32">    public ShareCommand(Index targetIndex) {</span>
<span class="fc" id="L33">        this.targetIndex = targetIndex;</span>
<span class="fc" id="L34">    }</span>

    @Override
    public CommandResult execute() throws CommandException {

<span class="fc" id="L39">        List&lt;Recipe&gt; lastShownList = model.getFilteredRecipeList();</span>

<span class="fc bfc" id="L41" title="All 2 branches covered.">        if (targetIndex.getZeroBased() &gt;= lastShownList.size()) {</span>
<span class="fc" id="L42">            throw new CommandException(Messages.MESSAGE_INVALID_RECIPE_DISPLAYED_INDEX);</span>
        }

<span class="fc" id="L45">        recipeToShare = lastShownList.get(targetIndex.getZeroBased());</span>
<span class="fc" id="L46">        EventsCenter.getInstance().post(new ShareRecipeEvent(targetIndex, recipeToShare));</span>

<span class="fc" id="L48">        return new CommandResult(String.format(MESSAGE_SHARE_RECIPE_SUCCESS, targetIndex.getOneBased()));</span>

    }

    @Override
    public boolean equals(Object other) {
<span class="fc bfc" id="L54" title="All 4 branches covered.">        return other == this // short circuit if same object</span>
                || (other instanceof ShareCommand // instanceof handles nulls
<span class="fc bfc" id="L56" title="All 2 branches covered.">                &amp;&amp; this.targetIndex.equals(((ShareCommand) other).targetIndex)); // state check</span>
    }
}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui/CssSyntax.java.html
``` html
package seedu.recipe.ui;

/**
 * Contains CSS (Cascading Style Sheet) syntax.
 */
<span class="nc" id="L7">public class CssSyntax {</span>

    /* Prefix definitions */
    public static final String CSS_PROPERTY_BACKGROUND_COLOR = &quot;-fx-background-color: &quot;;
    public static final String CSS_PROPERTY_TEXT_COLOR = &quot;-fx-text-fill: &quot;;
}
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui/RecipeCard.java.html
``` html
    /**
     * Sets the image for {@code imageView}.
     */
    private void setImageView(ImageView imageView) {
<span class="fc bfc" id="L73" title="All 2 branches covered.">        if (recipe.isNullImage()) {</span>
<span class="fc" id="L74">            return;</span>
        }
        try {
<span class="fc" id="L77">            FileInputStream input = new FileInputStream(recipe.getImage().toString());</span>
<span class="fc" id="L78">            Image image = new Image(input);</span>
<span class="fc" id="L79">            imageView.setImage(image);</span>
<span class="nc" id="L80">        } catch (IOException exception) {</span>
<span class="nc" id="L81">            System.out.println(&quot;File not found&quot;);</span>
<span class="fc" id="L82">        }</span>
<span class="fc" id="L83">    }</span>

    /**
     * Returns the color style for {@code tagName}'s label.
     */
    private String getTagColorStyleFor(String tagName) {
        // the hash code of the tag name is used to generate a random color for each tag,
        // color remains consistent between different runs of the program since hash code does not change
<span class="fc" id="L91">        String hexadecimalHashCode = UiUtil.convertIntToHexadecimalString(tagName.hashCode());</span>
<span class="fc" id="L92">        String hexadecimalColorCode = UiUtil.convertStringToValidColorCode(hexadecimalHashCode);</span>
<span class="fc" id="L93">        return hexadecimalColorCode;</span>
    }

    /**
     * Creates the tag labels for {@code recipe}.
     */
    private void initTags(Recipe recipe) {
<span class="fc" id="L100">        recipe.getTags().forEach(tag -&gt; {</span>
            Label tagLabel = new Label(tag.tagName);
            String labelBackgroundColor = getTagColorStyleFor(tag.tagName);
            UiUtil.setLabelColor(tagLabel, labelBackgroundColor);
            tags.getChildren().add(tagLabel);
        });
<span class="fc" id="L106">    }</span>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui/BrowserPanel.java.html
``` html
    /**
     * Loads the text recipe onto the browser
     */
    private void loadLocalRecipe(Recipe recipe) {
<span class="fc" id="L95">        browser.getEngine().loadContent(HtmlFormatter.getHtmlFormat(recipe));</span>
<span class="fc" id="L96">    }</span>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui/BrowserPanel.java.html
``` html
    @Subscribe
    private void handleShareRecipeEvent(ShareRecipeEvent event) {
<span class="nc" id="L159">        recipeToShare = event.getTargetRecipe();</span>
<span class="nc" id="L160">        String urlToShare = recipeToShare.getUrl().toString();</span>
<span class="nc" id="L161">        UiUtil.copyToClipboard(recipeToShare.getTextFormattedRecipe());</span>

<span class="nc bnc" id="L163" title="All 2 branches missed.">        if (!urlToShare.equals(Url.NULL_URL_REFERENCE)) {</span>
<span class="nc" id="L164">            loadPage(FacebookHandler.getPostDomain() + recipeToShare.getUrl().toString()</span>
<span class="nc" id="L165">                    + FacebookHandler.getRedirectEmbedded());</span>
        } else {
<span class="nc" id="L167">            loadPage(FacebookHandler.REDIRECT_DOMAIN);</span>
        }
<span class="nc" id="L169">    }</span>

```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui/RecipeListPanel.java.html
``` html
    @Subscribe
    private void handleShareRecipeEvent(ShareRecipeEvent event) {
<span class="nc" id="L74">        logger.info(LogsCenter.getEventHandlingLogMessage(event));</span>
<span class="nc" id="L75">    }</span>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.storage/XmlAdaptedRecipe.java.html
``` html
<span class="fc bfc" id="L176" title="All 2 branches covered.">        if (this.url == null) {</span>
<span class="fc" id="L177">            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Url.class.getSimpleName()));</span>
        }
<span class="fc bfc" id="L179" title="All 2 branches covered.">        if (!Url.isValidUrl(this.url)) {</span>
<span class="fc" id="L180">            throw new IllegalValueException(Url.MESSAGE_URL_CONSTRAINTS);</span>
        }
<span class="fc" id="L182">        final Url url = new Url(this.url);</span>

<span class="fc bfc" id="L184" title="All 2 branches covered.">        if (this.image == null) {</span>
<span class="fc" id="L185">            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Image.class.getSimpleName()));</span>
        }
<span class="fc bfc" id="L187" title="All 2 branches covered.">        if (!Image.isValidImage(this.image)) {</span>
<span class="fc" id="L188">            throw new IllegalValueException(Image.MESSAGE_IMAGE_CONSTRAINTS);</span>
        }
<span class="fc" id="L190">        final Image image = new Image(this.image);</span>
```
###### /src/test/java/seedu/recipe/ui/UiUtilTest.java
``` java
package seedu.recipe.ui;

import static org.junit.Assert.assertTrue;
import static seedu.recipe.ui.util.UiUtil.HEX_COLOR_BLACK;
import static seedu.recipe.ui.util.UiUtil.HEX_COLOR_WHITE;

import java.util.regex.Pattern;

import org.junit.Test;

import seedu.recipe.ui.util.UiUtil;

public class UiUtilTest {

    private static final String LIGHT_COLOR_CODE = "#FFFFFF";
    private static final String DARK_COLOR_CODE = "#000000";
    private static final String VALID_STRING = "This is a valid string";

    @Test
    public void convertStringToValidColorCode() {

        // empty string
        assertTrue(Pattern.matches(UiUtil.HEX_COLOR_REGEX,
                UiUtil.convertStringToValidColorCode("")));

        // valid hexadecimal
        assertTrue(Pattern.matches(UiUtil.HEX_COLOR_REGEX,
                UiUtil.convertStringToValidColorCode("01fb45")));

        // valid hexadecimal with random whitespaces
        assertTrue(Pattern.matches(UiUtil.HEX_COLOR_REGEX,
                UiUtil.convertStringToValidColorCode("  cd  eff  f")));

        // valid hexadecimal with varying lengths
        assertTrue(Pattern.matches(UiUtil.HEX_COLOR_REGEX,
                UiUtil.convertStringToValidColorCode("1a2b")));
        assertTrue(Pattern.matches(UiUtil.HEX_COLOR_REGEX,
                UiUtil.convertStringToValidColorCode("1a2bfc124ab")));

        // valid hexadecimal with varying lengths and with random whitespaces
        assertTrue(Pattern.matches(UiUtil.HEX_COLOR_REGEX,
                UiUtil.convertStringToValidColorCode("  1  a  2b ")));
        assertTrue(Pattern.matches(UiUtil.HEX_COLOR_REGEX,
                UiUtil.convertStringToValidColorCode(" 1a2 bfc12  4ab ")));

        // invalid hexadecimal
        assertTrue(Pattern.matches(UiUtil.HEX_COLOR_REGEX,
                UiUtil.convertStringToValidColorCode("i#tov129nfoiZZ!!Za")));

        // invalid hexadecimal with random whitespaces
        assertTrue(Pattern.matches(UiUtil.HEX_COLOR_REGEX,
                UiUtil.convertStringToValidColorCode(" i t#ov   129 nfoi  ZZ !! Za ")));
    }

    @Test
    public void getMatchingColorFromGivenColor() {
        // invalid CSS color code
        assertTrue(HEX_COLOR_BLACK.equals(UiUtil.getMatchingColorFromGivenColor("asdio 42oi n")));

        // light CSS color code
        assertTrue(HEX_COLOR_BLACK.equals(UiUtil.getMatchingColorFromGivenColor(LIGHT_COLOR_CODE)));

        // dark CSS color code
        assertTrue(HEX_COLOR_WHITE.equals(UiUtil.getMatchingColorFromGivenColor(DARK_COLOR_CODE)));
    }
}
```
###### /src/test/java/seedu/recipe/ui/testutil/FacebookHandlerTest.java
``` java
public class FacebookHandlerTest {
    public static final String ACCESS_TOKEN_STUB = "123";
    public static final String VALID_EMBEDDED_ACCESS_TOKEN = REDIRECT_DOMAIN
            + ACCESS_TOKEN_IDENTIFIER + ACCESS_TOKEN_STUB + "&";
    public static final String INVALID_EMBEDDED_ACCESS_TOKEN = REDIRECT_DOMAIN
            + ACCESS_TOKEN_STUB; // without token identifier
    @Test
    public void hasAccessToken() {
        FacebookHandler.setAccessToken(null);
        assertFalse(FacebookHandler.hasAccessToken());

        FacebookHandler.setAccessToken(ACCESS_TOKEN_STUB);
        assertTrue(FacebookHandler.hasAccessToken());
    }

    @Test
    public void extractAccessToken() {
        assertTrue(FacebookHandler.extractAccessToken(VALID_EMBEDDED_ACCESS_TOKEN)
                .equals(ACCESS_TOKEN_STUB));
    }

    @Test
    public void checkAndSetAccessToken() {
        assertTrue(FacebookHandler.checkAndSetAccessToken(VALID_EMBEDDED_ACCESS_TOKEN));
        assertFalse(FacebookHandler.checkAndSetAccessToken(INVALID_EMBEDDED_ACCESS_TOKEN));
    }

    @Test
    public void getPostDomain() {
        assertEquals(FacebookHandler.getPostDomain(), FacebookHandler.POST_DOMAIN);
    }

    @Test
    public void getRedirectEmbedded() {
        assertEquals(FacebookHandler.getRedirectEmbedded(), FacebookHandler.REDIRECT_EMBEDDED);
    }
}
```
###### /src/test/java/seedu/recipe/logic/parser/RecipeBookParserTest.java
``` java
    @Test
    public void parseCommand_share() throws Exception {
        ShareCommand command = (ShareCommand) parser.parseCommand(
                ShareCommand.COMMAND_WORD + " " + INDEX_FIRST_RECIPE.getOneBased());
        assertEquals(new ShareCommand(INDEX_FIRST_RECIPE), command);
    }
```
###### /src/test/java/seedu/recipe/logic/parser/AddCommandParserTest.java
``` java
        // multiple urls - last url accepted
        assertParseSuccess(parser, NAME_DESC_BOB + PREPARATION_TIME_DESC_BOB + INGREDIENT_DESC_BOB
                + COOKING_TIME_DESC_BOB + SERVINGS_DESC_BOB + CALORIES_DESC_BOB
                + INSTRUCTION_DESC_BOB + URL_DESC_AMY + URL_DESC_BOB + IMG_DESC_BOB
                + TAG_DESC_FRIEND, new AddCommand(expectedRecipe));

        // multiple images - last image accepted
        assertParseSuccess(parser, NAME_DESC_BOB + PREPARATION_TIME_DESC_BOB + INGREDIENT_DESC_BOB
                + COOKING_TIME_DESC_BOB + SERVINGS_DESC_BOB + CALORIES_DESC_BOB
                + INSTRUCTION_DESC_BOB + URL_DESC_BOB + IMG_DESC_AMY + IMG_DESC_BOB
                + TAG_DESC_FRIEND, new AddCommand(expectedRecipe));
```
###### /src/test/java/seedu/recipe/logic/parser/AddCommandParserTest.java
``` java
        // invalid url
        assertParseFailure(parser,
                NAME_DESC_BOB + PREPARATION_TIME_DESC_BOB + INGREDIENT_DESC_BOB + INSTRUCTION_DESC_BOB
                        + INVALID_URL_DESC + TAG_DESC_HUSBAND + TAG_DESC_FRIEND,
                Url.MESSAGE_URL_CONSTRAINTS);
```
###### /src/test/java/seedu/recipe/storage/XmlAdaptedRecipeTest.java
``` java
    @Test
    public void toModelType_invalidUrl_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe =
                new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, VALID_INSTRUCTION, VALID_COOKING_TIME,
                        VALID_PREPARATION_TIME, VALID_CALORIES, VALID_SERVINGS, INVALID_URL,
                        VALID_IMAGE, VALID_TAGS);
        String expectedMessage = Url.MESSAGE_URL_CONSTRAINTS;
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }

    @Test
    public void toModelType_nullUrl_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe =
                new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, VALID_INSTRUCTION, VALID_COOKING_TIME,
                        VALID_PREPARATION_TIME, VALID_CALORIES, VALID_SERVINGS, null,
                        VALID_IMAGE, VALID_TAGS);
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Url.class.getSimpleName());
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }
    @Test
    public void toModelType_invalidImage_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe =
                new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, VALID_INSTRUCTION, VALID_COOKING_TIME,
                        VALID_PREPARATION_TIME, VALID_CALORIES, VALID_SERVINGS, VALID_URL,
                        INVALID_IMAGE, VALID_TAGS);
        String expectedMessage = Image.MESSAGE_IMAGE_CONSTRAINTS;
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }

    @Test
    public void toModelType_nullImage_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe =
                new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, VALID_INSTRUCTION, VALID_COOKING_TIME,
                        VALID_PREPARATION_TIME, VALID_CALORIES, VALID_SERVINGS, VALID_URL,
                        null, VALID_TAGS);
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Image.class.getSimpleName());
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }
```
###### /src/test/java/seedu/recipe/storage/XmlAdaptedRecipeTest.java
``` java


    @Test
    public void toModelType_invalidTags_throwsIllegalValueException() {
        List<XmlAdaptedTag> invalidTags = new ArrayList<>(VALID_TAGS);
        invalidTags.add(new XmlAdaptedTag(INVALID_TAG));
        XmlAdaptedRecipe recipe =
            new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, VALID_INSTRUCTION, VALID_COOKING_TIME,
                    VALID_PREPARATION_TIME, VALID_CALORIES, VALID_SERVINGS, VALID_URL,
                    VALID_IMAGE, invalidTags);
        Assert.assertThrows(IllegalValueException.class, recipe::toModelType);
    }

}
```
###### /src/test/java/seedu/recipe/model/recipe/ImageTest.java
``` java
package seedu.recipe.model.recipe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.recipe.testutil.Assert;

public class ImageTest {
    @Test
    public void constructor_null_throwsNullPointerException() {
        Assert.assertThrows(NullPointerException.class, () -> new Image(null));
    }

    @Test
    public void constructor_invalidImage_throwsIllegalArgumentException() {
        String invalidImage = "";
        Assert.assertThrows(IllegalArgumentException.class, () -> new Image(invalidImage));
    }

    @Test
    public void isValidImage() {
        // blank image
        assertFalse(Image.isValidImage("")); // empty string
        assertFalse(Image.isValidImage("   ")); // spaces only

        // invalid image
        assertFalse(Image.isValidImage("estsed")); //random string

        // valid image
        assertTrue(Image.isValidImage(Image.VALID_IMAGE_PATH));
    }
}
```
###### /src/test/java/seedu/recipe/model/recipe/UrlTest.java
``` java
package seedu.recipe.model.recipe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.recipe.testutil.Assert;

public class UrlTest {
    @Test
    public void constructor_null_throwsNullPointerException() {
        Assert.assertThrows(NullPointerException.class, () -> new Url(null));
    }

    @Test
    public void constructor_invalidUrl_throwsIllegalArgumentException() {
        String invalidUrl = "";
        Assert.assertThrows(IllegalArgumentException.class, () -> new Url(invalidUrl));
    }

    @Test
    public void isValidUrl() {
        // blank Url
        assertFalse(Url.isValidUrl("")); // empty string
        assertFalse(Url.isValidUrl(" ")); // spaces only

        // invalid Url
        assertFalse(Url.isValidUrl("www.google.com")); // "http://" of "https://" not at the beginning of Url

        // valid Url
        assertTrue(Url.isValidUrl("http://www.google.com")); // "http://" at the beginning of Url
        assertTrue(Url.isValidUrl("https://www.google.com")); // "https://" at the beginning of Url
        assertTrue(Url.isValidUrl(" http://www.google.com")); // leading space
        assertTrue(Url.isValidUrl("http://www.google.com ")); // trailing space
        assertTrue(Url.isValidUrl("https://www.google.com.sg/search"
                + "?ei=1oqfWryFJYvtvgS2kovIDw&q=long+url+trying+to+add+words&oq"
                + "=long+url+trying+to+add+words&gs_l=psy-ab.3...16827.19809.0.19937"
                + ".20.20.0.0.0.0.131.1429.15j3.18.0....0...1c.1.64.psy-ab..2.9.695...0j0"
                + "i20i263k1j0i22i30k1j33i160k1j33i21k1j33i22i29i30k1.0.ToeND2eqJXA")); // long url
    }
}
```
###### /src/test/java/seedu/recipe/testutil/RecipeBuilder.java
``` java
    /**
     * Sets the {@code Url} of the {@code Recipe} that we are building.
     */
    public RecipeBuilder withUrl(String url) {
        this.url = new Url(url);
        return this;
    }

    /**
     * Sets the {@code Url} of the {@code Recipe} that we are building.
     */
    public RecipeBuilder withImage(String image) {
        this.image = new Image(image);
        return this;
    }
```
###### /src/test/java/seedu/recipe/testutil/EditRecipeDescriptorBuilder.java
``` java
    /**
     * Sets the {@code Url} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditRecipeDescriptorBuilder withUrl(String url) {
        descriptor.setUrl(new Url(url));
        return this;
    }

    /**
     * Sets the {@code Url} of the {@code EditPersonDescriptor} that we are building.
     */
    public EditRecipeDescriptorBuilder withImage(String image) {
        descriptor.setImage(new Image(image));
        return this;
    }
```
###### /src/main/java/seedu/recipe/ui/CssSyntax.java
``` java
package seedu.recipe.ui;

/**
 * Contains CSS (Cascading Style Sheet) syntax.
 */
public class CssSyntax {

    /* Prefix definitions */
    public static final String CSS_PROPERTY_BACKGROUND_COLOR = "-fx-background-color: ";
    public static final String CSS_PROPERTY_TEXT_COLOR = "-fx-text-fill: ";
}
```
###### /src/main/java/seedu/recipe/ui/util/UiUtil.java
``` java
package seedu.recipe.ui.util;

import static seedu.recipe.ui.CssSyntax.CSS_PROPERTY_BACKGROUND_COLOR;
import static seedu.recipe.ui.CssSyntax.CSS_PROPERTY_TEXT_COLOR;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.regex.Pattern;

import javafx.scene.control.Label;

/**
 * Contains utility methods for UI design.
 */
public class UiUtil {

    public static final String HEX_REGEX = "[A-Fa-f0-9]*";
    public static final String HEX_COLOR_BLACK = "#000000";
    public static final String HEX_COLOR_WHITE = "#FFFFFF";

    public static final String HEX_COLOR_REGEX = "#([A-Fa-f0-9]{6})";
    private static final char HEX_COLOR_PREFIX = '#';
    private static final String HEX_COLOR_BUFFER = "000000";
    private static final int HEX_COLOR_LENGTH = 6;

    private static final int NEUTRAL_COLOR_DENSITY = 384;


    /**
     * Returns a hexadecimal string representation of an integer.
     */
    public static String convertIntToHexadecimalString(int integer) {
        return Integer.toHexString(integer);
    }

    /**
     * Returns a valid CSS hexadecimal color code that is as similar
     * as possible to the given string (eg. #f23b21).
     */
    public static String convertStringToValidColorCode(String string) {
        string = removeAllWhitespaceInString(string);

        // HEX_COLOR_BUFFER ensures that the returned value has at least 6 hexadecimal digits
        String extendedHexString = string.concat(HEX_COLOR_BUFFER);

        if (Pattern.matches(HEX_REGEX, string)) {
            return HEX_COLOR_PREFIX + extendedHexString.substring(0, HEX_COLOR_LENGTH);
        } else {
            return HEX_COLOR_WHITE;
        }
    }

    /**
     * Sets the color of a label given a particular background color
     *
     * @@param backgroundColor Preferably a valid CSS hexadecimal color code (eg. #f23b21)
     */
    public static void setLabelColor(Label label, String backgroundColor) {
        backgroundColor = removeAllWhitespaceInString(backgroundColor);
        backgroundColor = isValidHexColorCode(backgroundColor) ? backgroundColor : HEX_COLOR_WHITE;

        String textColor = getMatchingColorFromGivenColor(backgroundColor);
        label.setStyle(CSS_PROPERTY_BACKGROUND_COLOR + backgroundColor + "; "
                + CSS_PROPERTY_TEXT_COLOR + textColor + ";");
    }

    /**
     * Sets the text color of a label
     *
     * @@param backgroundColor Preferably a valid CSS hexadecimal color code (eg. #f23b21)
     */
    public static String getMatchingColorFromGivenColor(String backgroundColor) {
        backgroundColor = removeAllWhitespaceInString(backgroundColor);
        backgroundColor = isValidHexColorCode(backgroundColor) ? backgroundColor : HEX_COLOR_WHITE;

        if (isColorDark(backgroundColor)) {
            return HEX_COLOR_WHITE;
        } else {
            return HEX_COLOR_BLACK;
        }
    }

    /**
     * Returns true if a given color is dark
     *
     * @@param color Preferably a valid CSS hexadecimal color code (eg. #f23b21)
     */
    public static boolean isColorDark(String color) {
        color = removeAllWhitespaceInString(color);
        color = isValidHexColorCode(color) ? color : HEX_COLOR_WHITE;

        int lightnessCount = 0;

        for (int i = 1; i < 6; i = i + 2) {
            String colorDensity = color.substring(i, i + 2);
            lightnessCount += Integer.parseInt(colorDensity, 16);
        }

        if (lightnessCount >= NEUTRAL_COLOR_DENSITY) {
            return false;
        }

        return true;
    }

    /**
     * Returns true if a String is a valid CSS hexadecimal color code (eg. #f23b21)
     */
    public static boolean isValidHexColorCode (String string) {
        return Pattern.matches(HEX_COLOR_REGEX, string);
    }

    /**
     * Returns the given string without whitespaces
     */
    public static String removeAllWhitespaceInString(String string) {
        return string.replaceAll("\\s", "");
    }

    /**
     * Copies a given string to the clipboard
     */
    public static void copyToClipboard(String string) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        StringSelection stringSelection = new StringSelection(string);
        clipboard.setContents(stringSelection, null);
    }
}
```
###### /src/main/java/seedu/recipe/ui/util/FacebookHandler.java
``` java
package seedu.recipe.ui.util;

/**
 * Manages Facebook related commands and execution
 */
public class FacebookHandler {

    public static final String ACCESS_TOKEN_IDENTIFIER = "#access_token=";
    public static final String REDIRECT_DOMAIN = "https://www.facebook.com/";
    public static final String REDIRECT_EMBEDDED = "&redirect_uri=" + REDIRECT_DOMAIN;
    private static final String APP_ID = "177615459696708";
    public static final String POST_DOMAIN = "https://www.facebook.com/dialog/feed?%20app_id="
            + APP_ID + "&display=popup&amp;&link=";

    private static final String ACCESS_RIGHTS = "user_about_me";
    private static final String AUTH_URL = "https://graph.facebook.com/oauth/authorize?type=user_agent&client_id="
            + APP_ID + "&redirect_uri=" + REDIRECT_DOMAIN + "&scope=" + ACCESS_RIGHTS;

    private static final String ACCESS_TOKEN_REGEX = REDIRECT_DOMAIN + "#access_token=(.+)&.*";
    private static final String EXTRACT_PORTION = "$1";

    private static String accessToken = null;

    /**
     * Returns true if FacebookHandler already has an access token.
     */
    public static boolean hasAccessToken() {
        if (accessToken == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Checks if an access token is embedded in the url.
     * If access token is found, set the accessToken variable to be the found access token.
     *
     * @return Returns true when access token is found.
     */
    public static boolean checkAndSetAccessToken(String url) {
        if (url.contains(ACCESS_TOKEN_IDENTIFIER)) {
            String token = extractAccessToken(url);
            setAccessToken(token);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Extracts access token from the given URL.
     */
    public static String extractAccessToken(String url) {
        assert (url.contains(ACCESS_TOKEN_IDENTIFIER));
        return url.replaceAll(ACCESS_TOKEN_REGEX, EXTRACT_PORTION);
    }

    public static void setAccessToken(String token) {
        accessToken = token;
    }

    public static String getPostDomain() {
        return POST_DOMAIN;
    }

    public static String getRedirectEmbedded() {
        return REDIRECT_EMBEDDED;
    }
}
```
###### /src/main/java/seedu/recipe/ui/BrowserPanel.java
``` java
    /**
     * Loads the text recipe onto the browser
     */
    private void loadLocalRecipe(Recipe recipe) {
        browser.getEngine().loadContent(HtmlFormatter.getHtmlFormat(recipe));
    }
```
###### /src/main/java/seedu/recipe/ui/BrowserPanel.java
``` java
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

```
###### /src/main/java/seedu/recipe/ui/RecipeCard.java
``` java
    /**
     * Sets the image for {@code imageView}.
     */
    private void setImageView(ImageView imageView) {
        if (recipe.isNullImage()) {
            return;
        }
        try {
            FileInputStream input = new FileInputStream(recipe.getImage().toString());
            Image image = new Image(input);
            imageView.setImage(image);
        } catch (IOException exception) {
            System.out.println("File not found");
        }
    }

    /**
     * Returns the color style for {@code tagName}'s label.
     */
    private String getTagColorStyleFor(String tagName) {
        // the hash code of the tag name is used to generate a random color for each tag,
        // color remains consistent between different runs of the program since hash code does not change
        String hexadecimalHashCode = UiUtil.convertIntToHexadecimalString(tagName.hashCode());
        String hexadecimalColorCode = UiUtil.convertStringToValidColorCode(hexadecimalHashCode);
        return hexadecimalColorCode;
    }

    /**
     * Creates the tag labels for {@code recipe}.
     */
    private void initTags(Recipe recipe) {
        recipe.getTags().forEach(tag -> {
            Label tagLabel = new Label(tag.tagName);
            String labelBackgroundColor = getTagColorStyleFor(tag.tagName);
            UiUtil.setLabelColor(tagLabel, labelBackgroundColor);
            tags.getChildren().add(tagLabel);
        });
    }
```
###### /src/main/java/seedu/recipe/ui/RecipeListPanel.java
``` java
    @Subscribe
    private void handleShareRecipeEvent(ShareRecipeEvent event) {
        logger.info(LogsCenter.getEventHandlingLogMessage(event));
    }
```
###### /src/main/java/seedu/recipe/commons/events/ui/ShareRecipeEvent.java
``` java
/**
 * Indicates a request to share a recipe
 */
public class ShareRecipeEvent extends BaseEvent {

    public final int targetIndex;
    public final Recipe recipe;

    public ShareRecipeEvent(Index targetIndex, Recipe recipeToShare) {
        this.targetIndex = targetIndex.getZeroBased();
        this.recipe = recipeToShare;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public Recipe getTargetRecipe() {
        return recipe;
    }
}
```
###### /src/main/java/seedu/recipe/logic/parser/ShareCommandParser.java
``` java
/**
 * Parses input arguments and creates a new ShareCommand object
 */
public class ShareCommandParser implements Parser<ShareCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the ShareCommand
     * and returns an ShareCommand object for execution.
     * @throws ParseException if the user input does not conform to the expected format
     */
    public ShareCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args);
            return new ShareCommand(index);
        } catch (IllegalValueException ive) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, ShareCommand.MESSAGE_USAGE));
        }
    }
}
```
###### /src/main/java/seedu/recipe/logic/parser/ParserUtil.java
``` java
    /**
     * Parses a {@code String url} into an {@code Url}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code url} is invalid.
     */
    public static Url parseUrl(String url) throws IllegalValueException {
        requireNonNull(url);
        String trimmedUrl = url.trim();
        if (!Url.isValidUrl(trimmedUrl)) {
            throw new IllegalValueException(Url.MESSAGE_URL_CONSTRAINTS);
        }
        return new Url(trimmedUrl);
    }

    /**
     * Parses a {@code Optional<String> url} into an {@code Optional<Url>} if {@code url} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<Url> parseUrl(Optional<String> url) throws IllegalValueException {
        requireNonNull(url);
        return url.isPresent() ? Optional.of(parseUrl(url.get())) : Optional.empty();
    }

    public static Url getNullReferenceUrl() {
        return new Url(Url.NULL_URL_REFERENCE);
    }

    /**
     * Parses a {@code Optional<String> url} into an {@code Optional<Url>} if {@code url} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<Url> parseUrlOnInitialAdd(Optional<String> url) throws IllegalValueException {
        requireNonNull(url);
        return url.isPresent() ? Optional.of(parseUrl(url.get())) : Optional.of(getNullReferenceUrl());
    }

    /**
     * Parses a {@code String image} into an {@code image}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code image} is invalid.
     */
    public static Image parseImage(String image) throws IllegalValueException {
        requireNonNull(image);
        String trimmedImage = image.trim();
        if (!Image.isValidImage(trimmedImage)) {
            throw new IllegalValueException(Image.MESSAGE_IMAGE_CONSTRAINTS);
        }
        return new Image(trimmedImage);
    }

    /**
     * Parses a {@code Optional<String> url} into an {@code Optional<Url>} if {@code url} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<Image> parseImage(Optional<String> image) throws IllegalValueException {
        requireNonNull(image);
        return image.isPresent() ? Optional.of(parseImage(image.get())) : Optional.empty();
    }

    public static Image getNullReferenceImage() {
        return new Image(Image.NULL_IMAGE_REFERENCE);
    }

    /**
     * Parses a {@code Optional<String> image} into an {@code Optional<Image>} if {@code image} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<Image> parseImageOnInitialAdd(Optional<String> image) throws IllegalValueException {
        requireNonNull(image);
        return image.isPresent() ? Optional.of(parseImage(image.get())) : Optional.of(getNullReferenceImage());
    }
```
###### /src/main/java/seedu/recipe/logic/commands/ShareCommand.java
``` java
/**
 * Shares on Facebook a recipe identified using it's last displayed index from the recipe book.
 */
public class ShareCommand extends Command {

    public static final String COMMAND_WORD = "share";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Shares on Facebook the recipe identified by the index number used in the last recipe listing.\n"
            + "Parameters: INDEX (must be a positive integer)\n"
            + "Example: " + COMMAND_WORD + " 1";

    public static final String MESSAGE_SHARE_RECIPE_SUCCESS = "Recipe To Share: %1$s. "
            + "Do make sure that you have an Internet connection.";

    private final Index targetIndex;

    private Recipe recipeToShare;

    public ShareCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
    }

    @Override
    public CommandResult execute() throws CommandException {

        List<Recipe> lastShownList = model.getFilteredRecipeList();

        if (targetIndex.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_RECIPE_DISPLAYED_INDEX);
        }

        recipeToShare = lastShownList.get(targetIndex.getZeroBased());
        EventsCenter.getInstance().post(new ShareRecipeEvent(targetIndex, recipeToShare));

        return new CommandResult(String.format(MESSAGE_SHARE_RECIPE_SUCCESS, targetIndex.getOneBased()));

    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof ShareCommand // instanceof handles nulls
                && this.targetIndex.equals(((ShareCommand) other).targetIndex)); // state check
    }
}
```
###### /src/main/java/seedu/recipe/storage/XmlAdaptedRecipe.java
``` java
        if (this.url == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Url.class.getSimpleName()));
        }
        if (!Url.isValidUrl(this.url)) {
            throw new IllegalValueException(Url.MESSAGE_URL_CONSTRAINTS);
        }
        final Url url = new Url(this.url);

        if (this.image == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Image.class.getSimpleName()));
        }
        if (!Image.isValidImage(this.image)) {
            throw new IllegalValueException(Image.MESSAGE_IMAGE_CONSTRAINTS);
        }
        final Image image = new Image(this.image);
```
###### /src/main/java/seedu/recipe/model/util/HtmlFormatter.java
``` java
package seedu.recipe.model.util;

import static seedu.recipe.ui.UiPart.FXML_FILE_FOLDER;

import java.net.URL;

import seedu.recipe.MainApp;
import seedu.recipe.model.recipe.Recipe;

/**
 * HTML formatter for Recipe class.
 */
public class HtmlFormatter {

    public static String getHtmlFormat (Recipe recipe) {

        URL recipeCss = MainApp.class.getResource(FXML_FILE_FOLDER + "Recipe.css");
        URL bootstrapCss = MainApp.class.getResource(FXML_FILE_FOLDER + "bootstrap.css");

        String name = recipe.getName().toString();
        String cookingTime = recipe.getCookingTime().toString();
        String preparationTime = recipe.getPreparationTime().toString();
        String calories = recipe.getCalories().toString();
        String servings = recipe.getServings().toString();
        String image = recipe.getImage().getUsablePath();
        String ingredient = recipe.getIngredient().toString();
        String instruction = recipe.getInstruction().toString();

        return "<html>"
                + "<head>"
                + "<link rel='stylesheet' type='text/css' href='" + bootstrapCss.toExternalForm() + "' />"
                + "<link rel='stylesheet' type='text/css' href='" + recipeCss.toExternalForm() + "' />"
                + "</head>"
                + "<body>"
                + "<div class='row'>"
                + "<h1 class='name'>" + name + "</h1>"
                + "<div class='col-sm-6'>"
                + "<div class='col-sm-3'>"
                + "<h5>Cooking Time:</h5>"
                + "<p>" + cookingTime + "</p>"
                + "</div>"
                + "<div class='col-sm-3'>"
                + "<h5>Preparation Time:</h5>"
                + "<p>" + preparationTime + "</p>"
                + "</div>"
                + "<div class='col-sm-3'>"
                + "<h5>Calories:</h5>"
                + "<p>" + calories + "</p>"
                + "</div>"
                + "<div class='col-sm-3'>"
                + "<h5>Servings:</h5>"
                + "<p>" + servings + "</p>"
                + "</div>"
                + "</div>"
                + "<div class='col-sm-6'>"
                + "<img src='" + image + "' />"
                + "</div>"
                + "<div class='col-sm-12'>"
                + "<div class='col-sm-12'>"
                + "<h5>Ingredients:</h5>"
                + "<p>" + ingredient + "</p>"
                + "</div>"
                + "<div class='col-sm-12'>"
                + "<h5>Instructions:</h5>"
                + "<p>" + instruction + "</p>"
                + "</div>"
                + "</div>"
                + "</div>"
                + "</body>"
                + "</html>";
    }
}
```
###### /src/main/java/seedu/recipe/model/recipe/Image.java
``` java
package seedu.recipe.model.recipe;

import static java.util.Objects.requireNonNull;
import static seedu.recipe.commons.util.AppUtil.checkArgument;

import java.io.File;
import java.net.URL;

import seedu.recipe.MainApp;

/**
 * Represents a Recipe's image in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidImage(String)}
 */
public class Image {

    public static final String NULL_IMAGE_REFERENCE = "-";
    public static final String FILE_PREFIX = "file:";
    public static final String MESSAGE_IMAGE_CONSTRAINTS = "Image path should be valid";
    public static final URL VALID_IMAGE = MainApp.class.getResource("/images/clock.png");
    public static final String VALID_IMAGE_PATH = VALID_IMAGE.toExternalForm().substring(5);
    public final String value;

    /**
     * Constructs a {@code Image}.
     *
     * @param imagePath A valid file path.
     */
    public Image(String imagePath) {
        requireNonNull(imagePath);
        checkArgument(isValidImage(imagePath), MESSAGE_IMAGE_CONSTRAINTS);
        this.value = imagePath;
    }

    /**
     *  Returns true if a given string is a valid file path, or no file path has been assigned
     */
    public static boolean isValidImage(String testImagePath) {
        if (testImagePath.equals(NULL_IMAGE_REFERENCE)) {
            return true;
        }
        File image = new File(testImagePath);
        if (image.exists() && !image.isDirectory()) {
            return true;
        }
        return false;
    }

    public String getUsablePath() {
        return FILE_PREFIX + value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Image // instanceof handles nulls
                && this.value.equals(((Image) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
```
###### /src/main/java/seedu/recipe/model/recipe/Url.java
``` java
package seedu.recipe.model.recipe;

import static java.util.Objects.requireNonNull;
import static seedu.recipe.commons.util.AppUtil.checkArgument;

import java.net.URL;

/**
 * Represents a Recipe's URL in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidUrl(String)}
 */
public class Url {

    public static final String NULL_URL_REFERENCE = "-";
    public static final String MESSAGE_URL_CONSTRAINTS = "URL should start with a http:// or https://";
    public final String value;

    /**
     * Constructs a {@code Url}.
     *
     * @param url A valid Url.
     */
    public Url(String url) {
        requireNonNull(url);
        checkArgument(isValidUrl(url), MESSAGE_URL_CONSTRAINTS);
        this.value = url;
    }

    /**
     *  Returns true if a given string is a valid web url, or no url has been assigned
     */
    public static boolean isValidUrl(String testUrl) {
        if (testUrl.equals(NULL_URL_REFERENCE)) {
            return true;
        }
        try {
            URL url = new URL(testUrl);
            url.toURI();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Url // instanceof handles nulls
                && this.value.equals(((Url) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
```
###### /src/main/java/seedu/recipe/model/recipe/Recipe.java
``` java
    public String getTextFormattedRecipe() {
        return NAME_HEADER + getName() + LINE_BREAK
                + INGREDIENTS_HEADER + getIngredient() + LINE_BREAK
                + INSTRUCTIONS_HEADER + getInstruction() + LINE_BREAK;
    }
```
