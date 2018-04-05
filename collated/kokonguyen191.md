# kokonguyen191
###### /build/reports/jacoco/coverage/html/seedu.recipe.model.recipe/Servings.java.html
``` html
package seedu.recipe.model.recipe;

import static java.util.Objects.requireNonNull;
import static seedu.recipe.commons.util.AppUtil.checkArgument;

/**
 * Represents a Recipe's number of servings in the Recipe Book.
 * Guarantees: immutable; is valid as declared in {@link #isValidServings(String)}
 */
public class Servings {

    public static final String NULL_SERVINGS_REFERENCE = &quot;-&quot;;
    public static final String MESSAGE_SERVINGS_CONSTRAINTS = &quot;The number of servings must a positive integer.&quot;;
    public static final String SERVINGS_VALIDATION_REGEX = &quot;[\\d]+&quot;;
    public final String value;

    /**
     * Constructs a {@code Servings} object.
     *
     * @param servings A valid number of servings.
     */
<span class="fc" id="L23">    public Servings(String servings) {</span>
<span class="fc" id="L24">        requireNonNull(servings);</span>
<span class="fc" id="L25">        checkArgument(isValidServings(servings), MESSAGE_SERVINGS_CONSTRAINTS);</span>
<span class="fc" id="L26">        this.value = servings;</span>
<span class="fc" id="L27">    }</span>

    /**
     * Returns true if a given string is a valid number of servings.
     */
    public static boolean isValidServings(String test) {
<span class="fc bfc" id="L33" title="All 4 branches covered.">        return test.equals(NULL_SERVINGS_REFERENCE) || test.matches(SERVINGS_VALIDATION_REGEX);</span>
    }

    @Override
    public String toString() {
<span class="fc" id="L38">        return value;</span>
    }

    @Override
    public boolean equals(Object other) {
<span class="pc bpc" id="L43" title="1 of 4 branches missed.">        return other == this // short circuit if same object</span>
                || (other instanceof Servings // instanceof handles nulls
<span class="pc bpc" id="L45" title="1 of 2 branches missed.">                &amp;&amp; this.value.equals(((Servings) other).value)); // state check</span>
    }

    @Override
    public int hashCode() {
<span class="nc" id="L50">        return value.hashCode();</span>
    }

}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.model.recipe/PreparationTime.java.html
``` html
package seedu.recipe.model.recipe;

import static java.util.Objects.requireNonNull;
import static seedu.recipe.commons.util.AppUtil.checkArgument;

/**
 * Represents a Recipe's preparation time in the Recipe Book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPreparationTime(String)}
 */
public class PreparationTime {

    public static final String NULL_PREPARATION_TIME_REFERENCE = &quot;-&quot;;
    public static final String MESSAGE_PREPARATION_TIME_CONSTRAINTS =
            &quot;Preparation time can be in any of these format: 1h20m, 80m, 1 hour 20 minutes, 1 h 20 min, 80.&quot;;
    public static final String PREPARATION_TIME_VALIDATION_REGEX =
            &quot;([\\d]+[ ]{0,1}(minute[s]{0,1}|min[s]{0,1}|m|hour[s]{0,1}|h){0,1}[ ]{0,1}){1,2}&quot;;
    public final String value;

    /**
     * Constructs a {@code PreparationTime}.
     *
     * @param preparationTime A valid preparation time.
     */
<span class="fc" id="L25">    public PreparationTime(String preparationTime) {</span>
<span class="fc" id="L26">        requireNonNull(preparationTime);</span>
<span class="fc" id="L27">        checkArgument(isValidPreparationTime(preparationTime), MESSAGE_PREPARATION_TIME_CONSTRAINTS);</span>
<span class="fc" id="L28">        this.value = preparationTime;</span>
<span class="fc" id="L29">    }</span>

    /**
     * Returns true if a given string is a valid recipe preparation time.
     */
    public static boolean isValidPreparationTime(String test) {
<span class="fc bfc" id="L35" title="All 4 branches covered.">        return test.equals(NULL_PREPARATION_TIME_REFERENCE) || test.matches(PREPARATION_TIME_VALIDATION_REGEX);</span>
    }

    @Override
    public String toString() {
<span class="fc" id="L40">        return value;</span>
    }

    @Override
    public boolean equals(Object other) {
<span class="pc bpc" id="L45" title="1 of 4 branches missed.">        return other == this // short circuit if same object</span>
                || (other instanceof PreparationTime // instanceof handles nulls
<span class="fc bfc" id="L47" title="All 2 branches covered.">                &amp;&amp; this.value.equals(((PreparationTime) other).value)); // state check</span>
    }

    @Override
    public int hashCode() {
<span class="nc" id="L52">        return value.hashCode();</span>
    }

}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.model.recipe/CookingTime.java.html
``` html
package seedu.recipe.model.recipe;

import static java.util.Objects.requireNonNull;
import static seedu.recipe.commons.util.AppUtil.checkArgument;

/**
 * Represents a Recipe's cooking time in the Recipe Book.
 * Guarantees: immutable; is valid as declared in {@link #isValidCookingTime(String)}
 */
public class CookingTime {

    public static final String NULL_COOKING_TIME_REFERENCE = &quot;-&quot;;
    public static final String MESSAGE_COOKING_TIME_CONSTRAINTS =
            &quot;Cooking time can be in any of these format: 1h10m, 70m, 1 hour 10 minutes, 1 h 10 min, 70.&quot;;
    public static final String COOKING_TIME_VALIDATION_REGEX =
            &quot;([\\d]+[ ]{0,1}(minute[s]{0,1}|min[s]{0,1}|m|hour[s]{0,1}|h){0,1}[ ]{0,1}){1,2}&quot;;
    public final String value;

    /**
     * Constructs a {@code CookingTime}.
     *
     * @param cookingTime A valid cooking time.
     */
<span class="fc" id="L25">    public CookingTime(String cookingTime) {</span>
<span class="fc" id="L26">        requireNonNull(cookingTime);</span>
<span class="fc" id="L27">        checkArgument(isValidCookingTime(cookingTime), MESSAGE_COOKING_TIME_CONSTRAINTS);</span>
<span class="fc" id="L28">        this.value = cookingTime;</span>
<span class="fc" id="L29">    }</span>

    /**
     * Returns true if a given string is a valid recipe cooking time.
     */
    public static boolean isValidCookingTime(String test) {
<span class="fc bfc" id="L35" title="All 4 branches covered.">        return test.equals(NULL_COOKING_TIME_REFERENCE) || test.matches(COOKING_TIME_VALIDATION_REGEX);</span>
    }

    @Override
    public String toString() {
<span class="fc" id="L40">        return value;</span>
    }

    @Override
    public boolean equals(Object other) {
<span class="pc bpc" id="L45" title="1 of 4 branches missed.">        return other == this // short circuit if same object</span>
                || (other instanceof CookingTime // instanceof handles nulls
<span class="pc bpc" id="L47" title="1 of 2 branches missed.">                &amp;&amp; this.value.equals(((CookingTime) other).value)); // state check</span>
    }

    @Override
    public int hashCode() {
<span class="nc" id="L52">        return value.hashCode();</span>
    }

}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.model.recipe/Calories.java.html
``` html
package seedu.recipe.model.recipe;

import static java.util.Objects.requireNonNull;
import static seedu.recipe.commons.util.AppUtil.checkArgument;

/**
 * Represents a Recipe's number of calories in the Recipe Book.
 * Guarantees: immutable; is valid as declared in {@link #isValidCalories(String)}
 */
public class Calories {

    public static final String NULL_CALORIES_REFERENCE = &quot;-&quot;;
    public static final String MESSAGE_CALORIES_CONSTRAINTS = &quot;The number of calories must a positive integer.&quot;;
    public static final String CALORIES_VALIDATION_REGEX = &quot;[\\d]+&quot;;
    public final String value;

    /**
     * Constructs a {@code Calories} object.
     *
     * @param calories A valid number of calories.
     */
<span class="fc" id="L23">    public Calories(String calories) {</span>
<span class="fc" id="L24">        requireNonNull(calories);</span>
<span class="fc" id="L25">        checkArgument(isValidCalories(calories), MESSAGE_CALORIES_CONSTRAINTS);</span>
<span class="fc" id="L26">        this.value = calories;</span>
<span class="fc" id="L27">    }</span>

    /**
     * Returns true if a given string is a valid number of calories.
     */
    public static boolean isValidCalories(String test) {
<span class="fc bfc" id="L33" title="All 4 branches covered.">        return test.equals(NULL_CALORIES_REFERENCE) || test.matches(CALORIES_VALIDATION_REGEX);</span>
    }

    @Override
    public String toString() {
<span class="fc" id="L38">        return value;</span>
    }

    @Override
    public boolean equals(Object other) {
<span class="pc bpc" id="L43" title="1 of 4 branches missed.">        return other == this // short circuit if same object</span>
                || (other instanceof Calories // instanceof handles nulls
<span class="pc bpc" id="L45" title="1 of 2 branches missed.">                &amp;&amp; this.value.equals(((Calories) other).value)); // state check</span>
    }

    @Override
    public int hashCode() {
<span class="nc" id="L50">        return value.hashCode();</span>
    }

}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.commons.events.ui/ChangeThemeRequestEvent.java.html
``` html
package seedu.recipe.commons.events.ui;

import seedu.recipe.commons.events.BaseEvent;

/**
 * An event requesting to change the theme.
 */
<span class="fc" id="L9">public class ChangeThemeRequestEvent extends BaseEvent {</span>
    @Override
    public String toString() {
<span class="fc" id="L12">        return this.getClass().getSimpleName();</span>
    }
}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.commons.events.ui/WebParseRequestEvent.java.html
``` html
package seedu.recipe.commons.events.ui;

import seedu.recipe.commons.events.BaseEvent;

/**
 * Indicates a request to parse the page loaded in BrowserPanel.
 */
<span class="fc" id="L9">public class WebParseRequestEvent extends BaseEvent {</span>

    @Override
    public String toString() {
<span class="fc" id="L13">        return this.getClass().getSimpleName();</span>
    }

}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.commons.events.ui/InternetSearchRequestEvent.java.html
``` html
package seedu.recipe.commons.events.ui;

import seedu.recipe.commons.events.BaseEvent;
import seedu.recipe.logic.commands.util.WikiaQueryHandler;

/**
 * Indicates a request to search for recipe on the internet
 */
public class InternetSearchRequestEvent extends BaseEvent {

    public final WikiaQueryHandler wikiaQueryHandler;

<span class="fc" id="L14">    public InternetSearchRequestEvent(WikiaQueryHandler wikiaQueryHandler) {</span>
<span class="fc" id="L15">        this.wikiaQueryHandler = wikiaQueryHandler;</span>
<span class="fc" id="L16">    }</span>

    @Override
    public String toString() {
<span class="fc" id="L20">        return this.getClass().getSimpleName();</span>
    }

}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.commands.util/WikiaQueryHandler.java.html
``` html
package seedu.recipe.logic.commands.util;

import static java.util.Objects.requireNonNull;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.restfb.json.Json;
import com.restfb.json.JsonObject;

/**
 * Handle a query to recipes.wikia.com
 */
public class WikiaQueryHandler implements WikiaQuery {

    public static final String QUERY_URL = &quot;http://recipes.wikia.com/wiki/Special:Search?query=&quot;;
    private static final String API_QUERY_URL = &quot;http://recipes.wikia.com/api/v1/Search/List?query=&quot;;

    private String recipeToSearch;
    private URL queryUrl;
    private HttpURLConnection httpUrlConnection;
    private String rawDataString;
    private JsonObject rawDataJson;

<span class="fc" id="L31">    public WikiaQueryHandler(String recipeToSearch) {</span>
<span class="fc" id="L32">        requireNonNull(recipeToSearch);</span>
<span class="fc" id="L33">        this.recipeToSearch = recipeToSearch;</span>
<span class="fc" id="L34">        loadUrl();</span>
<span class="fc" id="L35">        startHttpConnection();</span>
<span class="fc" id="L36">        getRawData();</span>
<span class="fc" id="L37">        parseData();</span>
<span class="fc" id="L38">    }</span>

    @Override
    public String getRecipeQueryUrl() {
<span class="fc" id="L42">        return QUERY_URL + this.recipeToSearch;</span>
    }

    @Override
    public int getQueryNumberOfResults() {
<span class="fc bfc" id="L47" title="All 2 branches covered.">        return rawDataString == null ? 0 : rawDataJson.get(&quot;total&quot;).asInt();</span>
    }

    /**
     * Creates a {@code URL} object from given {@code recipeToSearch} string.
     */
    private void loadUrl() {
<span class="fc" id="L54">        requireNonNull(recipeToSearch);</span>
        try {
<span class="fc" id="L56">            queryUrl = new URL(API_QUERY_URL + recipeToSearch);</span>
<span class="nc" id="L57">        } catch (MalformedURLException mue) {</span>
<span class="nc" id="L58">            throw new AssertionError(&quot;Invalid query URL. This should not happen.&quot;, mue);</span>
<span class="fc" id="L59">        }</span>
<span class="fc" id="L60">    }</span>

    /**
     * Creates a HTTP connection from the {@code URL} object.
     */
    private void startHttpConnection() {
<span class="fc" id="L66">        requireNonNull(queryUrl);</span>
        try {
<span class="fc" id="L68">            httpUrlConnection = (HttpURLConnection) queryUrl.openConnection();</span>
<span class="fc" id="L69">            httpUrlConnection.setRequestMethod(&quot;GET&quot;);</span>
<span class="nc" id="L70">        } catch (IOException ioe) {</span>
<span class="nc" id="L71">            throw new AssertionError(&quot;Something went wrong while the app was &quot;</span>
<span class="nc" id="L72">                    + &quot;trying to create a connection to &quot; + queryUrl.toExternalForm(), ioe);</span>
<span class="fc" id="L73">        }</span>
<span class="fc" id="L74">    }</span>

    /**
     * Reads the HTTP connection and print data to {@code rawDataString}.
     * Adapted from https://stackoverflow.com/questions/1485708/how-do-i-do-a-http-get-in-java
     */
    private void getRawData() {
<span class="fc" id="L81">        requireNonNull(queryUrl);</span>
<span class="fc" id="L82">        requireNonNull(httpUrlConnection);</span>

<span class="fc" id="L84">        StringBuilder result = new StringBuilder();</span>
        BufferedReader br;
        try {
<span class="fc" id="L87">            br = new BufferedReader(new InputStreamReader(httpUrlConnection.getInputStream()));</span>
            String line;
<span class="fc bfc" id="L89" title="All 2 branches covered.">            while ((line = br.readLine()) != null) {</span>
<span class="fc" id="L90">                result.append(line);</span>
            }
<span class="fc" id="L92">            br.close();</span>
<span class="fc" id="L93">            rawDataString = result.toString();</span>
<span class="fc" id="L94">        } catch (FileNotFoundException fnfe) {</span>
<span class="fc" id="L95">            rawDataString = null;</span>
<span class="fc" id="L96">        } catch (IOException ie) {</span>
<span class="fc" id="L97">            throw new AssertionError(&quot;Something wrong happened while the app &quot;</span>
<span class="fc" id="L98">                    + &quot;was trying to read data from the url &quot; + queryUrl.toExternalForm(), ie);</span>
<span class="fc" id="L99">        }</span>
<span class="fc" id="L100">    }</span>

    /**
     * Gets a {@code JSONObject} from {@code rawDataString}
     */
    private void parseData() {
<span class="fc bfc" id="L106" title="All 2 branches covered.">        if (rawDataString != null) {</span>
<span class="fc" id="L107">            rawDataJson = (JsonObject) Json.parse(rawDataString);</span>
        }
<span class="fc" id="L109">    }</span>
}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.parser/ArgumentTokenizer.java.html
``` html
    private static int findPrefixPosition(String argsString, String prefix, int fromIndex) {
<span class="fc" id="L78">        Pattern pattern = Pattern.compile(&quot;[ \n]&quot; + &quot;\\Q&quot; + prefix + &quot;\\E&quot;);</span>
<span class="fc" id="L79">        Matcher matcher = pattern.matcher(argsString);</span>
<span class="fc bfc" id="L80" title="All 2 branches covered.">        if (matcher.find(fromIndex)) {</span>
<span class="fc" id="L81">            return matcher.start() + 1;</span>
        } else {
<span class="fc" id="L83">            return -1;</span>
        }
    }
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.parser/ParserUtil.java.html
``` html
    /**
     * Returns a null {@code Ingredient} object to use as the default value if no value is given.
     */
    public static Ingredient getNullReferenceIngredient() throws IllegalValueException {
<span class="fc" id="L81">        return new Ingredient(Ingredient.NULL_INGREDIENT_REFERENCE);</span>
    }

    /**
     * Parses a {@code String ingredient} into an {@code Ingredient}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code ingredient} is invalid.
     */
    public static Ingredient parseIngredient(String ingredient) throws IllegalValueException {
<span class="fc" id="L91">        requireNonNull(ingredient);</span>
<span class="fc" id="L92">        String trimmedIngredient = ingredient.trim();</span>
<span class="fc bfc" id="L93" title="All 2 branches covered.">        if (!Ingredient.isValidIngredient(trimmedIngredient)) {</span>
<span class="fc" id="L94">            throw new IllegalValueException(Ingredient.MESSAGE_INGREDIENT_CONSTRAINTS);</span>
        }
<span class="fc" id="L96">        return new Ingredient(trimmedIngredient);</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; ingredient} into an {@code Optional&lt;Ingredient&gt;}
     * if {@code ingredient} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;Ingredient&gt; parseIngredient(Optional&lt;String&gt; ingredient) throws IllegalValueException {
<span class="fc" id="L105">        requireNonNull(ingredient);</span>
<span class="fc bfc" id="L106" title="All 2 branches covered.">        return ingredient.isPresent() ? Optional.of(parseIngredient(ingredient.get())) : Optional.empty();</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; ingredient} into an {@code Optional&lt;Ingredient&gt;}
     * if {@code ingredient} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;Ingredient&gt; parseIngredientOnInitialAdd(Optional&lt;String&gt; ingredient)
            throws IllegalValueException {
<span class="fc" id="L116">        requireNonNull(ingredient);</span>
<span class="fc bfc" id="L117" title="All 2 branches covered.">        return ingredient.isPresent()</span>
<span class="fc" id="L118">                ? Optional.of(parseIngredient(ingredient.get())) : Optional.of(getNullReferenceIngredient());</span>
    }

    /**
     * Returns a null {@code Instruction} object to use as the default value if no value is given.
     */
    public static Instruction getNullReferenceInstruction() throws IllegalValueException {
<span class="fc" id="L125">        return new Instruction(Instruction.NULL_INSTRUCTION_REFERENCE);</span>
    }

    /**
     * Parses a {@code String recipe} into an {@code Instruction}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code recipe} is invalid.
     */
    public static Instruction parseInstruction(String instruction) throws IllegalValueException {
<span class="fc" id="L135">        requireNonNull(instruction);</span>
<span class="fc" id="L136">        String trimmedInstruction = instruction.trim();</span>
<span class="fc bfc" id="L137" title="All 2 branches covered.">        if (!Instruction.isValidInstuction(trimmedInstruction)) {</span>
<span class="fc" id="L138">            throw new IllegalValueException(Instruction.MESSAGE_INSTRUCTION_CONSTRAINTS);</span>
        }
<span class="fc" id="L140">        return new Instruction(trimmedInstruction);</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; recipe} into an {@code Optional&lt;Instruction&gt;} if {@code recipe} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;Instruction&gt; parseInstruction(Optional&lt;String&gt; instruction) throws IllegalValueException {
<span class="fc" id="L148">        requireNonNull(instruction);</span>
<span class="fc bfc" id="L149" title="All 2 branches covered.">        return instruction.isPresent() ? Optional.of(parseInstruction(instruction.get())) : Optional.empty();</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; instruction} into an {@code Optional&lt;Instruction&gt;}
     * if {@code instruction} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;Instruction&gt; parseInstructionOnInitialAdd(Optional&lt;String&gt; instruction)
            throws IllegalValueException {
<span class="fc" id="L159">        requireNonNull(instruction);</span>
<span class="fc bfc" id="L160" title="All 2 branches covered.">        return instruction.isPresent()</span>
<span class="fc" id="L161">                ? Optional.of(parseInstruction(instruction.get())) : Optional.of(getNullReferenceInstruction());</span>
    }

    /**
     * Returns a null {@code CookingTime} object to use as the default value if no value is given.
     */
    public static CookingTime getNullReferenceCookingTime() throws IllegalValueException {
<span class="fc" id="L168">        return new CookingTime(CookingTime.NULL_COOKING_TIME_REFERENCE);</span>
    }

    /**
     * Parses a {@code String cookingTime} into a {@code CookingTime}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code cookingTime} is invalid.
     */
    public static CookingTime parseCookingTime(String cookingTime) throws IllegalValueException {
<span class="fc" id="L178">        requireNonNull(cookingTime);</span>
<span class="fc" id="L179">        String trimmedCookingTime = cookingTime.trim();</span>
<span class="fc bfc" id="L180" title="All 2 branches covered.">        if (!CookingTime.isValidCookingTime(trimmedCookingTime)) {</span>
<span class="fc" id="L181">            throw new IllegalValueException(CookingTime.MESSAGE_COOKING_TIME_CONSTRAINTS);</span>
        }
<span class="fc" id="L183">        return new CookingTime(trimmedCookingTime);</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; cookingTime} into an {@code Optional&lt;CookingTime&gt;}
     * if {@code cookingTime} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;CookingTime&gt; parseCookingTime(Optional&lt;String&gt; cookingTime) throws IllegalValueException {
<span class="fc" id="L192">        requireNonNull(cookingTime);</span>
<span class="fc bfc" id="L193" title="All 2 branches covered.">        return cookingTime.isPresent()</span>
<span class="fc" id="L194">                ? Optional.of(parseCookingTime(cookingTime.get())) : Optional.empty();</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; cookingTime} into an {@code Optional&lt;CookingTime&gt;}
     * if {@code cookingTime} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;CookingTime&gt; parseCookingTimeOnInitialAdd(Optional&lt;String&gt; cookingTime)
            throws IllegalValueException {
<span class="fc" id="L204">        requireNonNull(cookingTime);</span>
<span class="fc bfc" id="L205" title="All 2 branches covered.">        return cookingTime.isPresent()</span>
<span class="fc" id="L206">                ? Optional.of(parseCookingTime(cookingTime.get())) : Optional.of(getNullReferenceCookingTime());</span>
    }

    /**
     * Returns a null {@code PreparationTime} object to use as the default value if no value is given.
     */
    public static PreparationTime getNullReferencePreparationTime() throws IllegalValueException {
<span class="fc" id="L213">        return new PreparationTime(PreparationTime.NULL_PREPARATION_TIME_REFERENCE);</span>
    }

    /**
     * Parses a {@code String preparationTime} into a {@code PreparationTime}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code preparationTime} is invalid.
     */
    public static PreparationTime parsePreparationTime(String preparationTime) throws IllegalValueException {
<span class="fc" id="L223">        requireNonNull(preparationTime);</span>
<span class="fc" id="L224">        String trimmedPreparationTime = preparationTime.trim();</span>
<span class="fc bfc" id="L225" title="All 2 branches covered.">        if (!PreparationTime.isValidPreparationTime(trimmedPreparationTime)) {</span>
<span class="fc" id="L226">            throw new IllegalValueException(PreparationTime.MESSAGE_PREPARATION_TIME_CONSTRAINTS);</span>
        }
<span class="fc" id="L228">        return new PreparationTime(trimmedPreparationTime);</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; preparationTime} into an {@code Optional&lt;PreparationTime&gt;}
     * if {@code preparationTime} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;PreparationTime&gt; parsePreparationTime(Optional&lt;String&gt; preparationTime)
            throws IllegalValueException {
<span class="fc" id="L238">        requireNonNull(preparationTime);</span>
<span class="fc bfc" id="L239" title="All 2 branches covered.">        return preparationTime.isPresent()</span>
<span class="fc" id="L240">                ? Optional.of(parsePreparationTime(preparationTime.get())) : Optional.empty();</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; preparationTime} into an {@code Optional&lt;PreparationTime&gt;}
     * if {@code preparationTime} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;PreparationTime&gt; parsePreparationTimeOnInitialAdd(Optional&lt;String&gt; preparationTime)
            throws IllegalValueException {
<span class="fc" id="L250">        requireNonNull(preparationTime);</span>
<span class="fc bfc" id="L251" title="All 2 branches covered.">        return preparationTime.isPresent() ? Optional.of(parsePreparationTime(preparationTime.get()))</span>
<span class="fc" id="L252">                : Optional.of(getNullReferencePreparationTime());</span>
    }

    /**
     * Returns a null {@code Calories} object to use as the default value if no value is given.
     */
    public static Calories getNullReferenceCalories() throws IllegalValueException {
<span class="fc" id="L259">        return new Calories(Calories.NULL_CALORIES_REFERENCE);</span>
    }

    /**
     * Parses a {@code String calories} into a {@code Calories}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code calories} is invalid.
     */
    public static Calories parseCalories(String calories) throws IllegalValueException {
<span class="fc" id="L269">        requireNonNull(calories);</span>
<span class="fc" id="L270">        String trimmedCalories = calories.trim();</span>
<span class="fc bfc" id="L271" title="All 2 branches covered.">        if (!Calories.isValidCalories(trimmedCalories)) {</span>
<span class="fc" id="L272">            throw new IllegalValueException(Calories.MESSAGE_CALORIES_CONSTRAINTS);</span>
        }
<span class="fc" id="L274">        return new Calories(trimmedCalories);</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; calories} into an {@code Optional&lt;Calories&gt;}
     * if {@code calories} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;Calories&gt; parseCalories(Optional&lt;String&gt; calories) throws IllegalValueException {
<span class="fc" id="L283">        requireNonNull(calories);</span>
<span class="fc bfc" id="L284" title="All 2 branches covered.">        return calories.isPresent()</span>
<span class="fc" id="L285">                ? Optional.of(parseCalories(calories.get())) : Optional.empty();</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; calories} into an {@code Optional&lt;Calories&gt;}
     * if {@code calories} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;Calories&gt; parseCaloriesOnInitialAdd(Optional&lt;String&gt; calories) throws IllegalValueException {
<span class="fc" id="L294">        requireNonNull(calories);</span>
<span class="fc bfc" id="L295" title="All 2 branches covered.">        return calories.isPresent()</span>
<span class="fc" id="L296">                ? Optional.of(parseCalories(calories.get())) : Optional.of(getNullReferenceCalories());</span>
    }

    /**
     * Returns a null {@code Servings} object to use as the default value if no value is given.
     */
    public static Servings getNullReferenceServings() throws IllegalValueException {
<span class="fc" id="L303">        return new Servings(Servings.NULL_SERVINGS_REFERENCE);</span>
    }

    /**
     * Parses a {@code String servings} into a {@code Servings}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code servings} is invalid.
     */
    public static Servings parseServings(String servings) throws IllegalValueException {
<span class="fc" id="L313">        requireNonNull(servings);</span>
<span class="fc" id="L314">        String trimmedServings = servings.trim();</span>
<span class="fc bfc" id="L315" title="All 2 branches covered.">        if (!Servings.isValidServings(trimmedServings)) {</span>
<span class="fc" id="L316">            throw new IllegalValueException(Servings.MESSAGE_SERVINGS_CONSTRAINTS);</span>
        }
<span class="fc" id="L318">        return new Servings(trimmedServings);</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; servings} into an {@code Optional&lt;Servings&gt;}
     * if {@code servings} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;Servings&gt; parseServings(Optional&lt;String&gt; servings) throws IllegalValueException {
<span class="fc" id="L327">        requireNonNull(servings);</span>
<span class="fc bfc" id="L328" title="All 2 branches covered.">        return servings.isPresent()</span>
<span class="fc" id="L329">                ? Optional.of(parseServings(servings.get())) : Optional.empty();</span>
    }

    /**
     * Parses a {@code Optional&lt;String&gt; servings} into an {@code Optional&lt;Servings&gt;}
     * if {@code servings} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional&lt;Servings&gt; parseServingsOnInitialAdd(Optional&lt;String&gt; servings) throws IllegalValueException {
<span class="fc" id="L338">        requireNonNull(servings);</span>
<span class="fc bfc" id="L339" title="All 2 branches covered.">        return servings.isPresent()</span>
<span class="fc" id="L340">                ? Optional.of(parseServings(servings.get())) : Optional.of(getNullReferenceServings());</span>
    }

```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.parser/SearchCommandParser.java.html
``` html
package seedu.recipe.logic.parser;

import static seedu.recipe.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.recipe.logic.commands.SearchCommand;
import seedu.recipe.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new {@code SearchCommand} object
 */
<span class="fc" id="L12">public class SearchCommandParser implements Parser&lt;SearchCommand&gt; {</span>

    /**
     * Parses the given {@code String} of arguments in the context of the SearchCOmmand
     * and returns an {@code SearchCommand} object for execution.
     *
     * @throws ParseException if the user input does not conform the expected format
     */
    public SearchCommand parse(String args) throws ParseException {
<span class="fc" id="L21">        String trimmedArgs = args.trim();</span>
<span class="fc bfc" id="L22" title="All 2 branches covered.">        if (trimmedArgs.isEmpty()) {</span>
<span class="fc" id="L23">            throw new ParseException(</span>
<span class="fc" id="L24">                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, SearchCommand.MESSAGE_USAGE));</span>
        }

<span class="fc" id="L27">        String[] keywords = trimmedArgs.split(&quot;\\s+&quot;);</span>

<span class="fc" id="L29">        return new SearchCommand(String.join(&quot;+&quot;, keywords));</span>
    }

}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui.util/WikiaParser.java.html
``` html
package seedu.recipe.ui.util;

import static java.util.Objects.requireNonNull;
import static seedu.recipe.logic.commands.AddCommand.COMMAND_WORD;
import static seedu.recipe.logic.parser.CliSyntax.PREFIX_IMG;
import static seedu.recipe.logic.parser.CliSyntax.PREFIX_INGREDIENT;
import static seedu.recipe.logic.parser.CliSyntax.PREFIX_INSTRUCTION;
import static seedu.recipe.logic.parser.CliSyntax.PREFIX_NAME;

import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * A WebParser for recipes.wikia.com
 */
public class WikiaParser implements WebParser {

    public static final String DOMAIN = &quot;recipes.wikia.com&quot;;
    private static final String LF = &quot;\n&quot;;

    private Document document;
    private Element contentText;

    /**
     * Constructs from a Ssoup Document.
     */
<span class="fc" id="L33">    public WikiaParser(Document document) {</span>
<span class="fc" id="L34">        requireNonNull(document);</span>
<span class="fc" id="L35">        this.document = document;</span>
<span class="fc" id="L36">        contentText = this.document.getElementById(&quot;mw-content-text&quot;);</span>
<span class="fc" id="L37">    }</span>

    /**
     * Constructs from a HTML string.
     */
<span class="fc" id="L42">    public WikiaParser(String html) {</span>
<span class="fc" id="L43">        requireNonNull(html);</span>
<span class="fc" id="L44">        this.document = Jsoup.parse(html);</span>
<span class="fc" id="L45">        contentText = this.document.getElementById(&quot;mw-content-text&quot;);</span>
<span class="fc" id="L46">    }</span>

    @Override
    public String parseRecipe() {
<span class="fc" id="L50">        String name = getName();</span>
<span class="fc" id="L51">        String ingredient = getIngredient();</span>
<span class="fc" id="L52">        String instruction = getInstruction();</span>
<span class="fc" id="L53">        String imageUrl = getImageUrl();</span>

<span class="pc bpc" id="L55" title="1 of 2 branches missed.">        if (!name.equals(&quot;&quot;)) {</span>
<span class="fc" id="L56">            StringBuilder commandBuilder = new StringBuilder();</span>
<span class="fc" id="L57">            commandBuilder.append(COMMAND_WORD);</span>
<span class="fc" id="L58">            commandBuilder.append(LF);</span>
<span class="fc" id="L59">            commandBuilder.append(PREFIX_NAME);</span>
<span class="fc" id="L60">            commandBuilder.append(name);</span>
<span class="fc bfc" id="L61" title="All 2 branches covered.">            if (!ingredient.equals(&quot;&quot;)) {</span>
<span class="fc" id="L62">                commandBuilder.append(LF);</span>
<span class="fc" id="L63">                commandBuilder.append(PREFIX_INGREDIENT);</span>
<span class="fc" id="L64">                commandBuilder.append(ingredient);</span>
            }
<span class="fc bfc" id="L66" title="All 2 branches covered.">            if (!instruction.equals(&quot;&quot;)) {</span>
<span class="fc" id="L67">                commandBuilder.append(LF);</span>
<span class="fc" id="L68">                commandBuilder.append(PREFIX_INSTRUCTION);</span>
<span class="fc" id="L69">                commandBuilder.append(instruction);</span>
            }
<span class="fc bfc" id="L71" title="All 2 branches covered.">            if (!imageUrl.equals(&quot;&quot;)) {</span>
<span class="fc" id="L72">                commandBuilder.append(LF);</span>
<span class="fc" id="L73">                commandBuilder.append(PREFIX_IMG);</span>
<span class="fc" id="L74">                commandBuilder.append(imageUrl);</span>
            }
<span class="fc" id="L76">            return commandBuilder.toString();</span>
        }
<span class="nc" id="L78">        return null;</span>
    }

    public String getName() {
<span class="fc" id="L82">        return document.selectFirst(&quot;.page-header__title&quot;).text();</span>
    }

    public String getIngredient() {
<span class="fc" id="L86">        Elements elements = contentText.select(&quot;h2,ul&quot;);</span>
<span class="fc" id="L87">        Iterator&lt;Element&gt; eleIte = elements.iterator();</span>
<span class="fc bfc" id="L88" title="All 4 branches covered.">        while (eleIte.hasNext() &amp;&amp; !eleIte.next().text().startsWith(&quot;Ingredient&quot;)) {</span>
            // Do nothing and just go to the line that starts with &quot;Ingredient&quot;
        }

<span class="fc" id="L92">        Elements elementsWithIngredientWithLink = new Elements();</span>
<span class="fc" id="L93">        Elements elementsWithIngredient = new Elements();</span>
<span class="fc bfc" id="L94" title="All 2 branches covered.">        while (eleIte.hasNext()) {</span>
<span class="fc" id="L95">            Element nextElement = eleIte.next();</span>
<span class="fc bfc" id="L96" title="All 2 branches covered.">            if (nextElement.tagName().contains(&quot;h2&quot;)) {</span>
<span class="fc" id="L97">                break;</span>
            }
<span class="fc" id="L99">            elementsWithIngredient.addAll(nextElement.select(&quot;li&quot;));</span>
<span class="fc" id="L100">            elementsWithIngredientWithLink.addAll(nextElement.select(&quot;a&quot;));</span>
<span class="fc" id="L101">        }</span>

        List&lt;String&gt; ingredientList;
<span class="fc bfc" id="L104" title="All 2 branches covered.">        if (elementsWithIngredientWithLink.isEmpty()) {</span>
<span class="fc" id="L105">            ingredientList = elementsWithIngredient.eachText();</span>
        } else {
<span class="fc" id="L107">            ingredientList = elementsWithIngredientWithLink.eachText();</span>
        }
<span class="fc" id="L109">        return String.join(&quot;, &quot;, ingredientList);</span>
    }

    public String getInstruction() {
<span class="fc" id="L113">        Elements elementsWithInstruction = contentText.select(&quot;ol li&quot;);</span>
<span class="fc" id="L114">        List&lt;String&gt; instructionList = elementsWithInstruction.eachText();</span>
<span class="fc" id="L115">        return String.join(&quot;\n&quot;, instructionList);</span>
    }

    public String getImageUrl() {
<span class="fc" id="L119">        Element image = contentText.selectFirst(&quot;.image img&quot;);</span>
<span class="fc bfc" id="L120" title="All 2 branches covered.">        if (image == null) {</span>
<span class="fc" id="L121">            return &quot;&quot;;</span>
        } else {
<span class="fc" id="L123">            return image.attr(&quot;src&quot;);</span>
        }
    }

    @Override
    public boolean equals(Object other) {
<span class="nc bnc" id="L129" title="All 4 branches missed.">        return other == this // short circuit if same object</span>
                || (other instanceof WikiaParser // instanceof handles nulls
<span class="nc bnc" id="L131" title="All 2 branches missed.">                &amp;&amp; document.equals(((WikiaParser) other).document));</span>
    }
}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui.util/WebParserHandler.java.html
``` html
package seedu.recipe.ui.util;

import java.net.URI;
import java.net.URISyntaxException;

import org.jsoup.helper.W3CDom;
import org.w3c.dom.Document;

import javafx.scene.web.WebView;

/**
 * Handles a WebParseRequestEvent
 */
public class WebParserHandler {

    private WebView browser;

<span class="fc" id="L19">    public WebParserHandler(WebView browser) {</span>
<span class="fc" id="L20">        this.browser = browser;</span>
<span class="fc" id="L21">    }</span>

    /**
     * Returns the according WebParser to the currently loaded page in the BrowserPanel
     */
    public WebParser getWebParser() {
<span class="fc" id="L27">        String url = browser.getEngine().getLocation();</span>
<span class="fc" id="L28">        Document document = browser.getEngine().getDocument();</span>
<span class="fc bfc" id="L29" title="All 2 branches covered.">        if (browser.getEngine().getTitle() != null) {</span>
<span class="fc" id="L30">            return WebParserHandler.getWebParser(url, document);</span>
        } else {
<span class="fc" id="L32">            return null;</span>
        }
    }

    /**
     * Reads the {@code url}, returns the according WebParser loaded with {@code document}
     */
    public static WebParser getWebParser(String url, Document document) {
        try {
<span class="fc" id="L41">            URI uri = new URI(url);</span>
<span class="fc" id="L42">            String domain = uri.getHost();</span>
<span class="fc" id="L43">            W3CDom w3CDom = new W3CDom();</span>
<span class="fc" id="L44">            String documentString = w3CDom.asString(document);</span>
<span class="pc bpc" id="L45" title="1 of 6 branches missed.">            switch (domain) {</span>

            case WikiaParser.DOMAIN:
<span class="fc" id="L48">                return new WikiaParser(documentString);</span>

            default:
<span class="fc" id="L51">                return null;</span>

            }
<span class="nc" id="L54">        } catch (URISyntaxException e) {</span>
<span class="nc" id="L55">            return null;</span>
        }
    }
}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.commands/SearchCommand.java.html
``` html
package seedu.recipe.logic.commands;

import seedu.recipe.commons.core.EventsCenter;
import seedu.recipe.commons.events.ui.InternetSearchRequestEvent;
import seedu.recipe.logic.commands.exceptions.CommandException;
import seedu.recipe.logic.commands.util.WikiaQueryHandler;

/**
 * Selects a recipe identified using it's last displayed index from the recipe book.
 */
public class SearchCommand extends Command {

    public static final String COMMAND_WORD = &quot;search&quot;;

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + &quot;: Search the recipe on recipes.wikia.com.\n&quot;
            + &quot;Parameters: NAME\n&quot;
            + &quot;Example: &quot; + COMMAND_WORD + &quot; chicken rice&quot;;
    public static final String MESSAGE_FAILURE = &quot;No recipes found. Please try another query.&quot;;
    public static final String MESSAGE_SUCCESS = &quot;Found %1$s recipe(s). Please wait while the page is loading...&quot;;

    private final String recipeToSearch;
    private final WikiaQueryHandler wikiaQueryHandler;

<span class="fc" id="L26">    public SearchCommand(String recipeToSearch) {</span>
<span class="fc" id="L27">        this.recipeToSearch = recipeToSearch;</span>
<span class="fc" id="L28">        this.wikiaQueryHandler = new WikiaQueryHandler(recipeToSearch);</span>
<span class="fc" id="L29">    }</span>

    @Override
    public CommandResult execute() throws CommandException {
<span class="fc" id="L33">        int noOfResult = wikiaQueryHandler.getQueryNumberOfResults();</span>

<span class="fc" id="L35">        EventsCenter.getInstance().post(new InternetSearchRequestEvent(wikiaQueryHandler));</span>

<span class="fc bfc" id="L37" title="All 2 branches covered.">        if (noOfResult == 0) {</span>
<span class="fc" id="L38">            return new CommandResult(MESSAGE_FAILURE);</span>
        } else {
<span class="fc" id="L40">            return new CommandResult(String.format(MESSAGE_SUCCESS, noOfResult));</span>
        }
    }

    @Override
    public boolean equals(Object other) {
<span class="fc bfc" id="L46" title="All 4 branches covered.">        return other == this // short circuit if same object</span>
                || (other instanceof SearchCommand // instanceof handles nulls
<span class="fc bfc" id="L48" title="All 2 branches covered.">                &amp;&amp; this.recipeToSearch.equals(((SearchCommand) other).recipeToSearch)); // state check</span>
    }
}

</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.commands/ParseCommand.java.html
``` html
package seedu.recipe.logic.commands;

import seedu.recipe.commons.core.EventsCenter;
import seedu.recipe.commons.events.ui.WebParseRequestEvent;

/**
 * Parse the current page loaded in the BrowserPanel.
 */
<span class="fc" id="L10">public class ParseCommand extends Command {</span>

    public static final String COMMAND_WORD = &quot;parse&quot;;
    public static final String MESSAGE_SUCCESS = &quot;ReciRecipe tried to parse the web page.&quot;;

    @Override
    public CommandResult execute() {
<span class="fc" id="L17">        EventsCenter.getInstance().post(new WebParseRequestEvent());</span>
<span class="fc" id="L18">        return new CommandResult(MESSAGE_SUCCESS);</span>
    }

    @Override
    public boolean equals(Object other) {
<span class="nc bnc" id="L23" title="All 4 branches missed.">        return other == this // short circuit if same object</span>
                || (other instanceof ParseCommand); // instanceof handles nulls
    }
}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.logic.commands/ChangeThemeCommand.java.html
``` html
package seedu.recipe.logic.commands;

import seedu.recipe.commons.core.EventsCenter;
import seedu.recipe.commons.events.ui.ChangeThemeRequestEvent;

/**
 * Toggle between dark/light theme.
 */
<span class="fc" id="L10">public class ChangeThemeCommand extends Command {</span>

    public static final String COMMAND_WORD = &quot;theme&quot;;

    public static final String SHOWING_CHANGE_THEME_MESSAGE = &quot;Theme changed.&quot;;

    @Override
    public CommandResult execute() {
<span class="fc" id="L18">        EventsCenter.getInstance().post(new ChangeThemeRequestEvent());</span>
<span class="fc" id="L19">        return new CommandResult(SHOWING_CHANGE_THEME_MESSAGE);</span>
    }
}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui/MainWindow.java.html
``` html
    @Subscribe
    private void handleChangeThemeRequestEvent(ChangeThemeRequestEvent event) {
<span class="fc" id="L181">        logger.info(LogsCenter.getEventHandlingLogMessage(event));</span>
<span class="fc" id="L182">        handleChangeTheme();</span>
<span class="fc" id="L183">    }</span>

    /**
     * Toggle between dark and light theme
     */
    @FXML
    public void handleChangeTheme() {
<span class="fc" id="L190">        boolean isUsingDarkTheme = prefs.getIsUsingDarkTheme();</span>
<span class="fc bfc" id="L191" title="All 2 branches covered.">        browserPanel.loadDefaultPage(!isUsingDarkTheme);</span>
<span class="fc bfc" id="L192" title="All 2 branches covered.">        loadStyle(!isUsingDarkTheme);</span>
<span class="fc bfc" id="L193" title="All 2 branches covered.">        prefs.setIsUsingDarkTheme(!isUsingDarkTheme);</span>
<span class="fc" id="L194">    }</span>

    @Subscribe
    private void handleWebParseRequestEvent(WebParseRequestEvent event) {
<span class="fc" id="L198">        logger.info(LogsCenter.getEventHandlingLogMessage(event));</span>
<span class="fc" id="L199">        String parsedRecipe = browserPanel.parseRecipe();</span>
<span class="pc bpc" id="L200" title="1 of 2 branches missed.">        if (parsedRecipe != null) {</span>
<span class="fc" id="L201">            commandBox.replaceText(parsedRecipe);</span>
        } else {
<span class="nc" id="L203">            commandBox.replaceText(&quot;&quot;);</span>
        }
<span class="fc" id="L205">    }</span>

```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui/BrowserPanel.java.html
``` html
    @Subscribe
    private void handleInternetSearchRequestEvent(InternetSearchRequestEvent event) {
<span class="fc" id="L134">        logger.info(LogsCenter.getEventHandlingLogMessage(event));</span>
<span class="fc bfc" id="L135" title="All 2 branches covered.">        if (event.wikiaQueryHandler.getQueryNumberOfResults() != 0) {</span>
<span class="fc" id="L136">            loadPage(event.wikiaQueryHandler.getRecipeQueryUrl());</span>
        }
<span class="fc" id="L138">    }</span>

    private void initializeWebParserHandler() {
<span class="fc" id="L141">        webParserHandler = new WebParserHandler(browser);</span>
<span class="fc" id="L142">    }</span>

    /**
     * Parses the BrowserPanel, gets an AddCommand string.
     */
    public String parseRecipe() {
<span class="fc" id="L148">        WebParser webParser = webParserHandler.getWebParser();</span>
<span class="pc bpc" id="L149" title="1 of 2 branches missed.">        if (webParser != null) {</span>
<span class="fc" id="L150">            return webParser.parseRecipe();</span>
        } else {
<span class="nc" id="L152">            return null;</span>
        }
    }

```
###### /build/reports/jacoco/coverage/html/seedu.recipe.storage/XmlAdaptedRecipe.java.html
``` html
<span class="fc bfc" id="L121" title="All 2 branches covered.">        if (this.ingredient == null) {</span>
<span class="fc" id="L122">            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,</span>
<span class="fc" id="L123">                    Ingredient.class.getSimpleName()));</span>
        }
<span class="fc bfc" id="L125" title="All 2 branches covered.">        if (!Ingredient.isValidIngredient(this.ingredient)) {</span>
<span class="fc" id="L126">            throw new IllegalValueException(Ingredient.MESSAGE_INGREDIENT_CONSTRAINTS);</span>
        }
<span class="fc" id="L128">        final Ingredient ingredient = new Ingredient(this.ingredient);</span>

<span class="fc bfc" id="L130" title="All 2 branches covered.">        if (this.instruction == null) {</span>
<span class="fc" id="L131">            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,</span>
<span class="fc" id="L132">                    Instruction.class.getSimpleName()));</span>
        }
<span class="fc bfc" id="L134" title="All 2 branches covered.">        if (!Instruction.isValidInstuction(this.instruction)) {</span>
<span class="fc" id="L135">            throw new IllegalValueException(Instruction.MESSAGE_INSTRUCTION_CONSTRAINTS);</span>
        }
<span class="fc" id="L137">        final Instruction instruction = new Instruction(this.instruction);</span>

<span class="fc bfc" id="L139" title="All 2 branches covered.">        if (this.preparationTime == null) {</span>
<span class="fc" id="L140">            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,</span>
<span class="fc" id="L141">                    PreparationTime.class.getSimpleName()));</span>
        }
<span class="fc bfc" id="L143" title="All 2 branches covered.">        if (!PreparationTime.isValidPreparationTime(this.preparationTime)) {</span>
<span class="fc" id="L144">            throw new IllegalValueException(PreparationTime.MESSAGE_PREPARATION_TIME_CONSTRAINTS);</span>
        }
<span class="fc" id="L146">        final PreparationTime preparationTime = new PreparationTime(this.preparationTime);</span>

<span class="fc bfc" id="L148" title="All 2 branches covered.">        if (this.cookingTime == null) {</span>
<span class="fc" id="L149">            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,</span>
<span class="fc" id="L150">                    CookingTime.class.getSimpleName()));</span>
        }
<span class="fc bfc" id="L152" title="All 2 branches covered.">        if (!CookingTime.isValidCookingTime(this.cookingTime)) {</span>
<span class="fc" id="L153">            throw new IllegalValueException(CookingTime.MESSAGE_COOKING_TIME_CONSTRAINTS);</span>
        }
<span class="fc" id="L155">        final CookingTime cookingTime = new CookingTime(this.cookingTime);</span>

<span class="fc bfc" id="L157" title="All 2 branches covered.">        if (this.calories == null) {</span>
<span class="fc" id="L158">            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,</span>
<span class="fc" id="L159">                    Calories.class.getSimpleName()));</span>
        }
<span class="fc bfc" id="L161" title="All 2 branches covered.">        if (!Calories.isValidCalories(this.calories)) {</span>
<span class="fc" id="L162">            throw new IllegalValueException(Calories.MESSAGE_CALORIES_CONSTRAINTS);</span>
        }
<span class="fc" id="L164">        final Calories calories = new Calories(this.calories);</span>

<span class="fc bfc" id="L166" title="All 2 branches covered.">        if (this.servings == null) {</span>
<span class="fc" id="L167">            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,</span>
<span class="fc" id="L168">                    Servings.class.getSimpleName()));</span>
        }
<span class="fc bfc" id="L170" title="All 2 branches covered.">        if (!Servings.isValidServings(this.servings)) {</span>
<span class="fc" id="L171">            throw new IllegalValueException(Servings.MESSAGE_SERVINGS_CONSTRAINTS);</span>
        }
<span class="fc" id="L173">        final Servings servings = new Servings(this.servings);</span>

```
###### /src/test/java/systemtests/ParseCommandSystemTest.java
``` java
package systemtests;

import static seedu.recipe.testutil.TypicalIndexes.INDEX_FIRST_RECIPE;
import static seedu.recipe.testutil.TypicalRecipes.getTypicalRecipeBook;

import org.junit.Test;

import seedu.recipe.logic.commands.ParseCommand;
import seedu.recipe.logic.commands.SelectCommand;
import seedu.recipe.model.Model;
import seedu.recipe.model.ModelManager;
import seedu.recipe.model.UserPrefs;

/**
 * A system test class for the search command, which contains interaction with other UI components.
 */
public class ParseCommandSystemTest extends RecipeBookSystemTest {

    private Model model = new ModelManager(getTypicalRecipeBook(), new UserPrefs());

    @Test
    public void parse() {
        String command = SelectCommand.COMMAND_WORD + " " + INDEX_FIRST_RECIPE.getOneBased();
        executeCommand(command);

        assertCommandSuccess("add\n"
                + "name/Hainanese Chicken Rice\n"
                + "ingredient/chicken, salt, spring onion, pandan leaves, ginger, ginger, garlic, cinnamon, "
                + "cloves, star anise, chicken broth, pandan leaves, salt, light soy sauce, sesame oil, "
                + "cucumber, tomatoes, coriander, lettuce, pineapple, fresh chillies, ginger, garlic, "
                + "vinegar, fish sauce, sugar, sweet soy sauce\n"
                + "instruction/Boil water with spring Onion, ginger and pandan leaves, put in Chicken "
                + "and cook till done, do not over cook. briefly dip in cold water and set aside to cool."
                + " Keep broth heated.\n"
                + "Wash rice and drain. Finely shred ginger and garlic, fry in oil with cloves, cinammon"
                + " and star anise till fragrant, add in rice and fry for several minutes. Transfer into "
                + "rice cooker, add chicken broth, pinch of salt, pandan leaves and start cooking.\n"
                + "Put all chili sauce ingredient in a mixer and grind till fine.\n"
                + "Slice and arrange tomatoes and cucumbers on a big plate, cut Chicken into small pieces"
                + " and put on top. Splash some light soy sauce and sesame oil over, throw a bunch of "
                + "coriander on top.\n"
                + "Next, Put broth in a bowl with lettuce, get ready chili sauce and sweet soy sauce. "
                + "#Serve rice on a plate with spoon and folk.\n"
                + "img/https://vignette.wikia.nocookie.net/recipes/images/d/d3/Chickenrice2.jpg/revision/"
                + "latest/scale-to-width-down/180?cb=20080516004325");
    }

    /**
     * Assert that the {@code SearchCommand} was executed correctly
     * and the current content of the CommandBox is {@code content}
     */
    private void assertCommandSuccess(String content) {

        executeCommand(ParseCommand.COMMAND_WORD);
        assertStatusBarUnchanged();
        assertCommandBoxContent(content);
    }
}
```
###### /src/test/java/systemtests/ChangeThemeSystemTest.java
``` java
package systemtests;

import static org.junit.Assert.assertTrue;
import static seedu.recipe.TestApp.APP_TITLE;
import static seedu.recipe.ui.MainWindow.DARK_THEME_CSS;
import static seedu.recipe.ui.MainWindow.LIGHT_THEME_CSS;
import static seedu.recipe.ui.UiPart.FXML_FILE_FOLDER;

import org.junit.Test;

import guitests.GuiRobot;
import seedu.recipe.MainApp;
import seedu.recipe.logic.commands.ChangeThemeCommand;

public class ChangeThemeSystemTest extends RecipeBookSystemTest {
    private static final String ERROR_MESSAGE = "ATTENTION!!!! : On some computers, this test may fail when run on "
            + "non-headless mode as FxRobot#clickOn(Node, MouseButton...) clicks on the wrong location. We suspect "
            + "that this is a bug with TestFX library that we are using. If this test fails, you have to run your "
            + "tests on headless mode. See UsingGradle.adoc on how to do so.";

    private final GuiRobot guiRobot = new GuiRobot();

    @Test
    public void changeTheme() {

        // Use accelerator
        getCommandBox().click();
        getMainMenu().changeThemeUsingAccelerator();
        assertDarkTheme();

        getResultDisplay().click();
        getMainMenu().changeThemeUsingAccelerator();
        assertLightTheme();

        getResultDisplay().click();
        getMainMenu().changeThemeUsingAccelerator();
        assertDarkTheme();

        getCommandBox().click();
        getMainMenu().changeThemeUsingAccelerator();
        assertLightTheme();

        // Use menu button
        getMainMenu().changeThemeUsingMenu();
        assertDarkTheme();

        getMainMenu().changeThemeUsingMenu();
        assertLightTheme();

        // Change theme with command
        executeCommand(ChangeThemeCommand.COMMAND_WORD);
        assertDarkTheme();

        executeCommand(ChangeThemeCommand.COMMAND_WORD);
        assertLightTheme();
    }

    /**
     * Asserts that the current theme color is dark
     */
    private void assertDarkTheme() {
        assertTrue(ERROR_MESSAGE, guiRobot.getStage(APP_TITLE).getScene().getStylesheets().get(0)
                .equals(MainApp.class.getResource(FXML_FILE_FOLDER + DARK_THEME_CSS).toExternalForm()));
        guiRobot.pauseForHuman();
    }

    /**
     * Asserts that the current theme color is light
     */
    private void assertLightTheme() {
        assertTrue(ERROR_MESSAGE, guiRobot.getStage(APP_TITLE).getScene().getStylesheets().get(0)
                .equals(MainApp.class.getResource(FXML_FILE_FOLDER + LIGHT_THEME_CSS).toExternalForm()));
        guiRobot.pauseForHuman();
    }
}
```
###### /src/test/java/systemtests/SearchCommandSystemTest.java
``` java
package systemtests;

import static org.junit.Assert.assertEquals;
import static seedu.recipe.testutil.TypicalRecipes.getTypicalRecipeBook;

import org.junit.Test;

import seedu.recipe.logic.commands.SearchCommand;
import seedu.recipe.logic.commands.util.WikiaQueryHandler;
import seedu.recipe.model.Model;
import seedu.recipe.model.ModelManager;
import seedu.recipe.model.UserPrefs;

/**
 * A system test class for the search command, which contains interaction with other UI components.
 */
public class SearchCommandSystemTest extends RecipeBookSystemTest {

    private Model model = new ModelManager(getTypicalRecipeBook(), new UserPrefs());

    @Test
    public void search() {
        String query = "bot";
        assertCommandSuccess(query);

        query = "chicken rice";
        assertCommandSuccess(query);

        query = "blah";
        assertCommandSuccess(query);
    }

    /**
     * Assert that the {@code BrowserPanel} is currently loaded with given {@code url}
     */
    private void assertBrowserPanel(String url) {
        assertEquals(getBrowserPanel().getLoadedUrl().toExternalForm(), url);
    }

    /**
     * Assert that the {@code SearchCommand} was executed correctly with the given {@code query}.
     */
    private void assertCommandSuccess(String query) {
        executeCommand(SearchCommand.COMMAND_WORD + " " + query);

        WikiaQueryHandler wikiaQueryHandler = new WikiaQueryHandler(query.replaceAll("\\s+", "+"));
        int noOfResults = wikiaQueryHandler.getQueryNumberOfResults();

        if (noOfResults == 0) {
            assertApplicationDisplaysExpected("", SearchCommand.MESSAGE_FAILURE, model);
        } else {
            assertApplicationDisplaysExpected("", String.format(SearchCommand.MESSAGE_SUCCESS, noOfResults), model);
            assertBrowserPanel(wikiaQueryHandler.getRecipeQueryUrl());
        }
        assertCommandBoxShowsDefaultStyle();
        assertStatusBarUnchanged();
    }
}
```
###### /src/test/java/systemtests/RecipeBookSystemTest.java
``` java
    /**
     * Asserts that the command box is showing the {@code content}
     */
    protected void assertCommandBoxContent(String content) {
        assertEquals(content, getCommandBox().getInput());
    }
```
###### /src/test/java/seedu/recipe/ui/util/WebParserHandlerTest.java
``` java
package seedu.recipe.ui.util;

import static org.junit.Assert.assertEquals;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;

import guitests.guihandles.BrowserPanelHandle;
import seedu.recipe.ui.BrowserPanel;
import seedu.recipe.ui.GuiUnitTest;

public class WebParserHandlerTest extends GuiUnitTest {

    private static final String WIKIA_RECIPE_URL = "http://recipes.wikia.com/wiki/Hainanese_Chicken_Rice";

    private WebParserHandler webParserHandler;
    private BrowserPanel browserPanel;
    private BrowserPanelHandle browserPanelHandle;

    @Before
    public void setUp() {
        guiRobot.interact(() -> browserPanel = new BrowserPanel(true));
        uiPartRule.setUiPart(browserPanel);
        browserPanelHandle = new BrowserPanelHandle(browserPanel.getRoot());
    }

    @Test
    public void getWebParser_nothingLoaded_returnNull() throws Exception {
        webParserHandler = new WebParserHandler(browserPanel.getBrowser());
        WebParser actualWebParser = webParserHandler.getWebParser();
        assertEquals(null, actualWebParser);
    }

    @Test
    public void getWebParser_unparsableWebsite_returnNull() throws Exception {
        assertNullWebParser("https://google.com/");
    }

    @Test
    public void getWebParser_wikiaLoaded_returnWikiaParser() throws Exception {
        assertWebParser(WIKIA_RECIPE_URL, new WikiaParser(new Document("")));
    }

    /**
     * Creates a blank w3c Document
     */
    private org.w3c.dom.Document getDummyDocument() throws ParserConfigurationException {
        return DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
    }

    /**
     * Asserts that the created WebParser from the {@code url} matches the {@code expectedWebParser}
     */
    private void assertWebParser(String url, WebParser expectedWebParser) throws ParserConfigurationException {
        WebParser actualWebParser = WebParserHandler.getWebParser(url, getDummyDocument());
        assertEquals(expectedWebParser.getClass(), actualWebParser.getClass());
    }

    /**
     * Asserts that the created WebParser from the {@code url} doesn't exist
     */
    private void assertNullWebParser(String url) throws ParserConfigurationException {
        WebParser actualWebParser = WebParserHandler.getWebParser(url, getDummyDocument());
        assertEquals(null, actualWebParser);
    }
}
```
###### /src/test/java/seedu/recipe/ui/util/WikiaParserTest.java
``` java
package seedu.recipe.ui.util;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.junit.Before;
import org.junit.Test;

import seedu.recipe.ui.GuiUnitTest;

public class WikiaParserTest extends GuiUnitTest {
    private static final String WIKIA_RECIPE_URL_A = "http://recipes.wikia.com/wiki/Hainanese_Chicken_Rice";
    private static final String WIKIA_RECIPE_URL_B = "http://recipes.wikia.com/wiki/Beef_Tenderloin_with_Madeira_Sauce";
    private static final String WIKIA_NOT_RECIPE = "http://recipes.wikia.com/wiki/Category:Mushroom_Recipes";

    private WikiaParser wikiaParserA;
    private WikiaParser wikiaParserB;
    private WikiaParser wikiaParserNotRecipe;

    @Before
    public void setUp() throws IOException {
        wikiaParserA = new WikiaParser(Jsoup.connect(WIKIA_RECIPE_URL_A).get());
        wikiaParserB = new WikiaParser(Jsoup.connect(WIKIA_RECIPE_URL_B).get());
        wikiaParserNotRecipe = new WikiaParser(Jsoup.connect(WIKIA_NOT_RECIPE).get());
    }

    @Test
    public void getName_validRecipe_returnsResult() throws Exception {
        assertEquals(wikiaParserA.getName(), "Hainanese Chicken Rice");
        assertEquals(wikiaParserB.getName(), "Beef Tenderloin with Madeira Sauce");
    }

    @Test
    public void getIngredient_validRecipe_returnsResult() throws Exception {
        assertEquals(wikiaParserA.getIngredient(), "chicken, salt, spring onion, pandan leaves, "
                + "ginger, ginger, garlic, cinnamon, cloves, star anise, chicken broth, pandan leaves, salt,"
                + " light soy sauce, sesame oil, cucumber, tomatoes, coriander, lettuce, pineapple, fresh "
                + "chillies, ginger, garlic, vinegar, fish sauce, sugar, sweet soy sauce");
        assertEquals(wikiaParserB.getIngredient(), "1 cup of garlic, 2 cups of mustard, 3 tbs chopped "
                + "rosemary, 1 cup chopped thyme, 2 tsp garlic, 2 tsp vegtebale oil, 4 tsp salt, 1 tsp pepper, "
                + "3 cups of water, 4 tbs butter, 2 cups of red wine, 1 cup of garlic, 2 1/2 cups of corn, "
                + "4 cup of water, 2 tomatoes, 1 tsp chopped thyme, 1/2 tsp each sea salt and pepper");
    }

    @Test
    public void getInstruction_validRecipe_returnsResult() throws Exception {
        assertEquals(wikiaParserA.getInstruction(),
                "Boil water with spring Onion, ginger and pandan leaves, put in Chicken and cook till done,"
                        + " do not over cook. briefly dip in cold water and set aside to cool. Keep broth heated.\n"
                        + "Wash rice and drain. Finely shred ginger and garlic, fry in oil with cloves, cinammon and "
                        + "star anise till fragrant, add in rice and fry for several minutes. Transfer into rice "
                        + "cooker, add chicken broth, pinch of salt, pandan leaves and start cooking.\n"
                        + "Put all chili sauce ingredient in a mixer and grind till fine.\n"
                        + "Slice and arrange tomatoes and cucumbers on a big plate, cut Chicken into small pieces and p"
                        + "ut on top. Splash some light soy sauce and sesame oil over, throw a bunch of coriander "
                        + "on top.\nNext, Put broth in a bowl with lettuce, get ready chili sauce and sweet "
                        + "soy sauce. #Serve rice on a plate with spoon and folk.");
        assertEquals(wikiaParserB.getInstruction(),
                "Heat oven to 475 degrees and prepare a Large rimmed baking sheet coated with cooking spray.\n"
                        + "Spread beef with mustard.\n"
                        + "Mix herbs, garlic, oil, salt and pepper in a cup, press on mustard.\n"
                        + "Place beef on baking sheet.\n"
                        + "Roast 50 min.\n"
                        + "Remove to cutting board, cover tight with foil and let rest 15 min.]\n"
                        + "Slice beef and arrange on a serving platter, spoon on a little sauce. "
                        + "Serve with remaining sauce.\n"
                        + "Put butter in skillet.\n"
                        + "Add mushrooms, saute 2 min.\n"
                        + "Stir in garlic, boil 5 min.\n"
                        + "Stir corn into broth until blended. Add to skillet.\n"
                        + "Bring to a boil, boil stirring 5 min.\n"
                        + "Pour into gravy boat and serve with the beef.");
    }

    @Test
    public void getImageUrl_validRecipe_returnsResult() throws Exception {
        assertEquals(wikiaParserA.getImageUrl(), "https://vignette.wikia.nocookie.net/recipes/images/d/d3"
                + "/Chickenrice2.jpg/revision/latest/scale-to-width-down/180?cb=20080516004325");
    }

    @Test
    public void parseRecipe_validRecipe_returnsValidCommand() throws Exception {
        assertEquals(wikiaParserA.parseRecipe(), "add\n"
                + "name/Hainanese Chicken Rice\n"
                + "ingredient/chicken, salt, spring onion, pandan leaves, ginger, ginger, garlic, cinnamon, "
                + "cloves, star anise, chicken broth, pandan leaves, salt, light soy sauce, sesame oil, "
                + "cucumber, tomatoes, coriander, lettuce, pineapple, fresh chillies, ginger, garlic, "
                + "vinegar, fish sauce, sugar, sweet soy sauce\n"
                + "instruction/Boil water with spring Onion, ginger and pandan leaves, put in Chicken "
                + "and cook till done, do not over cook. briefly dip in cold water and set aside to cool."
                + " Keep broth heated.\n"
                + "Wash rice and drain. Finely shred ginger and garlic, fry in oil with cloves, cinammon"
                + " and star anise till fragrant, add in rice and fry for several minutes. Transfer into "
                + "rice cooker, add chicken broth, pinch of salt, pandan leaves and start cooking.\n"
                + "Put all chili sauce ingredient in a mixer and grind till fine.\n"
                + "Slice and arrange tomatoes and cucumbers on a big plate, cut Chicken into small pieces"
                + " and put on top. Splash some light soy sauce and sesame oil over, throw a bunch of "
                + "coriander on top.\n"
                + "Next, Put broth in a bowl with lettuce, get ready chili sauce and sweet soy sauce. "
                + "#Serve rice on a plate with spoon and folk.\n"
                + "img/https://vignette.wikia.nocookie.net/recipes/images/d/d3/Chickenrice2.jpg/revision/"
                + "latest/scale-to-width-down/180?cb=20080516004325");
        assertEquals(wikiaParserB.parseRecipe(), "add\n"
                + "name/Beef Tenderloin with Madeira Sauce\n"
                + "ingredient/1 cup of garlic, 2 cups of mustard, 3 tbs chopped rosemary,"
                + " 1 cup chopped thyme, 2 tsp garlic, 2 tsp vegtebale oil, 4 tsp salt, 1"
                + " tsp pepper, 3 cups of water, 4 tbs butter, 2 cups of red wine, 1 cup of"
                + " garlic, 2 1/2 cups of corn, 4 cup of water, 2 tomatoes, 1 tsp chopped thyme,"
                + " 1/2 tsp each sea salt and pepper\n"
                + "instruction/Heat oven to 475 degrees and prepare a Large rimmed baking sheet"
                + " coated with cooking spray.\n"
                + "Spread beef with mustard.\n"
                + "Mix herbs, garlic, oil, salt and pepper in a cup, press on mustard.\n"
                + "Place beef on baking sheet.\n"
                + "Roast 50 min.\n"
                + "Remove to cutting board, cover tight with foil and let rest 15 min.]\n"
                + "Slice beef and arrange on a serving platter, spoon on a little sauce. "
                + "Serve with remaining sauce.\n"
                + "Put butter in skillet.\n"
                + "Add mushrooms, saute 2 min.\n"
                + "Stir in garlic, boil 5 min.\n"
                + "Stir corn into broth until blended. Add to skillet.\n"
                + "Bring to a boil, boil stirring 5 min.\n"
                + "Pour into gravy boat and serve with the beef.");
    }

    @Test
    //TODO: Fix this test
    public void getName_notRecipe_returnsResult() throws Exception {
        assertEquals(wikiaParserNotRecipe.getName(), "Mushroom Recipes");
    }

    @Test
    public void getIngredient_notRecipe_returnsBlank() throws Exception {
        assertEquals(wikiaParserNotRecipe.getIngredient(), "");
    }

    @Test
    public void getInstruction_notRecipe_returnsBlank() throws Exception {
        assertEquals(wikiaParserNotRecipe.getInstruction(), "");
    }

    @Test
    public void getImageUrl_notRecipe_returnsBlank() throws Exception {
        assertEquals(wikiaParserNotRecipe.getImageUrl(), "");
    }

    @Test
    //TODO: Fix this test
    public void parseRecipe_notRecipe_returnsResult() throws Exception {
        assertEquals(wikiaParserNotRecipe.parseRecipe(), "add\nname/Mushroom Recipes");
    }
}
```
###### /src/test/java/seedu/recipe/ui/CommandBoxTest.java
``` java
    @Test
    public void commandBox_handleMultipleLinesCommand() {
        commandBoxHandle.appendText(FIRST_LINE_OF_COMMAND_THAT_HAS_MULTIPLE_LINES);
        guiRobot.push(KeyboardShortcutsMapping.NEW_LINE_IN_COMMAND);
        commandBoxHandle.appendText(SECOND_LINE_OF_COMMAND_THAT_HAS_MULTIPLE_LINES);
        assertInput(COMMAND_THAT_HAS_MULTIPLE_LINES);
    }
```
###### /src/test/java/seedu/recipe/ui/CommandBoxTest.java
``` java

    /**
     * Checks that the input in the {@code commandBox} equals to {@code expectedCommand}.
     */
    private void assertInput(String expectedCommand) {
        assertEquals(expectedCommand, commandBoxHandle.getInput());
    }
}
```
###### /src/test/java/seedu/recipe/logic/parser/SearchCommandParserTest.java
``` java
package seedu.recipe.logic.parser;

import static seedu.recipe.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.recipe.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.recipe.logic.parser.CommandParserTestUtil.assertParseSuccess;

import org.junit.Test;

import seedu.recipe.logic.commands.SearchCommand;

public class SearchCommandParserTest {

    private SearchCommandParser parser = new SearchCommandParser();

    @Test
    public void parse_emptyArg_throwsParseException() {
        assertParseFailure(parser, "     ", String.format(MESSAGE_INVALID_COMMAND_FORMAT, SearchCommand.MESSAGE_USAGE));
    }

    @Test
    public void parse_validArgs_returnsFindCommand() {
        // no leading and trailing whitespaces
        SearchCommand expectedSearchCommand = new SearchCommand("chicken+rice");
        assertParseSuccess(parser, "chicken rice", expectedSearchCommand);

        // multiple whitespaces between keywords
        assertParseSuccess(parser, " \n chicken \n \t rice  \t", expectedSearchCommand);
        assertParseSuccess(parser, "        chicken             rice            ", expectedSearchCommand);
    }

}
```
###### /src/test/java/seedu/recipe/logic/parser/RecipeBookParserTest.java
``` java
    @Test
    public void parseCommand_changeTheme() throws Exception {
        assertTrue(parser.parseCommand(ChangeThemeCommand.COMMAND_WORD) instanceof ChangeThemeCommand);
        assertTrue(parser.parseCommand(ChangeThemeCommand.COMMAND_WORD + " 3") instanceof ChangeThemeCommand);
    }

    @Test
    public void parseCommand_search() throws Exception {
        assertTrue(parser.parseCommand(SearchCommand.COMMAND_WORD + " chicken rice") instanceof SearchCommand);

        String keywords = "chicken rice";
        SearchCommand command = (SearchCommand) parser.parseCommand(SearchCommand.COMMAND_WORD + " " + keywords);
        assertEquals(new SearchCommand(keywords.replaceAll("\\s+", "+")), command);

        thrown.expect(ParseException.class);
        thrown.expectMessage(String.format(MESSAGE_INVALID_COMMAND_FORMAT, SearchCommand.MESSAGE_USAGE));
        parser.parseCommand(SearchCommand.COMMAND_WORD);
    }

    @Test
    public void parseCommand_parse() throws Exception {
        assertTrue(parser.parseCommand(ParseCommand.COMMAND_WORD) instanceof ParseCommand);
        assertTrue(parser.parseCommand(ParseCommand.COMMAND_WORD + " 3") instanceof ParseCommand);
    }
```
###### /src/test/java/seedu/recipe/logic/parser/AddCommandParserTest.java
``` java
    @Test
    public void parse_allFieldsPresentWithNewLineDelimiter_success() {
        Recipe expectedRecipe = new RecipeBuilder().withName(VALID_NAME_AMY).withServings(VALID_SERVINGS_AMY)
                .withPreparationTime(VALID_PREPARATION_TIME_AMY).withIngredient(VALID_INGREDIENT_AMY)
                .withCookingTime(VALID_COOKING_TIME_AMY).withCalories(VALID_CALORIES_AMY)
                .withInstruction(VALID_INSTRUCTION_AMY).withUrl(VALID_URL_AMY)
                .withImage(VALID_IMG_AMY).withTags(VALID_TAG_FRIEND).build();

        // Multiple names - last name accepted
        assertParseSuccess(parser, NAME_DESC_BOB + LF
                        + NAME_DESC_AMY + LF + PREPARATION_TIME_DESC_AMY
                        + LF + INGREDIENT_DESC_AMY + LF + INSTRUCTION_DESC_AMY
                        + LF + URL_DESC_AMY + LF + IMG_DESC_AMY + LF + COOKING_TIME_DESC_AMY
                        + LF + CALORIES_DESC_AMY + LF + SERVINGS_DESC_AMY,
                new AddCommand(expectedRecipe));


        // multiple ingredients - last ingredient accepted
        assertParseSuccess(parser, INGREDIENT_DESC_BOB + LF
                        + NAME_DESC_AMY + LF + PREPARATION_TIME_DESC_AMY
                        + LF + INGREDIENT_DESC_AMY + LF + INSTRUCTION_DESC_AMY
                        + LF + URL_DESC_AMY + LF + IMG_DESC_AMY + LF + COOKING_TIME_DESC_AMY
                        + LF + CALORIES_DESC_AMY + LF + SERVINGS_DESC_AMY,
                new AddCommand(expectedRecipe));

        // multiple preparationTimes - last instruction accepted
        assertParseSuccess(parser, INSTRUCTION_DESC_BOB + LF
                        + NAME_DESC_AMY + LF + PREPARATION_TIME_DESC_AMY
                        + LF + INGREDIENT_DESC_AMY + LF + INSTRUCTION_DESC_AMY
                        + LF + URL_DESC_AMY + LF + IMG_DESC_AMY + LF + COOKING_TIME_DESC_AMY
                        + LF + CALORIES_DESC_AMY + LF + SERVINGS_DESC_AMY,
                new AddCommand(expectedRecipe));

        // multiple instructions - last cooking time
        assertParseSuccess(parser, COOKING_TIME_DESC_BOB + LF
                        + NAME_DESC_AMY + LF + PREPARATION_TIME_DESC_AMY
                        + LF + INGREDIENT_DESC_AMY + LF + INSTRUCTION_DESC_AMY
                        + LF + URL_DESC_AMY + LF + IMG_DESC_AMY + LF + COOKING_TIME_DESC_AMY
                        + LF + CALORIES_DESC_AMY + LF + SERVINGS_DESC_AMY,
                new AddCommand(expectedRecipe));

        // multiple instructions - last preparation time
        assertParseSuccess(parser, PREPARATION_TIME_DESC_BOB + LF
                        + NAME_DESC_AMY + LF + PREPARATION_TIME_DESC_AMY
                        + LF + INGREDIENT_DESC_AMY + LF + INSTRUCTION_DESC_AMY
                        + LF + URL_DESC_AMY + LF + IMG_DESC_AMY + LF + COOKING_TIME_DESC_AMY
                        + LF + CALORIES_DESC_AMY + LF + SERVINGS_DESC_AMY,
                new AddCommand(expectedRecipe));

        // multiple instructions - last calories
        assertParseSuccess(parser, CALORIES_DESC_BOB + LF
                        + NAME_DESC_AMY + LF + PREPARATION_TIME_DESC_AMY
                        + LF + INGREDIENT_DESC_AMY + LF + INSTRUCTION_DESC_AMY
                        + LF + URL_DESC_AMY + LF + IMG_DESC_AMY + LF + COOKING_TIME_DESC_AMY
                        + LF + CALORIES_DESC_AMY + LF + SERVINGS_DESC_AMY,
                new AddCommand(expectedRecipe));

        // multiple instructions - last servings
        assertParseSuccess(parser, SERVINGS_DESC_BOB + LF
                        + NAME_DESC_AMY + LF + PREPARATION_TIME_DESC_AMY
                        + LF + INGREDIENT_DESC_AMY + LF + INSTRUCTION_DESC_AMY
                        + LF + URL_DESC_AMY + LF + IMG_DESC_AMY + LF + COOKING_TIME_DESC_AMY
                        + LF + CALORIES_DESC_AMY + LF + SERVINGS_DESC_AMY,
                new AddCommand(expectedRecipe));

        // multiple url - last url accepted
        assertParseSuccess(parser, URL_DESC_BOB + LF
                        + NAME_DESC_AMY + LF + PREPARATION_TIME_DESC_AMY
                        + LF + INGREDIENT_DESC_AMY + LF + INSTRUCTION_DESC_AMY
                        + LF + URL_DESC_AMY + LF + URL_DESC_AMY + LF + IMG_DESC_AMY
                        + LF + COOKING_TIME_DESC_AMY + LF + CALORIES_DESC_AMY + LF + SERVINGS_DESC_AMY,
                new AddCommand(expectedRecipe));

        // multiple images - last image accepted
        assertParseSuccess(parser, URL_DESC_BOB + LF
                        + NAME_DESC_AMY + LF + PREPARATION_TIME_DESC_AMY
                        + LF + INGREDIENT_DESC_AMY + LF + INSTRUCTION_DESC_AMY
                        + LF + URL_DESC_AMY + LF + IMG_DESC_AMY + LF + IMG_DESC_AMY
                        + LF + COOKING_TIME_DESC_AMY + LF + CALORIES_DESC_AMY + LF + SERVINGS_DESC_AMY,
                new AddCommand(expectedRecipe));

        // multiple tags - all accepted
        Recipe expectedRecipeMultipleTags = new RecipeBuilder().withName(VALID_NAME_AMY).withServings(
                VALID_SERVINGS_AMY).withPreparationTime(VALID_PREPARATION_TIME_AMY).withIngredient(VALID_INGREDIENT_AMY)
                .withCookingTime(VALID_COOKING_TIME_AMY).withCalories(VALID_CALORIES_AMY)
                .withInstruction(VALID_INSTRUCTION_AMY).withUrl(VALID_URL_AMY).withImage(VALID_IMG_AMY)
                .withTags(VALID_TAG_FRIEND, VALID_TAG_HUSBAND).build();
        assertParseSuccess(parser, NAME_DESC_AMY + LF + PREPARATION_TIME_DESC_AMY + LF + INGREDIENT_DESC_AMY
                        + LF + INSTRUCTION_DESC_AMY + LF + URL_DESC_AMY + LF + IMG_DESC_AMY
                        + LF + COOKING_TIME_DESC_AMY + LF + CALORIES_DESC_AMY + LF + SERVINGS_DESC_AMY,
                new AddCommand(expectedRecipeMultipleTags));
    }
```
###### /src/test/java/seedu/recipe/logic/parser/AddCommandParserTest.java
``` java
        // invalid ingredient
        assertParseFailure(parser,
                NAME_DESC_BOB + PREPARATION_TIME_DESC_BOB + INVALID_INGREDIENT_DESC + INSTRUCTION_DESC_BOB
                        + URL_DESC_BOB + TAG_DESC_HUSBAND + TAG_DESC_FRIEND,
                Ingredient.MESSAGE_INGREDIENT_CONSTRAINTS);

        // invalid instruction
        assertParseFailure(parser,
                NAME_DESC_BOB + PREPARATION_TIME_DESC_BOB + INGREDIENT_DESC_BOB + INVALID_INSTRUCTION_DESC
                        + URL_DESC_BOB + TAG_DESC_HUSBAND + TAG_DESC_FRIEND,
                Instruction.MESSAGE_INSTRUCTION_CONSTRAINTS);

        // invalid preparation time
        assertParseFailure(parser,
                NAME_DESC_BOB + INVALID_PREPARATION_TIME_DESC + INGREDIENT_DESC_BOB + INSTRUCTION_DESC_BOB
                        + URL_DESC_BOB + TAG_DESC_HUSBAND + TAG_DESC_FRIEND,
                PreparationTime.MESSAGE_PREPARATION_TIME_CONSTRAINTS);

        // invalid cooking time
        assertParseFailure(parser,
                NAME_DESC_BOB + INVALID_COOKING_TIME_DESC + INGREDIENT_DESC_BOB + INSTRUCTION_DESC_BOB
                        + URL_DESC_BOB + TAG_DESC_HUSBAND + TAG_DESC_FRIEND,
                CookingTime.MESSAGE_COOKING_TIME_CONSTRAINTS);

        // invalid calories
        assertParseFailure(parser,
                NAME_DESC_BOB + INVALID_CALORIES_DESC + INGREDIENT_DESC_BOB + INSTRUCTION_DESC_BOB
                        + URL_DESC_BOB + TAG_DESC_HUSBAND + TAG_DESC_FRIEND,
                Calories.MESSAGE_CALORIES_CONSTRAINTS);

        // invalid servings
        assertParseFailure(parser,
                NAME_DESC_BOB + INVALID_SERVINGS_DESC + INGREDIENT_DESC_BOB + INSTRUCTION_DESC_BOB
                        + URL_DESC_BOB + TAG_DESC_HUSBAND + TAG_DESC_FRIEND,
                Servings.MESSAGE_SERVINGS_CONSTRAINTS);

```
###### /src/test/java/seedu/recipe/logic/commands/SearchCommandTest.java
``` java
package seedu.recipe.logic.commands;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static seedu.recipe.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.recipe.logic.commands.SearchCommand.MESSAGE_FAILURE;
import static seedu.recipe.logic.commands.SearchCommand.MESSAGE_SUCCESS;
import static seedu.recipe.testutil.TypicalRecipes.getTypicalRecipeBook;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import seedu.recipe.model.Model;
import seedu.recipe.model.ModelManager;
import seedu.recipe.model.UserPrefs;

public class SearchCommandTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private Model model = new ModelManager(getTypicalRecipeBook(), new UserPrefs());

    @Test
    public void equals() {
        String firstTest = "chicken rice";
        String secondTest = "boneless pizza";

        SearchCommand searchFirstCommand = new SearchCommand(firstTest);
        SearchCommand searchSecondCommand = new SearchCommand(secondTest);

        // same object -> returns true
        assertTrue(searchFirstCommand.equals(searchFirstCommand));

        // same values -> returns true
        SearchCommand searchFirstCommandCopy = new SearchCommand(firstTest);
        assertTrue(searchFirstCommand.equals(searchFirstCommandCopy));

        // different types -> returns false
        assertFalse(searchFirstCommand.equals(1));
        assertFalse(searchFirstCommand.equals(new HelpCommand()));
        assertFalse(searchFirstCommand.equals("DOGGO"));

        // null -> returns false
        assertFalse(searchFirstCommand.equals(null));

        // different recipe -> returns false
        assertFalse(searchFirstCommand.equals(searchSecondCommand));
    }

    @Test
    public void constructor_nullInput_throwsNullPointerException() {
        thrown.expect(NullPointerException.class);
        SearchCommand searchCommand = new SearchCommand(null);
    }

    @Test
    public void execute_inputWithNoResults_noRecipesFound() {
        SearchCommand searchCommandWithNoResult = new SearchCommand("blah");
        assertCommandSuccess(searchCommandWithNoResult, model, MESSAGE_FAILURE, model);
    }

    // THIS TEST MIGHT FAIL IN THE FUTURE! PLEASE UPDATE IF IT FAILS!
    @Test
    public void execute_inputWithFourResults_fourRecipesFound() {
        SearchCommand searchCommandWithFourResult = new SearchCommand("bot");
        assertCommandSuccess(searchCommandWithFourResult, model, String.format(MESSAGE_SUCCESS, 4), model);
    }
}
```
###### /src/test/java/seedu/recipe/logic/commands/ParseCommandTest.java
``` java
package seedu.recipe.logic.commands;

import static org.junit.Assert.assertEquals;
import static seedu.recipe.logic.commands.ParseCommand.MESSAGE_SUCCESS;

import org.junit.Test;

public class ParseCommandTest {
    @Test
    public void execute_nothing_throwsAssertionError() {
        CommandResult result = new ParseCommand().execute();
        assertEquals(MESSAGE_SUCCESS, result.feedbackToUser);
    }
}
```
###### /src/test/java/seedu/recipe/logic/commands/util/WikiaQueryHandlerTest.java
``` java
package seedu.recipe.logic.commands.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static seedu.recipe.logic.commands.util.WikiaQueryHandler.QUERY_URL;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WikiaQueryHandlerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructor_nullQuery_throwsNullPointerException() {
        thrown.expect(NullPointerException.class);
        new WikiaQueryHandler(null);
    }

    @Test
    public void constructor_invalidQuery_throwsAssertionError() {
        thrown.expect(AssertionError.class);
        new WikiaQueryHandler("");
    }

    @Test
    public void getRecipeQueryUrl_normalString_success() throws Exception {
        WikiaQueryHandler testWikiaQueryHandler = new WikiaQueryHandler("chickens soup");
        assertEquals(testWikiaQueryHandler.getRecipeQueryUrl(), QUERY_URL + "chickens soup");
    }

    @Test
    public void getQueryNumberOfResults_zeroResults_success() throws Exception {
        WikiaQueryHandler wikiaQueryHandlerWithZeroResults = new WikiaQueryHandler("blah");
        assertEquals(wikiaQueryHandlerWithZeroResults.getQueryNumberOfResults(), 0);
    }

    // It is very hard to give a concrete number for this test as recipes are added everyday
    @Test
    public void getQueryNumberOfResults_bigResults_success() throws Exception {
        WikiaQueryHandler wikiaQueryHandlerWithZeroResults = new WikiaQueryHandler("chicken");
        assertTrue(wikiaQueryHandlerWithZeroResults.getQueryNumberOfResults() > 5000);
    }

    // THIS TEST MIGHT FAIL IN THE FUTURE! PLEASE UPDATE IF IT FAILS
    @Test
    public void getQueryNumberOfResults_fourResults_success() throws Exception {
        WikiaQueryHandler wikiaQueryHandlerWithFourResults = new WikiaQueryHandler("bot");
        assertEquals(wikiaQueryHandlerWithFourResults.getQueryNumberOfResults(), 4);
    }
}
```
###### /src/test/java/seedu/recipe/logic/commands/ChangeThemeCommandTest.java
``` java
package seedu.recipe.logic.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static seedu.recipe.logic.commands.ChangeThemeCommand.SHOWING_CHANGE_THEME_MESSAGE;

import org.junit.Rule;
import org.junit.Test;

import seedu.recipe.commons.events.ui.ChangeThemeRequestEvent;
import seedu.recipe.ui.testutil.EventsCollectorRule;

public class ChangeThemeCommandTest {
    @Rule
    public final EventsCollectorRule eventsCollectorRule = new EventsCollectorRule();

    @Test
    public void execute_changeTheme_success() {
        CommandResult result = new ChangeThemeCommand().execute();
        assertEquals(SHOWING_CHANGE_THEME_MESSAGE, result.feedbackToUser);
        assertTrue(eventsCollectorRule.eventsCollector.getMostRecent() instanceof ChangeThemeRequestEvent);
        assertTrue(eventsCollectorRule.eventsCollector.getSize() == 1);
    }
}
```
###### /src/test/java/seedu/recipe/storage/XmlAdaptedRecipeTest.java
``` java
    @Test
    public void toModelType_invalidIngredient_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe =
            new XmlAdaptedRecipe(VALID_NAME, INVALID_INGREDIENT, VALID_INSTRUCTION, VALID_COOKING_TIME,
                    VALID_PREPARATION_TIME, VALID_CALORIES, VALID_SERVINGS, VALID_URL, VALID_IMAGE, VALID_TAGS);
        String expectedMessage = Ingredient.MESSAGE_INGREDIENT_CONSTRAINTS;
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }

    @Test
    public void toModelType_nullIngredient_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe = new XmlAdaptedRecipe(VALID_NAME, null, VALID_INSTRUCTION, VALID_COOKING_TIME,
                VALID_PREPARATION_TIME, VALID_CALORIES, VALID_SERVINGS, VALID_URL, VALID_IMAGE, VALID_TAGS);
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Ingredient.class.getSimpleName());
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }

    @Test
    public void toModelType_invalidInstruction_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe =
            new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, INVALID_INSTRUCTION, VALID_COOKING_TIME,
                    VALID_PREPARATION_TIME, VALID_CALORIES, VALID_SERVINGS, VALID_URL, VALID_IMAGE, VALID_TAGS);
        String expectedMessage = Instruction.MESSAGE_INSTRUCTION_CONSTRAINTS;
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }

    @Test
    public void toModelType_nullInstruction_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe = new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, null,
                VALID_COOKING_TIME, VALID_PREPARATION_TIME, VALID_CALORIES, VALID_SERVINGS, VALID_URL,
                VALID_IMAGE, VALID_TAGS);
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Instruction.class.getSimpleName());
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }

    @Test
    public void toModelType_invalidPreparationTime_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe =
                new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, VALID_INSTRUCTION, VALID_COOKING_TIME,
                        INVALID_PREPARATION_TIME, VALID_CALORIES, VALID_SERVINGS, VALID_URL,
                        VALID_IMAGE, VALID_TAGS);
        String expectedMessage = PreparationTime.MESSAGE_PREPARATION_TIME_CONSTRAINTS;
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }

    @Test
    public void toModelType_nullPreparationTime_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe = new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, VALID_INSTRUCTION,
                VALID_COOKING_TIME, null, VALID_CALORIES, VALID_SERVINGS, VALID_URL,
                VALID_IMAGE, VALID_TAGS);
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, PreparationTime.class.getSimpleName());
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }

    @Test
    public void toModelType_invalidCookingTime_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe =
                new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, VALID_INSTRUCTION, INVALID_COOKING_TIME,
                        VALID_PREPARATION_TIME, VALID_CALORIES, VALID_SERVINGS, VALID_URL,
                        VALID_IMAGE, VALID_TAGS);
        String expectedMessage = CookingTime.MESSAGE_COOKING_TIME_CONSTRAINTS;
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }

    @Test
    public void toModelType_nullCookingTime_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe = new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, VALID_INSTRUCTION,
                null, VALID_PREPARATION_TIME, VALID_CALORIES, VALID_SERVINGS, VALID_URL,
                VALID_IMAGE, VALID_TAGS);
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, CookingTime.class.getSimpleName());
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }

    @Test
    public void toModelType_invalidCalories_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe =
                new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, VALID_INSTRUCTION, VALID_PREPARATION_TIME,
                        VALID_COOKING_TIME, INVALID_CALORIES, VALID_SERVINGS, VALID_URL,
                        VALID_IMAGE, VALID_TAGS);
        String expectedMessage = Calories.MESSAGE_CALORIES_CONSTRAINTS;
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }

    @Test
    public void toModelType_nullCalories_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe = new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, VALID_INSTRUCTION,
                VALID_PREPARATION_TIME, VALID_COOKING_TIME, null, VALID_SERVINGS, VALID_URL,
                VALID_IMAGE, VALID_TAGS);
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Calories.class.getSimpleName());
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }

    @Test
    public void toModelType_invalidServings_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe =
                new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, VALID_INSTRUCTION, VALID_PREPARATION_TIME,
                        VALID_COOKING_TIME, VALID_CALORIES, INVALID_SERVINGS, VALID_URL,
                        VALID_IMAGE, VALID_TAGS);
        String expectedMessage = Servings.MESSAGE_SERVINGS_CONSTRAINTS;
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }

    @Test
    public void toModelType_nullServings_throwsIllegalValueException() {
        XmlAdaptedRecipe recipe = new XmlAdaptedRecipe(VALID_NAME, VALID_INGREDIENT, VALID_INSTRUCTION,
                VALID_PREPARATION_TIME, VALID_COOKING_TIME, VALID_CALORIES, null, VALID_URL,
                VALID_IMAGE, VALID_TAGS);
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Servings.class.getSimpleName());
        Assert.assertThrows(IllegalValueException.class, expectedMessage, recipe::toModelType);
    }

```
###### /src/test/java/seedu/recipe/model/recipe/PreparationTimeTest.java
``` java
package seedu.recipe.model.recipe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.recipe.testutil.Assert;

public class PreparationTimeTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        Assert.assertThrows(NullPointerException.class, () -> new PreparationTime(null));
    }

    @Test
    public void constructor_invalidPreparationTime_throwsIllegalArgumentException() {
        String invalidPreparationTime = "";
        Assert.assertThrows(IllegalArgumentException.class, () -> new PreparationTime(invalidPreparationTime));
    }

    @Test
    public void isValidPreparationTime() {
        // null PreparationTime
        Assert.assertThrows(NullPointerException.class, () -> PreparationTime.isValidPreparationTime(null));

        // invalid PreparationTime
        assertFalse(PreparationTime.isValidPreparationTime("")); // empty string
        assertFalse(PreparationTime.isValidPreparationTime(" ")); // spaces only
        assertFalse(PreparationTime.isValidPreparationTime("NaN")); // not a number
        assertFalse(PreparationTime.isValidPreparationTime("preparationTime")); // non-numeric
        assertFalse(PreparationTime.isValidPreparationTime("9011p041")); // unknown character p
        assertFalse(PreparationTime.isValidPreparationTime("1h  1534m")); // more spaces than needed

        // valid PreparationTime
        assertTrue(PreparationTime.isValidPreparationTime("1h20m"));
        assertTrue(PreparationTime.isValidPreparationTime("1 hour 20 min"));
        assertTrue(PreparationTime.isValidPreparationTime("1 hour 20 mins"));
        assertTrue(PreparationTime.isValidPreparationTime("1 hour 20 minutes"));
        assertTrue(PreparationTime.isValidPreparationTime("80"));
        assertTrue(PreparationTime.isValidPreparationTime("80m"));
        assertTrue(PreparationTime.isValidPreparationTime("80min"));
        assertTrue(PreparationTime.isValidPreparationTime("80 mins"));
        assertTrue(PreparationTime.isValidPreparationTime("2h20m"));
        assertTrue(PreparationTime.isValidPreparationTime("2 hours 20 mins"));
        assertTrue(PreparationTime.isValidPreparationTime("2 hours 20 minutes"));
    }
}
```
###### /src/test/java/seedu/recipe/model/recipe/ServingsTest.java
``` java
package seedu.recipe.model.recipe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.recipe.testutil.Assert;

public class ServingsTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        Assert.assertThrows(NullPointerException.class, () -> new Servings(null));
    }

    @Test
    public void constructor_invalidServings_throwsIllegalArgumentException() {
        String invalidServings = "";
        Assert.assertThrows(IllegalArgumentException.class, () -> new Servings(invalidServings));
    }

    @Test
    public void isValidServings() {
        // null servings number
        Assert.assertThrows(NullPointerException.class, () -> Servings.isValidServings(null));

        // invalid servings number
        assertFalse(Servings.isValidServings("")); // empty string
        assertFalse(Servings.isValidServings(" ")); // spaces only
        assertFalse(Servings.isValidServings("NaN")); // not a number
        assertFalse(Servings.isValidServings("BLAHBLAHBLAH")); // non-numeric
        assertFalse(Servings.isValidServings(".1111..")); // non-numeric

        // valid servings number
        assertTrue(Servings.isValidServings("2"));
        assertTrue(Servings.isValidServings("10"));
    }
}
```
###### /src/test/java/seedu/recipe/model/recipe/CookingTimeTest.java
``` java
package seedu.recipe.model.recipe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.recipe.testutil.Assert;

public class CookingTimeTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        Assert.assertThrows(NullPointerException.class, () -> new CookingTime(null));
    }

    @Test
    public void constructor_invalidCookingTime_throwsIllegalArgumentException() {
        String invalidCookingTime = "";
        Assert.assertThrows(IllegalArgumentException.class, () -> new CookingTime(invalidCookingTime));
    }

    @Test
    public void isValidCookingTime() {
        // null CookingTime
        Assert.assertThrows(NullPointerException.class, () -> CookingTime.isValidCookingTime(null));

        // invalid CookingTime
        assertFalse(CookingTime.isValidCookingTime("")); // empty string
        assertFalse(CookingTime.isValidCookingTime(" ")); // spaces only
        assertFalse(CookingTime.isValidCookingTime("NaN")); // not a number
        assertFalse(CookingTime.isValidCookingTime("BLAHBLAHBLAH")); // non-numeric
        assertFalse(CookingTime.isValidCookingTime("123aaaa55555")); // unknown character p
        assertFalse(CookingTime.isValidCookingTime("1h  6666m")); // more spaces than needed

        // valid CookingTime
        assertTrue(CookingTime.isValidCookingTime("1h10m"));
        assertTrue(CookingTime.isValidCookingTime("1 hour 10 min"));
        assertTrue(CookingTime.isValidCookingTime("1 hour 10 mins"));
        assertTrue(CookingTime.isValidCookingTime("1 hour 10 minutes"));
        assertTrue(CookingTime.isValidCookingTime("70"));
        assertTrue(CookingTime.isValidCookingTime("70m"));
        assertTrue(CookingTime.isValidCookingTime("70min"));
        assertTrue(CookingTime.isValidCookingTime("70 mins"));
        assertTrue(CookingTime.isValidCookingTime("5h20m"));
        assertTrue(CookingTime.isValidCookingTime("5 hours 20 mins"));
        assertTrue(CookingTime.isValidCookingTime("5 hours 20 minutes"));
    }
}
```
###### /src/test/java/seedu/recipe/model/recipe/CaloriesTest.java
``` java
package seedu.recipe.model.recipe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.recipe.testutil.Assert;

public class CaloriesTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        Assert.assertThrows(NullPointerException.class, () -> new Calories(null));
    }

    @Test
    public void constructor_invalidCalories_throwsIllegalArgumentException() {
        String invalidCalories = "";
        Assert.assertThrows(IllegalArgumentException.class, () -> new Calories(invalidCalories));
    }

    @Test
    public void isValidCalories() {
        // null calories number
        Assert.assertThrows(NullPointerException.class, () -> Calories.isValidCalories(null));

        // invalid calories number
        assertFalse(Calories.isValidCalories("")); // empty string
        assertFalse(Calories.isValidCalories(" ")); // spaces only
        assertFalse(Calories.isValidCalories("NaN")); // not a number
        assertFalse(Calories.isValidCalories("BLAHBLAHBLAH")); // non-numeric
        assertFalse(Calories.isValidCalories(".1111..")); // non-numeric

        // valid calories number
        assertTrue(Calories.isValidCalories("1000"));
        assertTrue(Calories.isValidCalories("1111"));
    }
}
```
###### /src/test/java/seedu/recipe/testutil/RecipeBuilder.java
``` java
    /**
     * Sets the {@code Instruction} of the {@code Recipe} that we are building.
     */
    public RecipeBuilder withInstruction(String instruction) {
        this.instruction = new Instruction(instruction);
        return this;
    }

    /**
     * Sets the {@code Ingredient} of the {@code Recipe} that we are building.
     */
    public RecipeBuilder withIngredient(String ingredient) {
        this.ingredient = new Ingredient(ingredient);
        return this;
    }

    /**
     * Sets the {@code CookingTime} of the {@code Recipe} that we are building.
     */
    public RecipeBuilder withCookingTime(String cookingTime) {
        this.cookingTime = new CookingTime(cookingTime);
        return this;
    }

    /**
     * Sets the {@code PreparationTime} of the {@code Recipe} that we are building.
     */
    public RecipeBuilder withPreparationTime(String preparationTime) {
        this.preparationTime = new PreparationTime(preparationTime);
        return this;
    }

    /**
     * Sets the {@code Calories} of the {@code Recipe} that we are building.
     */
    public RecipeBuilder withCalories(String calories) {
        this.calories = new Calories(calories);
        return this;
    }

    /**
     * Sets the {@code Servings} of the {@code Recipe} that we are building.
     */
    public RecipeBuilder withServings(String servings) {
        this.servings = new Servings(servings);
        return this;
    }

```
###### /src/test/java/seedu/recipe/testutil/EditRecipeDescriptorBuilder.java
``` java
    /**
     * Sets the {@code Ingredient} of the {@code EditRecipeDescriptor} that we are building.
     */
    public EditRecipeDescriptorBuilder withIngredient(String ingredient) {
        descriptor.setIngredient(new Ingredient(ingredient));
        return this;
    }

    /**
     * Sets the {@code Instruction} of the {@code EditRecipeDescriptor} that we are building.
     */
    public EditRecipeDescriptorBuilder withInstruction(String instruction) {
        descriptor.setInstruction(new Instruction(instruction));
        return this;
    }

    /**
     * Sets the {@code CookingTime} of the {@code EditRecipeDescriptor} that we are building.
     */
    public EditRecipeDescriptorBuilder withCookingTime(String cookingTime) {
        descriptor.setCookingTime(new CookingTime(cookingTime));
        return this;
    }

    /**
     * Sets the {@code PreparationTime} of the {@code EditRecipeDescriptor} that we are building.
     */
    public EditRecipeDescriptorBuilder withPreparationTime(String preparationTime) {
        descriptor.setPreparationTime(new PreparationTime(preparationTime));
        return this;
    }

    /**
     * Sets the {@code Calories} of the {@code EditRecipeDescriptor} that we are building.
     */
    public EditRecipeDescriptorBuilder withCalories(String calories) {
        descriptor.setCalories(new Calories(calories));
        return this;
    }

    /**
     * Sets the {@code Servings} of the {@code EditRecipeDescriptor} that we are building.
     */
    public EditRecipeDescriptorBuilder withServings(String servings) {
        descriptor.setServings(new Servings(servings));
        return this;
    }
```
###### /src/test/java/guitests/guihandles/CommandBoxHandle.java
``` java
    /**
     * Appends the given string to text already existing in the Command box
     */
    public void appendText(String text) {
        guiRobot.interact(() -> getRootNode().appendText(text));
        guiRobot.pauseForHuman();
    }

```
###### /src/test/java/guitests/guihandles/MainMenuHandle.java
``` java
    /**
     * Change theme using the menu bar in {@code MainWindow}.
     */
    public void changeThemeUsingMenu() {
        clickOnMenuItemsSequentially("Change Theme", "F2");
    }

    /**
     * Change theme by pressing the shortcut key associated with the menu bar in {@code MainWindow}.
     */
    public void changeThemeUsingAccelerator() {
        guiRobot.push(KeyCode.F2);
    }

```
###### /src/main/java/seedu/recipe/ui/util/WikiaParser.java
``` java
package seedu.recipe.ui.util;

import static java.util.Objects.requireNonNull;
import static seedu.recipe.logic.commands.AddCommand.COMMAND_WORD;
import static seedu.recipe.logic.parser.CliSyntax.PREFIX_IMG;
import static seedu.recipe.logic.parser.CliSyntax.PREFIX_INGREDIENT;
import static seedu.recipe.logic.parser.CliSyntax.PREFIX_INSTRUCTION;
import static seedu.recipe.logic.parser.CliSyntax.PREFIX_NAME;

import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * A WebParser for recipes.wikia.com
 */
public class WikiaParser implements WebParser {

    public static final String DOMAIN = "recipes.wikia.com";
    private static final String LF = "\n";

    private Document document;
    private Element contentText;

    /**
     * Constructs from a Ssoup Document.
     */
    public WikiaParser(Document document) {
        requireNonNull(document);
        this.document = document;
        contentText = this.document.getElementById("mw-content-text");
    }

    /**
     * Constructs from a HTML string.
     */
    public WikiaParser(String html) {
        requireNonNull(html);
        this.document = Jsoup.parse(html);
        contentText = this.document.getElementById("mw-content-text");
    }

    @Override
    public String parseRecipe() {
        String name = getName();
        String ingredient = getIngredient();
        String instruction = getInstruction();
        String imageUrl = getImageUrl();

        if (!name.equals("")) {
            StringBuilder commandBuilder = new StringBuilder();
            commandBuilder.append(COMMAND_WORD);
            commandBuilder.append(LF);
            commandBuilder.append(PREFIX_NAME);
            commandBuilder.append(name);
            if (!ingredient.equals("")) {
                commandBuilder.append(LF);
                commandBuilder.append(PREFIX_INGREDIENT);
                commandBuilder.append(ingredient);
            }
            if (!instruction.equals("")) {
                commandBuilder.append(LF);
                commandBuilder.append(PREFIX_INSTRUCTION);
                commandBuilder.append(instruction);
            }
            if (!imageUrl.equals("")) {
                commandBuilder.append(LF);
                commandBuilder.append(PREFIX_IMG);
                commandBuilder.append(imageUrl);
            }
            return commandBuilder.toString();
        }
        return null;
    }

    public String getName() {
        return document.selectFirst(".page-header__title").text();
    }

    public String getIngredient() {
        Elements elements = contentText.select("h2,ul");
        Iterator<Element> eleIte = elements.iterator();
        while (eleIte.hasNext() && !eleIte.next().text().startsWith("Ingredient")) {
            // Do nothing and just go to the line that starts with "Ingredient"
        }

        Elements elementsWithIngredientWithLink = new Elements();
        Elements elementsWithIngredient = new Elements();
        while (eleIte.hasNext()) {
            Element nextElement = eleIte.next();
            if (nextElement.tagName().contains("h2")) {
                break;
            }
            elementsWithIngredient.addAll(nextElement.select("li"));
            elementsWithIngredientWithLink.addAll(nextElement.select("a"));
        }

        List<String> ingredientList;
        if (elementsWithIngredientWithLink.isEmpty()) {
            ingredientList = elementsWithIngredient.eachText();
        } else {
            ingredientList = elementsWithIngredientWithLink.eachText();
        }
        return String.join(", ", ingredientList);
    }

    public String getInstruction() {
        Elements elementsWithInstruction = contentText.select("ol li");
        List<String> instructionList = elementsWithInstruction.eachText();
        return String.join("\n", instructionList);
    }

    public String getImageUrl() {
        Element image = contentText.selectFirst(".image img");
        if (image == null) {
            return "";
        } else {
            return image.attr("src");
        }
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof WikiaParser // instanceof handles nulls
                && document.equals(((WikiaParser) other).document));
    }
}
```
###### /src/main/java/seedu/recipe/ui/util/WebParser.java
``` java
package seedu.recipe.ui.util;

/**
 *  The API set of a web parser
 */
public interface WebParser {

    /**
     * Returns the parsed Recipe object from the page.
     */
    String parseRecipe();
}
```
###### /src/main/java/seedu/recipe/ui/util/WebParserHandler.java
``` java
package seedu.recipe.ui.util;

import java.net.URI;
import java.net.URISyntaxException;

import org.jsoup.helper.W3CDom;
import org.w3c.dom.Document;

import javafx.scene.web.WebView;

/**
 * Handles a WebParseRequestEvent
 */
public class WebParserHandler {

    private WebView browser;

    public WebParserHandler(WebView browser) {
        this.browser = browser;
    }

    /**
     * Returns the according WebParser to the currently loaded page in the BrowserPanel
     */
    public WebParser getWebParser() {
        String url = browser.getEngine().getLocation();
        Document document = browser.getEngine().getDocument();
        if (browser.getEngine().getTitle() != null) {
            return WebParserHandler.getWebParser(url, document);
        } else {
            return null;
        }
    }

    /**
     * Reads the {@code url}, returns the according WebParser loaded with {@code document}
     */
    public static WebParser getWebParser(String url, Document document) {
        try {
            URI uri = new URI(url);
            String domain = uri.getHost();
            W3CDom w3CDom = new W3CDom();
            String documentString = w3CDom.asString(document);
            switch (domain) {

            case WikiaParser.DOMAIN:
                return new WikiaParser(documentString);

            default:
                return null;

            }
        } catch (URISyntaxException e) {
            return null;
        }
    }
}
```
###### /src/main/java/seedu/recipe/ui/BrowserPanel.java
``` java
    @Subscribe
    private void handleInternetSearchRequestEvent(InternetSearchRequestEvent event) {
        logger.info(LogsCenter.getEventHandlingLogMessage(event));
        if (event.wikiaQueryHandler.getQueryNumberOfResults() != 0) {
            loadPage(event.wikiaQueryHandler.getRecipeQueryUrl());
        }
    }

    private void initializeWebParserHandler() {
        webParserHandler = new WebParserHandler(browser);
    }

    /**
     * Parses the BrowserPanel, gets an AddCommand string.
     */
    public String parseRecipe() {
        WebParser webParser = webParserHandler.getWebParser();
        if (webParser != null) {
            return webParser.parseRecipe();
        } else {
            return null;
        }
    }

```
###### /src/main/java/seedu/recipe/ui/MainWindow.java
``` java
    @Subscribe
    private void handleChangeThemeRequestEvent(ChangeThemeRequestEvent event) {
        logger.info(LogsCenter.getEventHandlingLogMessage(event));
        handleChangeTheme();
    }

    /**
     * Toggle between dark and light theme
     */
    @FXML
    public void handleChangeTheme() {
        boolean isUsingDarkTheme = prefs.getIsUsingDarkTheme();
        browserPanel.loadDefaultPage(!isUsingDarkTheme);
        loadStyle(!isUsingDarkTheme);
        prefs.setIsUsingDarkTheme(!isUsingDarkTheme);
    }

    @Subscribe
    private void handleWebParseRequestEvent(WebParseRequestEvent event) {
        logger.info(LogsCenter.getEventHandlingLogMessage(event));
        String parsedRecipe = browserPanel.parseRecipe();
        if (parsedRecipe != null) {
            commandBox.replaceText(parsedRecipe);
        } else {
            commandBox.replaceText("");
        }
    }

```
###### /src/main/java/seedu/recipe/commons/events/ui/WebParseRequestEvent.java
``` java
package seedu.recipe.commons.events.ui;

import seedu.recipe.commons.events.BaseEvent;

/**
 * Indicates a request to parse the page loaded in BrowserPanel.
 */
public class WebParseRequestEvent extends BaseEvent {

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
```
###### /src/main/java/seedu/recipe/commons/events/ui/InternetSearchRequestEvent.java
``` java
package seedu.recipe.commons.events.ui;

import seedu.recipe.commons.events.BaseEvent;
import seedu.recipe.logic.commands.util.WikiaQueryHandler;

/**
 * Indicates a request to search for recipe on the internet
 */
public class InternetSearchRequestEvent extends BaseEvent {

    public final WikiaQueryHandler wikiaQueryHandler;

    public InternetSearchRequestEvent(WikiaQueryHandler wikiaQueryHandler) {
        this.wikiaQueryHandler = wikiaQueryHandler;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
```
###### /src/main/java/seedu/recipe/commons/events/ui/ChangeThemeRequestEvent.java
``` java
package seedu.recipe.commons.events.ui;

import seedu.recipe.commons.events.BaseEvent;

/**
 * An event requesting to change the theme.
 */
public class ChangeThemeRequestEvent extends BaseEvent {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
```
###### /src/main/java/seedu/recipe/logic/parser/ParserUtil.java
``` java
    /**
     * Returns a null {@code Ingredient} object to use as the default value if no value is given.
     */
    public static Ingredient getNullReferenceIngredient() throws IllegalValueException {
        return new Ingredient(Ingredient.NULL_INGREDIENT_REFERENCE);
    }

    /**
     * Parses a {@code String ingredient} into an {@code Ingredient}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code ingredient} is invalid.
     */
    public static Ingredient parseIngredient(String ingredient) throws IllegalValueException {
        requireNonNull(ingredient);
        String trimmedIngredient = ingredient.trim();
        if (!Ingredient.isValidIngredient(trimmedIngredient)) {
            throw new IllegalValueException(Ingredient.MESSAGE_INGREDIENT_CONSTRAINTS);
        }
        return new Ingredient(trimmedIngredient);
    }

    /**
     * Parses a {@code Optional<String> ingredient} into an {@code Optional<Ingredient>}
     * if {@code ingredient} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<Ingredient> parseIngredient(Optional<String> ingredient) throws IllegalValueException {
        requireNonNull(ingredient);
        return ingredient.isPresent() ? Optional.of(parseIngredient(ingredient.get())) : Optional.empty();
    }

    /**
     * Parses a {@code Optional<String> ingredient} into an {@code Optional<Ingredient>}
     * if {@code ingredient} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<Ingredient> parseIngredientOnInitialAdd(Optional<String> ingredient)
            throws IllegalValueException {
        requireNonNull(ingredient);
        return ingredient.isPresent()
                ? Optional.of(parseIngredient(ingredient.get())) : Optional.of(getNullReferenceIngredient());
    }

    /**
     * Returns a null {@code Instruction} object to use as the default value if no value is given.
     */
    public static Instruction getNullReferenceInstruction() throws IllegalValueException {
        return new Instruction(Instruction.NULL_INSTRUCTION_REFERENCE);
    }

    /**
     * Parses a {@code String recipe} into an {@code Instruction}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code recipe} is invalid.
     */
    public static Instruction parseInstruction(String instruction) throws IllegalValueException {
        requireNonNull(instruction);
        String trimmedInstruction = instruction.trim();
        if (!Instruction.isValidInstuction(trimmedInstruction)) {
            throw new IllegalValueException(Instruction.MESSAGE_INSTRUCTION_CONSTRAINTS);
        }
        return new Instruction(trimmedInstruction);
    }

    /**
     * Parses a {@code Optional<String> recipe} into an {@code Optional<Instruction>} if {@code recipe} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<Instruction> parseInstruction(Optional<String> instruction) throws IllegalValueException {
        requireNonNull(instruction);
        return instruction.isPresent() ? Optional.of(parseInstruction(instruction.get())) : Optional.empty();
    }

    /**
     * Parses a {@code Optional<String> instruction} into an {@code Optional<Instruction>}
     * if {@code instruction} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<Instruction> parseInstructionOnInitialAdd(Optional<String> instruction)
            throws IllegalValueException {
        requireNonNull(instruction);
        return instruction.isPresent()
                ? Optional.of(parseInstruction(instruction.get())) : Optional.of(getNullReferenceInstruction());
    }

    /**
     * Returns a null {@code CookingTime} object to use as the default value if no value is given.
     */
    public static CookingTime getNullReferenceCookingTime() throws IllegalValueException {
        return new CookingTime(CookingTime.NULL_COOKING_TIME_REFERENCE);
    }

    /**
     * Parses a {@code String cookingTime} into a {@code CookingTime}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code cookingTime} is invalid.
     */
    public static CookingTime parseCookingTime(String cookingTime) throws IllegalValueException {
        requireNonNull(cookingTime);
        String trimmedCookingTime = cookingTime.trim();
        if (!CookingTime.isValidCookingTime(trimmedCookingTime)) {
            throw new IllegalValueException(CookingTime.MESSAGE_COOKING_TIME_CONSTRAINTS);
        }
        return new CookingTime(trimmedCookingTime);
    }

    /**
     * Parses a {@code Optional<String> cookingTime} into an {@code Optional<CookingTime>}
     * if {@code cookingTime} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<CookingTime> parseCookingTime(Optional<String> cookingTime) throws IllegalValueException {
        requireNonNull(cookingTime);
        return cookingTime.isPresent()
                ? Optional.of(parseCookingTime(cookingTime.get())) : Optional.empty();
    }

    /**
     * Parses a {@code Optional<String> cookingTime} into an {@code Optional<CookingTime>}
     * if {@code cookingTime} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<CookingTime> parseCookingTimeOnInitialAdd(Optional<String> cookingTime)
            throws IllegalValueException {
        requireNonNull(cookingTime);
        return cookingTime.isPresent()
                ? Optional.of(parseCookingTime(cookingTime.get())) : Optional.of(getNullReferenceCookingTime());
    }

    /**
     * Returns a null {@code PreparationTime} object to use as the default value if no value is given.
     */
    public static PreparationTime getNullReferencePreparationTime() throws IllegalValueException {
        return new PreparationTime(PreparationTime.NULL_PREPARATION_TIME_REFERENCE);
    }

    /**
     * Parses a {@code String preparationTime} into a {@code PreparationTime}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code preparationTime} is invalid.
     */
    public static PreparationTime parsePreparationTime(String preparationTime) throws IllegalValueException {
        requireNonNull(preparationTime);
        String trimmedPreparationTime = preparationTime.trim();
        if (!PreparationTime.isValidPreparationTime(trimmedPreparationTime)) {
            throw new IllegalValueException(PreparationTime.MESSAGE_PREPARATION_TIME_CONSTRAINTS);
        }
        return new PreparationTime(trimmedPreparationTime);
    }

    /**
     * Parses a {@code Optional<String> preparationTime} into an {@code Optional<PreparationTime>}
     * if {@code preparationTime} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<PreparationTime> parsePreparationTime(Optional<String> preparationTime)
            throws IllegalValueException {
        requireNonNull(preparationTime);
        return preparationTime.isPresent()
                ? Optional.of(parsePreparationTime(preparationTime.get())) : Optional.empty();
    }

    /**
     * Parses a {@code Optional<String> preparationTime} into an {@code Optional<PreparationTime>}
     * if {@code preparationTime} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<PreparationTime> parsePreparationTimeOnInitialAdd(Optional<String> preparationTime)
            throws IllegalValueException {
        requireNonNull(preparationTime);
        return preparationTime.isPresent() ? Optional.of(parsePreparationTime(preparationTime.get()))
                : Optional.of(getNullReferencePreparationTime());
    }

    /**
     * Returns a null {@code Calories} object to use as the default value if no value is given.
     */
    public static Calories getNullReferenceCalories() throws IllegalValueException {
        return new Calories(Calories.NULL_CALORIES_REFERENCE);
    }

    /**
     * Parses a {@code String calories} into a {@code Calories}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code calories} is invalid.
     */
    public static Calories parseCalories(String calories) throws IllegalValueException {
        requireNonNull(calories);
        String trimmedCalories = calories.trim();
        if (!Calories.isValidCalories(trimmedCalories)) {
            throw new IllegalValueException(Calories.MESSAGE_CALORIES_CONSTRAINTS);
        }
        return new Calories(trimmedCalories);
    }

    /**
     * Parses a {@code Optional<String> calories} into an {@code Optional<Calories>}
     * if {@code calories} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<Calories> parseCalories(Optional<String> calories) throws IllegalValueException {
        requireNonNull(calories);
        return calories.isPresent()
                ? Optional.of(parseCalories(calories.get())) : Optional.empty();
    }

    /**
     * Parses a {@code Optional<String> calories} into an {@code Optional<Calories>}
     * if {@code calories} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<Calories> parseCaloriesOnInitialAdd(Optional<String> calories) throws IllegalValueException {
        requireNonNull(calories);
        return calories.isPresent()
                ? Optional.of(parseCalories(calories.get())) : Optional.of(getNullReferenceCalories());
    }

    /**
     * Returns a null {@code Servings} object to use as the default value if no value is given.
     */
    public static Servings getNullReferenceServings() throws IllegalValueException {
        return new Servings(Servings.NULL_SERVINGS_REFERENCE);
    }

    /**
     * Parses a {@code String servings} into a {@code Servings}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws IllegalValueException if the given {@code servings} is invalid.
     */
    public static Servings parseServings(String servings) throws IllegalValueException {
        requireNonNull(servings);
        String trimmedServings = servings.trim();
        if (!Servings.isValidServings(trimmedServings)) {
            throw new IllegalValueException(Servings.MESSAGE_SERVINGS_CONSTRAINTS);
        }
        return new Servings(trimmedServings);
    }

    /**
     * Parses a {@code Optional<String> servings} into an {@code Optional<Servings>}
     * if {@code servings} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<Servings> parseServings(Optional<String> servings) throws IllegalValueException {
        requireNonNull(servings);
        return servings.isPresent()
                ? Optional.of(parseServings(servings.get())) : Optional.empty();
    }

    /**
     * Parses a {@code Optional<String> servings} into an {@code Optional<Servings>}
     * if {@code servings} is present.
     * See header comment of this class regarding the use of {@code Optional} parameters.
     */
    public static Optional<Servings> parseServingsOnInitialAdd(Optional<String> servings) throws IllegalValueException {
        requireNonNull(servings);
        return servings.isPresent()
                ? Optional.of(parseServings(servings.get())) : Optional.of(getNullReferenceServings());
    }

```
###### /src/main/java/seedu/recipe/logic/parser/ArgumentTokenizer.java
``` java
    private static int findPrefixPosition(String argsString, String prefix, int fromIndex) {
        Pattern pattern = Pattern.compile("[ \n]" + "\\Q" + prefix + "\\E");
        Matcher matcher = pattern.matcher(argsString);
        if (matcher.find(fromIndex)) {
            return matcher.start() + 1;
        } else {
            return -1;
        }
    }
```
###### /src/main/java/seedu/recipe/logic/parser/SearchCommandParser.java
``` java
package seedu.recipe.logic.parser;

import static seedu.recipe.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.recipe.logic.commands.SearchCommand;
import seedu.recipe.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new {@code SearchCommand} object
 */
public class SearchCommandParser implements Parser<SearchCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the SearchCOmmand
     * and returns an {@code SearchCommand} object for execution.
     *
     * @throws ParseException if the user input does not conform the expected format
     */
    public SearchCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();
        if (trimmedArgs.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, SearchCommand.MESSAGE_USAGE));
        }

        String[] keywords = trimmedArgs.split("\\s+");

        return new SearchCommand(String.join("+", keywords));
    }

}
```
###### /src/main/java/seedu/recipe/logic/commands/util/WikiaQuery.java
``` java
package seedu.recipe.logic.commands.util;

/**
 *  The API set of WikiaQueryHandler
 */
public interface WikiaQuery {

    /**
     * Returns the string value of the URL of the query.
     * This string can be used to get a displayable page for the {@code BrowserPanel}
     */
    String getRecipeQueryUrl();

    /**
     * Returns the number of results from the query.
     */
    int getQueryNumberOfResults();
}
```
###### /src/main/java/seedu/recipe/logic/commands/util/WikiaQueryHandler.java
``` java
package seedu.recipe.logic.commands.util;

import static java.util.Objects.requireNonNull;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.restfb.json.Json;
import com.restfb.json.JsonObject;

/**
 * Handle a query to recipes.wikia.com
 */
public class WikiaQueryHandler implements WikiaQuery {

    public static final String QUERY_URL = "http://recipes.wikia.com/wiki/Special:Search?query=";
    private static final String API_QUERY_URL = "http://recipes.wikia.com/api/v1/Search/List?query=";

    private String recipeToSearch;
    private URL queryUrl;
    private HttpURLConnection httpUrlConnection;
    private String rawDataString;
    private JsonObject rawDataJson;

    public WikiaQueryHandler(String recipeToSearch) {
        requireNonNull(recipeToSearch);
        this.recipeToSearch = recipeToSearch;
        loadUrl();
        startHttpConnection();
        getRawData();
        parseData();
    }

    @Override
    public String getRecipeQueryUrl() {
        return QUERY_URL + this.recipeToSearch;
    }

    @Override
    public int getQueryNumberOfResults() {
        return rawDataString == null ? 0 : rawDataJson.get("total").asInt();
    }

    /**
     * Creates a {@code URL} object from given {@code recipeToSearch} string.
     */
    private void loadUrl() {
        requireNonNull(recipeToSearch);
        try {
            queryUrl = new URL(API_QUERY_URL + recipeToSearch);
        } catch (MalformedURLException mue) {
            throw new AssertionError("Invalid query URL. This should not happen.", mue);
        }
    }

    /**
     * Creates a HTTP connection from the {@code URL} object.
     */
    private void startHttpConnection() {
        requireNonNull(queryUrl);
        try {
            httpUrlConnection = (HttpURLConnection) queryUrl.openConnection();
            httpUrlConnection.setRequestMethod("GET");
        } catch (IOException ioe) {
            throw new AssertionError("Something went wrong while the app was "
                    + "trying to create a connection to " + queryUrl.toExternalForm(), ioe);
        }
    }

    /**
     * Reads the HTTP connection and print data to {@code rawDataString}.
     * Adapted from https://stackoverflow.com/questions/1485708/how-do-i-do-a-http-get-in-java
     */
    private void getRawData() {
        requireNonNull(queryUrl);
        requireNonNull(httpUrlConnection);

        StringBuilder result = new StringBuilder();
        BufferedReader br;
        try {
            br = new BufferedReader(new InputStreamReader(httpUrlConnection.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
            br.close();
            rawDataString = result.toString();
        } catch (FileNotFoundException fnfe) {
            rawDataString = null;
        } catch (IOException ie) {
            throw new AssertionError("Something wrong happened while the app "
                    + "was trying to read data from the url " + queryUrl.toExternalForm(), ie);
        }
    }

    /**
     * Gets a {@code JSONObject} from {@code rawDataString}
     */
    private void parseData() {
        if (rawDataString != null) {
            rawDataJson = (JsonObject) Json.parse(rawDataString);
        }
    }
}
```
###### /src/main/java/seedu/recipe/logic/commands/ChangeThemeCommand.java
``` java
package seedu.recipe.logic.commands;

import seedu.recipe.commons.core.EventsCenter;
import seedu.recipe.commons.events.ui.ChangeThemeRequestEvent;

/**
 * Toggle between dark/light theme.
 */
public class ChangeThemeCommand extends Command {

    public static final String COMMAND_WORD = "theme";

    public static final String SHOWING_CHANGE_THEME_MESSAGE = "Theme changed.";

    @Override
    public CommandResult execute() {
        EventsCenter.getInstance().post(new ChangeThemeRequestEvent());
        return new CommandResult(SHOWING_CHANGE_THEME_MESSAGE);
    }
}
```
###### /src/main/java/seedu/recipe/logic/commands/ParseCommand.java
``` java
package seedu.recipe.logic.commands;

import seedu.recipe.commons.core.EventsCenter;
import seedu.recipe.commons.events.ui.WebParseRequestEvent;

/**
 * Parse the current page loaded in the BrowserPanel.
 */
public class ParseCommand extends Command {

    public static final String COMMAND_WORD = "parse";
    public static final String MESSAGE_SUCCESS = "ReciRecipe tried to parse the web page.";

    @Override
    public CommandResult execute() {
        EventsCenter.getInstance().post(new WebParseRequestEvent());
        return new CommandResult(MESSAGE_SUCCESS);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof ParseCommand); // instanceof handles nulls
    }
}
```
###### /src/main/java/seedu/recipe/logic/commands/SearchCommand.java
``` java
package seedu.recipe.logic.commands;

import seedu.recipe.commons.core.EventsCenter;
import seedu.recipe.commons.events.ui.InternetSearchRequestEvent;
import seedu.recipe.logic.commands.exceptions.CommandException;
import seedu.recipe.logic.commands.util.WikiaQueryHandler;

/**
 * Selects a recipe identified using it's last displayed index from the recipe book.
 */
public class SearchCommand extends Command {

    public static final String COMMAND_WORD = "search";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Search the recipe on recipes.wikia.com.\n"
            + "Parameters: NAME\n"
            + "Example: " + COMMAND_WORD + " chicken rice";
    public static final String MESSAGE_FAILURE = "No recipes found. Please try another query.";
    public static final String MESSAGE_SUCCESS = "Found %1$s recipe(s). Please wait while the page is loading...";

    private final String recipeToSearch;
    private final WikiaQueryHandler wikiaQueryHandler;

    public SearchCommand(String recipeToSearch) {
        this.recipeToSearch = recipeToSearch;
        this.wikiaQueryHandler = new WikiaQueryHandler(recipeToSearch);
    }

    @Override
    public CommandResult execute() throws CommandException {
        int noOfResult = wikiaQueryHandler.getQueryNumberOfResults();

        EventsCenter.getInstance().post(new InternetSearchRequestEvent(wikiaQueryHandler));

        if (noOfResult == 0) {
            return new CommandResult(MESSAGE_FAILURE);
        } else {
            return new CommandResult(String.format(MESSAGE_SUCCESS, noOfResult));
        }
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof SearchCommand // instanceof handles nulls
                && this.recipeToSearch.equals(((SearchCommand) other).recipeToSearch)); // state check
    }
}

```
###### /src/main/java/seedu/recipe/storage/XmlAdaptedRecipe.java
``` java
        if (this.ingredient == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,
                    Ingredient.class.getSimpleName()));
        }
        if (!Ingredient.isValidIngredient(this.ingredient)) {
            throw new IllegalValueException(Ingredient.MESSAGE_INGREDIENT_CONSTRAINTS);
        }
        final Ingredient ingredient = new Ingredient(this.ingredient);

        if (this.instruction == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,
                    Instruction.class.getSimpleName()));
        }
        if (!Instruction.isValidInstuction(this.instruction)) {
            throw new IllegalValueException(Instruction.MESSAGE_INSTRUCTION_CONSTRAINTS);
        }
        final Instruction instruction = new Instruction(this.instruction);

        if (this.preparationTime == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,
                    PreparationTime.class.getSimpleName()));
        }
        if (!PreparationTime.isValidPreparationTime(this.preparationTime)) {
            throw new IllegalValueException(PreparationTime.MESSAGE_PREPARATION_TIME_CONSTRAINTS);
        }
        final PreparationTime preparationTime = new PreparationTime(this.preparationTime);

        if (this.cookingTime == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,
                    CookingTime.class.getSimpleName()));
        }
        if (!CookingTime.isValidCookingTime(this.cookingTime)) {
            throw new IllegalValueException(CookingTime.MESSAGE_COOKING_TIME_CONSTRAINTS);
        }
        final CookingTime cookingTime = new CookingTime(this.cookingTime);

        if (this.calories == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,
                    Calories.class.getSimpleName()));
        }
        if (!Calories.isValidCalories(this.calories)) {
            throw new IllegalValueException(Calories.MESSAGE_CALORIES_CONSTRAINTS);
        }
        final Calories calories = new Calories(this.calories);

        if (this.servings == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,
                    Servings.class.getSimpleName()));
        }
        if (!Servings.isValidServings(this.servings)) {
            throw new IllegalValueException(Servings.MESSAGE_SERVINGS_CONSTRAINTS);
        }
        final Servings servings = new Servings(this.servings);

```
###### /src/main/java/seedu/recipe/model/recipe/Servings.java
``` java
package seedu.recipe.model.recipe;

import static java.util.Objects.requireNonNull;
import static seedu.recipe.commons.util.AppUtil.checkArgument;

/**
 * Represents a Recipe's number of servings in the Recipe Book.
 * Guarantees: immutable; is valid as declared in {@link #isValidServings(String)}
 */
public class Servings {

    public static final String NULL_SERVINGS_REFERENCE = "-";
    public static final String MESSAGE_SERVINGS_CONSTRAINTS = "The number of servings must a positive integer.";
    public static final String SERVINGS_VALIDATION_REGEX = "[\\d]+";
    public final String value;

    /**
     * Constructs a {@code Servings} object.
     *
     * @param servings A valid number of servings.
     */
    public Servings(String servings) {
        requireNonNull(servings);
        checkArgument(isValidServings(servings), MESSAGE_SERVINGS_CONSTRAINTS);
        this.value = servings;
    }

    /**
     * Returns true if a given string is a valid number of servings.
     */
    public static boolean isValidServings(String test) {
        return test.equals(NULL_SERVINGS_REFERENCE) || test.matches(SERVINGS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Servings // instanceof handles nulls
                && this.value.equals(((Servings) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
```
###### /src/main/java/seedu/recipe/model/recipe/PreparationTime.java
``` java
package seedu.recipe.model.recipe;

import static java.util.Objects.requireNonNull;
import static seedu.recipe.commons.util.AppUtil.checkArgument;

/**
 * Represents a Recipe's preparation time in the Recipe Book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPreparationTime(String)}
 */
public class PreparationTime {

    public static final String NULL_PREPARATION_TIME_REFERENCE = "-";
    public static final String MESSAGE_PREPARATION_TIME_CONSTRAINTS =
            "Preparation time can be in any of these format: 1h20m, 80m, 1 hour 20 minutes, 1 h 20 min, 80.";
    public static final String PREPARATION_TIME_VALIDATION_REGEX =
            "([\\d]+[ ]{0,1}(minute[s]{0,1}|min[s]{0,1}|m|hour[s]{0,1}|h){0,1}[ ]{0,1}){1,2}";
    public final String value;

    /**
     * Constructs a {@code PreparationTime}.
     *
     * @param preparationTime A valid preparation time.
     */
    public PreparationTime(String preparationTime) {
        requireNonNull(preparationTime);
        checkArgument(isValidPreparationTime(preparationTime), MESSAGE_PREPARATION_TIME_CONSTRAINTS);
        this.value = preparationTime;
    }

    /**
     * Returns true if a given string is a valid recipe preparation time.
     */
    public static boolean isValidPreparationTime(String test) {
        return test.equals(NULL_PREPARATION_TIME_REFERENCE) || test.matches(PREPARATION_TIME_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof PreparationTime // instanceof handles nulls
                && this.value.equals(((PreparationTime) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
```
###### /src/main/java/seedu/recipe/model/recipe/Calories.java
``` java
package seedu.recipe.model.recipe;

import static java.util.Objects.requireNonNull;
import static seedu.recipe.commons.util.AppUtil.checkArgument;

/**
 * Represents a Recipe's number of calories in the Recipe Book.
 * Guarantees: immutable; is valid as declared in {@link #isValidCalories(String)}
 */
public class Calories {

    public static final String NULL_CALORIES_REFERENCE = "-";
    public static final String MESSAGE_CALORIES_CONSTRAINTS = "The number of calories must a positive integer.";
    public static final String CALORIES_VALIDATION_REGEX = "[\\d]+";
    public final String value;

    /**
     * Constructs a {@code Calories} object.
     *
     * @param calories A valid number of calories.
     */
    public Calories(String calories) {
        requireNonNull(calories);
        checkArgument(isValidCalories(calories), MESSAGE_CALORIES_CONSTRAINTS);
        this.value = calories;
    }

    /**
     * Returns true if a given string is a valid number of calories.
     */
    public static boolean isValidCalories(String test) {
        return test.equals(NULL_CALORIES_REFERENCE) || test.matches(CALORIES_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Calories // instanceof handles nulls
                && this.value.equals(((Calories) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
```
###### /src/main/java/seedu/recipe/model/recipe/CookingTime.java
``` java
package seedu.recipe.model.recipe;

import static java.util.Objects.requireNonNull;
import static seedu.recipe.commons.util.AppUtil.checkArgument;

/**
 * Represents a Recipe's cooking time in the Recipe Book.
 * Guarantees: immutable; is valid as declared in {@link #isValidCookingTime(String)}
 */
public class CookingTime {

    public static final String NULL_COOKING_TIME_REFERENCE = "-";
    public static final String MESSAGE_COOKING_TIME_CONSTRAINTS =
            "Cooking time can be in any of these format: 1h10m, 70m, 1 hour 10 minutes, 1 h 10 min, 70.";
    public static final String COOKING_TIME_VALIDATION_REGEX =
            "([\\d]+[ ]{0,1}(minute[s]{0,1}|min[s]{0,1}|m|hour[s]{0,1}|h){0,1}[ ]{0,1}){1,2}";
    public final String value;

    /**
     * Constructs a {@code CookingTime}.
     *
     * @param cookingTime A valid cooking time.
     */
    public CookingTime(String cookingTime) {
        requireNonNull(cookingTime);
        checkArgument(isValidCookingTime(cookingTime), MESSAGE_COOKING_TIME_CONSTRAINTS);
        this.value = cookingTime;
    }

    /**
     * Returns true if a given string is a valid recipe cooking time.
     */
    public static boolean isValidCookingTime(String test) {
        return test.equals(NULL_COOKING_TIME_REFERENCE) || test.matches(COOKING_TIME_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof CookingTime // instanceof handles nulls
                && this.value.equals(((CookingTime) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
```
