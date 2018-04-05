# hoangduong1607
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui.util/TextInputProcessorUtil.java.html
``` html

/**
 * Provides basic functions for processing text input
 */
public class TextInputProcessorUtil {

    private static final String EMPTY_STRING = &quot;&quot;;
    private static final char LF = '\n';
    private static final char SPACE = ' ';

    private String content;
    private Font font;
    private Text text;

<span class="fc" id="L21">    public TextInputProcessorUtil() {</span>
<span class="fc" id="L22">        content = new String();</span>
<span class="fc" id="L23">        text = new Text();</span>
<span class="fc" id="L24">    }</span>

    /**
     * Gets X-coordinate of caret
     */
    public double getCaretPositionX() {
<span class="fc" id="L30">        Text lastLine = new Text(getTextWithoutLastWord(getLastLine()));</span>
<span class="fc" id="L31">        lastLine.setFont(font);</span>
<span class="fc" id="L32">        return lastLine.prefWidth(-1);</span>
    }

    /**
     * Gets Y-coordinate of caret
     */
    public double getCaretPositionY() {
<span class="fc" id="L39">        return text.prefHeight(-1);</span>
    }

    /**
     * Gets last word from {@code content}
     */
    public String getLastWord() {
<span class="fc" id="L46">        String lastWord = EMPTY_STRING;</span>

<span class="fc bfc" id="L48" title="All 2 branches covered.">        for (int i = content.length() - 1; i &gt;= 0; i--) {</span>
<span class="fc bfc" id="L49" title="All 2 branches covered.">            if (isWordSeparator(content.charAt(i))) {</span>
<span class="fc" id="L50">                break;</span>
            }
<span class="fc" id="L52">            lastWord = content.charAt(i) + lastWord;</span>
        }

<span class="fc" id="L55">        return lastWord;</span>
    }

    /**
     * Checks whether {@code inputChar} is a word separator
     */
    private boolean isWordSeparator(char inputChar) {
<span class="pc bpc" id="L62" title="1 of 4 branches missed.">        return (inputChar == LF || inputChar == SPACE);</span>
    }

    /**
     * Gets last line from {@code content}
     */
    public String getLastLine() {
<span class="fc" id="L69">        String lastLine = new String(&quot;&quot;);</span>

<span class="fc bfc" id="L71" title="All 2 branches covered.">        for (int i = content.length() - 1; i &gt;= 0; i--) {</span>
<span class="pc bpc" id="L72" title="1 of 2 branches missed.">            if (isLineSeparator(content.charAt(i))) {</span>
<span class="nc" id="L73">                break;</span>
            }
<span class="fc" id="L75">            lastLine = content.charAt(i) + lastLine;</span>
        }

<span class="fc" id="L78">        return lastLine;</span>
    }

    /**
     * Checks whether {@code inputChar} is a line separator
     */
    private boolean isLineSeparator(char inputChar) {
<span class="pc bpc" id="L85" title="1 of 2 branches missed.">        return (inputChar == LF);</span>
    }

    /**
     * Gets the resulting text after replacing last word of {@code content} with {@code newLastWord}
     */
    public String replaceLastWord(String newLastWord) {
<span class="fc" id="L92">        return getTextWithoutLastWord() + newLastWord;</span>
    }

    /**
     * Gets the resulting text after removing last word from {@code content}
     */
    public String getTextWithoutLastWord() {
<span class="fc" id="L99">        int newLength = content.length() - getLastWord().length();</span>
<span class="fc" id="L100">        return content.substring(0, newLength);</span>
    }

    /**
     * Gets the resulting text after removing last word from {@code inputText}
     */
    public String getTextWithoutLastWord(String inputText) {
<span class="fc" id="L107">        int newLength = inputText.length() - getLastWord().length();</span>
<span class="fc" id="L108">        return inputText.substring(0, newLength);</span>
    }

    /**
     * Sets content in TextInputProcessor to {@code inputText}
     */
    public void setContent(String inputText) {
<span class="fc" id="L115">        content = inputText;</span>
<span class="fc" id="L116">        text.setText(inputText);</span>
<span class="fc" id="L117">        text.setFont(font);</span>
<span class="fc" id="L118">    }</span>

    /**
     * Sets font of content in TextInputProcessor to {@code font}
     */
    public void setFont(Font inputFont) {
<span class="fc" id="L124">        font = inputFont;</span>
<span class="fc" id="L125">    }</span>
}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui.util/AutoCompletionUtil.java.html
``` html

/**
 * Contains constants and functions needed for auto-completion
 */
public class AutoCompletionUtil {
<span class="fc" id="L15">    public static final ArrayList&lt;String&gt; APPLICATION_COMMANDS = new ArrayList&lt;&gt;(Arrays.asList(&quot;add&quot;, &quot;clear&quot;, &quot;delete&quot;,</span>
            &quot;edit&quot;, &quot;exit&quot;, &quot;find&quot;, &quot;help&quot;, &quot;history&quot;, &quot;list&quot;, &quot;redo&quot;, &quot;select&quot;, &quot;share&quot;, &quot;tag&quot;, &quot;undo&quot;, &quot;upload&quot;));
<span class="fc" id="L17">    public static final ArrayList&lt;String&gt; APPLICATION_KEYWORDS = new ArrayList&lt;&gt;(Arrays.asList(</span>
<span class="fc" id="L18">            CliSyntax.PREFIX_NAME.toString(), CliSyntax.PREFIX_INGREDIENT.toString(),</span>
<span class="fc" id="L19">            CliSyntax.PREFIX_INSTRUCTION.toString(), CliSyntax.PREFIX_PREPARATION_TIME.toString(),</span>
<span class="fc" id="L20">            CliSyntax.PREFIX_TAG.toString(), CliSyntax.PREFIX_URL.toString()));</span>
    public static final int MAX_SUGGESTIONS = 8;
    public static final char LF = '\n';
    public static final char WHITESPACE = ' ';
    public static final char END_FIELD = '/';

    private HashMap&lt;String, ArrayList&lt;String&gt;&gt; prefixesForCommand;

<span class="fc" id="L28">    public AutoCompletionUtil() {</span>
<span class="fc" id="L29">        prefixesForCommand = new HashMap&lt;&gt;();</span>

<span class="fc" id="L31">        ArrayList&lt;String&gt; addPrefixes = new ArrayList&lt;&gt;(Arrays.asList(CliSyntax.PREFIX_NAME.toString(),</span>
<span class="fc" id="L32">                CliSyntax.PREFIX_INGREDIENT.toString(), CliSyntax.PREFIX_INSTRUCTION.toString(),</span>
<span class="fc" id="L33">                CliSyntax.PREFIX_PREPARATION_TIME.toString(), CliSyntax.PREFIX_TAG.toString(),</span>
<span class="fc" id="L34">                CliSyntax.PREFIX_URL.toString()));</span>
<span class="fc" id="L35">        prefixesForCommand.put(&quot;add&quot;, addPrefixes);</span>

<span class="fc" id="L37">        ArrayList&lt;String&gt; editPrefixes = new ArrayList&lt;&gt;(Arrays.asList(CliSyntax.PREFIX_NAME.toString(),</span>
<span class="fc" id="L38">                CliSyntax.PREFIX_INGREDIENT.toString(), CliSyntax.PREFIX_INSTRUCTION.toString(),</span>
<span class="fc" id="L39">                CliSyntax.PREFIX_PREPARATION_TIME.toString(), CliSyntax.PREFIX_TAG.toString(),</span>
<span class="fc" id="L40">                CliSyntax.PREFIX_URL.toString()));</span>
<span class="fc" id="L41">        prefixesForCommand.put(&quot;edit&quot;, editPrefixes);</span>

<span class="fc bfc" id="L43" title="All 2 branches covered.">        for (String command : APPLICATION_COMMANDS) {</span>
<span class="fc bfc" id="L44" title="All 4 branches covered.">            if (!command.equals(&quot;add&quot;) &amp;&amp; !command.equals(&quot;edit&quot;)) {</span>
<span class="fc" id="L45">                prefixesForCommand.put(command, new ArrayList&lt;&gt;());</span>
            }
<span class="fc" id="L47">        }</span>
<span class="fc" id="L48">    }</span>

    /**
     * Checks whether {@code text} is a command keyword
     */
    public boolean isCommandKeyWord(String text) {
<span class="fc" id="L54">        return prefixesForCommand.containsKey(text);</span>
    }

    /**
     * Generates auto-completed command
     */
    public String getAutoCompletionText(String command) {
<span class="fc" id="L61">        String autoCompletionText = command;</span>

<span class="fc bfc" id="L63" title="All 2 branches covered.">        for (String prefix : prefixesForCommand.get(command)) {</span>
<span class="fc" id="L64">            autoCompletionText = autoCompletionText + WHITESPACE + LF + prefix;</span>
<span class="fc" id="L65">        }</span>

<span class="fc" id="L67">        return autoCompletionText;</span>
    }

    /**
     * Finds position of next field.
     * Returns current position of caret if no field is found
     */
    public int getNextFieldPosition(String inputText, int currentCaretPosition) {
<span class="fc" id="L75">        int nextFieldCaretPosition = currentCaretPosition;</span>

<span class="pc bpc" id="L77" title="1 of 2 branches missed.">        for (int i = 0; i &lt; inputText.length(); i++) {</span>
<span class="fc" id="L78">            int wrapAroundPosition = (i + currentCaretPosition) % inputText.length();</span>

<span class="fc bfc" id="L80" title="All 2 branches covered.">            if (inputText.charAt(wrapAroundPosition) == END_FIELD) {</span>
<span class="fc" id="L81">                nextFieldCaretPosition = wrapAroundPosition + 1;</span>
<span class="fc" id="L82">                break;</span>
            }
        }

<span class="fc" id="L86">        return nextFieldCaretPosition;</span>
    }
}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui/CommandBox.java.html
``` html

    /**
     * Moves caret to the next field in input text.
     * If no field is found after current position, continue from beginning of input text.
     */
    private void moveToNextField() {
<span class="fc" id="L91">        int currentCaretPosition = commandTextArea.getCaretPosition();</span>
<span class="fc" id="L92">        int nextFieldPosition = autoCompletionUtil.getNextFieldPosition(commandTextArea.getText(),</span>
                currentCaretPosition);
<span class="fc" id="L94">        commandTextArea.positionCaret(nextFieldPosition);</span>
<span class="fc" id="L95">    }</span>

    /**
     * Automatically fills command box with text generated by auto-completion
     */
    protected void autoComplete(String text) {
<span class="fc" id="L101">        String prefix = commandTextArea.getText().substring(0, commandTextArea.getCaretPosition());</span>
<span class="fc" id="L102">        String suffix = commandTextArea.getText().substring(commandTextArea.getCaretPosition());</span>

<span class="fc" id="L104">        textInputProcessor.setContent(prefix);</span>

        String autoCompletionText;
        int caretPosition;
<span class="fc bfc" id="L108" title="All 2 branches covered.">        if (autoCompletionUtil.isCommandKeyWord(text)) {</span>
<span class="fc" id="L109">            autoCompletionText = autoCompletionUtil.getAutoCompletionText(text);</span>
<span class="fc" id="L110">            caretPosition = text.length() + 1;</span>
        } else {
<span class="fc" id="L112">            autoCompletionText = textInputProcessor.replaceLastWord(text);</span>
<span class="fc" id="L113">            caretPosition = autoCompletionText.length();</span>
<span class="fc" id="L114">            autoCompletionText = autoCompletionText + suffix;</span>
        }

<span class="fc" id="L117">        replaceText(autoCompletionText);</span>
<span class="fc" id="L118">        commandTextArea.positionCaret(caretPosition);</span>
<span class="fc" id="L119">    }</span>

```
###### /build/reports/jacoco/coverage/html/seedu.recipe.ui/SuggestionsPopUp.java.html
``` html

/**
 * The component that is responsible for showing a suggestion list for auto-completion
 */
public class SuggestionsPopUp extends ContextMenu {

    private CommandBox commandBox;
    private TextArea commandTextArea;
    private TextInputProcessorUtil textInputProcessor;

    protected SuggestionsPopUp(CommandBox commandBox) {
<span class="fc" id="L29">        super();</span>
<span class="fc" id="L30">        this.commandBox = commandBox;</span>
<span class="fc" id="L31">        commandTextArea = commandBox.getCommandTextArea();</span>
<span class="fc" id="L32">        textInputProcessor = new TextInputProcessorUtil();</span>
<span class="fc" id="L33">    }</span>

    /**
     * Hides suggestions
     */
    protected void hideSuggestions() {
<span class="pc bpc" id="L39" title="1 of 2 branches missed.">        if (isShowing()) {</span>
<span class="nc" id="L40">            hide();</span>
        }
<span class="fc" id="L42">    }</span>

    /**
     * Shows suggestions for commands when users type in Command Box
     */
    protected void showSuggestions() {
<span class="fc" id="L48">        String prefix = commandTextArea.getText().substring(0, commandTextArea.getCaretPosition());</span>
<span class="fc" id="L49">        textInputProcessor.setContent(prefix);</span>
<span class="fc" id="L50">        textInputProcessor.setFont(commandTextArea.getFont());</span>
<span class="fc" id="L51">        String lastWord = textInputProcessor.getLastWord();</span>
        // finds suggestions and displays
<span class="fc" id="L53">        ArrayList&lt;String&gt; suggestionList = new ArrayList&lt;&gt;(APPLICATION_KEYWORDS);</span>
<span class="fc" id="L54">        suggestionList.addAll(APPLICATION_COMMANDS);</span>

<span class="fc" id="L56">        findSuggestions(lastWord, suggestionList);</span>

        // gets caret position based on input text and font
<span class="fc" id="L59">        double anchorX = findDisplayPositionX(textInputProcessor.getCaretPositionX());</span>
<span class="fc" id="L60">        double anchorY = findDisplayPositionY(textInputProcessor.getCaretPositionY());</span>

<span class="fc" id="L62">        show(commandTextArea, Side.BOTTOM, anchorX, anchorY);</span>
<span class="fc" id="L63">    }</span>

    /**
     * Finds possible suggestions from {@code word} and
     * list of valid suggestions {@code textList}.
     */
    private void findSuggestions(String prefix, List&lt;String&gt; dictionary) {
<span class="fc" id="L70">        getItems().clear();</span>
<span class="fc" id="L71">        Collections.sort(dictionary);</span>

<span class="fc bfc" id="L73" title="All 2 branches covered.">        for (String suggestion : dictionary) {</span>
<span class="fc bfc" id="L74" title="All 2 branches covered.">            if (suggestion.startsWith(prefix)) {</span>
<span class="fc" id="L75">                addSuggestion(suggestion);</span>
            }

<span class="fc bfc" id="L78" title="All 2 branches covered.">            if (getItems().size() == MAX_SUGGESTIONS) {</span>
<span class="fc" id="L79">                break;</span>
            }
<span class="fc" id="L81">        }</span>
<span class="fc" id="L82">    }</span>

    /**
     * Finds X-coordinate to display SuggestionsPopUp in CommandBox
     */
    double findDisplayPositionX(double caretPositionX) {
<span class="fc" id="L88">        return commandBox.getRoot().getLayoutX() + commandTextArea.getInsets().getLeft() + caretPositionX;</span>
    }

    /**
     * Finds Y-coordinate to display SuggestionsPopUp in CommandBox
     */
    double findDisplayPositionY(double caretPositionY) {
<span class="fc" id="L95">        return Math.min(-commandTextArea.getHeight() + commandTextArea.getInsets().getTop()</span>
<span class="fc" id="L96">                + commandTextArea.getInsets().getBottom() + caretPositionY, -commandTextArea.getInsets().getBottom());</span>
    }

    /**
     * Adds a suggestion to suggestion list
     */
    private void addSuggestion(String suggestion) {
<span class="fc" id="L103">        MenuItem item = new MenuItem(suggestion);</span>
<span class="fc" id="L104">        item.setOnAction(event -&gt; commandBox.autoComplete(item.getText()));</span>
<span class="fc" id="L105">        getItems().add(item);</span>
<span class="fc" id="L106">    }</span>
}
</pre><div class="footer"><span class="right">Created with <a href="http://www.eclemma.org/jacoco">JaCoCo</a> 0.7.1.201405082137</span></div></body></html>
```
###### /src/test/java/seedu/recipe/ui/CommandBoxTest.java
``` java
    @Test
    public void commandBox_handleShowingSuggestions() {
        commandBoxHandle.insertText(ADD_COMMAND);
        commandBoxHandle.insertText(WHITESPACE);
        commandBoxHandle.insertText(String.valueOf(PREFIX_NAME.charAt(0)));
        guiRobot.push(KeyboardShortcutsMapping.SHOW_SUGGESTIONS_COMMAND);
        guiRobot.push(KeyCode.DOWN);
        guiRobot.push(KeyCode.ENTER);
        assertInput(ADD_COMMAND_WITH_PREFIX_NAME);

        commandBoxHandle.insertText(WHITESPACE);
        guiRobot.push(KeyboardShortcutsMapping.SHOW_SUGGESTIONS_COMMAND);
        guiRobot.push(KeyCode.DOWN);
        guiRobot.push(KeyCode.DOWN);
        guiRobot.push(KeyCode.ENTER);
        assertInput(SECOND_SUGGESTION);
    }

    @Test
    public void commandBox_handleAutoCompletion() {
        guiRobot.push(KeyboardShortcutsMapping.SHOW_SUGGESTIONS_COMMAND);
        guiRobot.push(KeyCode.DOWN);
        guiRobot.push(KeyCode.ENTER);
        assertInput(AUTO_COMPLETION_FOR_ADD_COMMAND);

        guiRobot.push(KeyboardShortcutsMapping.NEXT_FIELD);
        commandBoxHandle.insertText(RECIPE_NAME);
        assertInput(AUTO_COMPLETION_FOR_ADD_COMMAND_WITH_RECIPE_NAME);
    }

```
###### /src/test/java/guitests/guihandles/CommandBoxHandle.java
``` java
    /**
     * Inserts the given string to text at current caret position
     */
    public void insertText(String text) {
        int caretPosition = getRootNode().getCaretPosition();
        guiRobot.interact(() -> getRootNode().insertText(caretPosition, text));
        guiRobot.pauseForHuman();
    }

```
###### /src/main/java/seedu/recipe/ui/CommandBox.java
``` java

    /**
     * Moves caret to the next field in input text.
     * If no field is found after current position, continue from beginning of input text.
     */
    private void moveToNextField() {
        int currentCaretPosition = commandTextArea.getCaretPosition();
        int nextFieldPosition = autoCompletionUtil.getNextFieldPosition(commandTextArea.getText(),
                currentCaretPosition);
        commandTextArea.positionCaret(nextFieldPosition);
    }

    /**
     * Automatically fills command box with text generated by auto-completion
     */
    protected void autoComplete(String text) {
        String prefix = commandTextArea.getText().substring(0, commandTextArea.getCaretPosition());
        String suffix = commandTextArea.getText().substring(commandTextArea.getCaretPosition());

        textInputProcessor.setContent(prefix);

        String autoCompletionText;
        int caretPosition;
        if (autoCompletionUtil.isCommandKeyWord(text)) {
            autoCompletionText = autoCompletionUtil.getAutoCompletionText(text);
            caretPosition = text.length() + 1;
        } else {
            autoCompletionText = textInputProcessor.replaceLastWord(text);
            caretPosition = autoCompletionText.length();
            autoCompletionText = autoCompletionText + suffix;
        }

        replaceText(autoCompletionText);
        commandTextArea.positionCaret(caretPosition);
    }

```
###### /src/main/java/seedu/recipe/ui/util/AutoCompletionUtil.java
``` java

/**
 * Contains constants and functions needed for auto-completion
 */
public class AutoCompletionUtil {
    public static final ArrayList<String> APPLICATION_COMMANDS = new ArrayList<>(Arrays.asList("add", "clear", "delete",
            "edit", "exit", "find", "help", "history", "list", "redo", "select", "share", "tag", "undo", "upload"));
    public static final ArrayList<String> APPLICATION_KEYWORDS = new ArrayList<>(Arrays.asList(
            CliSyntax.PREFIX_NAME.toString(), CliSyntax.PREFIX_INGREDIENT.toString(),
            CliSyntax.PREFIX_INSTRUCTION.toString(), CliSyntax.PREFIX_PREPARATION_TIME.toString(),
            CliSyntax.PREFIX_TAG.toString(), CliSyntax.PREFIX_URL.toString()));
    public static final int MAX_SUGGESTIONS = 8;
    public static final char LF = '\n';
    public static final char WHITESPACE = ' ';
    public static final char END_FIELD = '/';

    private HashMap<String, ArrayList<String>> prefixesForCommand;

    public AutoCompletionUtil() {
        prefixesForCommand = new HashMap<>();

        ArrayList<String> addPrefixes = new ArrayList<>(Arrays.asList(CliSyntax.PREFIX_NAME.toString(),
                CliSyntax.PREFIX_INGREDIENT.toString(), CliSyntax.PREFIX_INSTRUCTION.toString(),
                CliSyntax.PREFIX_PREPARATION_TIME.toString(), CliSyntax.PREFIX_TAG.toString(),
                CliSyntax.PREFIX_URL.toString()));
        prefixesForCommand.put("add", addPrefixes);

        ArrayList<String> editPrefixes = new ArrayList<>(Arrays.asList(CliSyntax.PREFIX_NAME.toString(),
                CliSyntax.PREFIX_INGREDIENT.toString(), CliSyntax.PREFIX_INSTRUCTION.toString(),
                CliSyntax.PREFIX_PREPARATION_TIME.toString(), CliSyntax.PREFIX_TAG.toString(),
                CliSyntax.PREFIX_URL.toString()));
        prefixesForCommand.put("edit", editPrefixes);

        for (String command : APPLICATION_COMMANDS) {
            if (!command.equals("add") && !command.equals("edit")) {
                prefixesForCommand.put(command, new ArrayList<>());
            }
        }
    }

    /**
     * Checks whether {@code text} is a command keyword
     */
    public boolean isCommandKeyWord(String text) {
        return prefixesForCommand.containsKey(text);
    }

    /**
     * Generates auto-completed command
     */
    public String getAutoCompletionText(String command) {
        String autoCompletionText = command;

        for (String prefix : prefixesForCommand.get(command)) {
            autoCompletionText = autoCompletionText + WHITESPACE + LF + prefix;
        }

        return autoCompletionText;
    }

    /**
     * Finds position of next field.
     * Returns current position of caret if no field is found
     */
    public int getNextFieldPosition(String inputText, int currentCaretPosition) {
        int nextFieldCaretPosition = currentCaretPosition;

        for (int i = 0; i < inputText.length(); i++) {
            int wrapAroundPosition = (i + currentCaretPosition) % inputText.length();

            if (inputText.charAt(wrapAroundPosition) == END_FIELD) {
                nextFieldCaretPosition = wrapAroundPosition + 1;
                break;
            }
        }

        return nextFieldCaretPosition;
    }
}
```
###### /src/main/java/seedu/recipe/ui/util/TextInputProcessorUtil.java
``` java

/**
 * Provides basic functions for processing text input
 */
public class TextInputProcessorUtil {

    private static final String EMPTY_STRING = "";
    private static final char LF = '\n';
    private static final char SPACE = ' ';

    private String content;
    private Font font;
    private Text text;

    public TextInputProcessorUtil() {
        content = new String();
        text = new Text();
    }

    /**
     * Gets X-coordinate of caret
     */
    public double getCaretPositionX() {
        Text lastLine = new Text(getTextWithoutLastWord(getLastLine()));
        lastLine.setFont(font);
        return lastLine.prefWidth(-1);
    }

    /**
     * Gets Y-coordinate of caret
     */
    public double getCaretPositionY() {
        return text.prefHeight(-1);
    }

    /**
     * Gets last word from {@code content}
     */
    public String getLastWord() {
        String lastWord = EMPTY_STRING;

        for (int i = content.length() - 1; i >= 0; i--) {
            if (isWordSeparator(content.charAt(i))) {
                break;
            }
            lastWord = content.charAt(i) + lastWord;
        }

        return lastWord;
    }

    /**
     * Checks whether {@code inputChar} is a word separator
     */
    private boolean isWordSeparator(char inputChar) {
        return (inputChar == LF || inputChar == SPACE);
    }

    /**
     * Gets last line from {@code content}
     */
    public String getLastLine() {
        String lastLine = new String("");

        for (int i = content.length() - 1; i >= 0; i--) {
            if (isLineSeparator(content.charAt(i))) {
                break;
            }
            lastLine = content.charAt(i) + lastLine;
        }

        return lastLine;
    }

    /**
     * Checks whether {@code inputChar} is a line separator
     */
    private boolean isLineSeparator(char inputChar) {
        return (inputChar == LF);
    }

    /**
     * Gets the resulting text after replacing last word of {@code content} with {@code newLastWord}
     */
    public String replaceLastWord(String newLastWord) {
        return getTextWithoutLastWord() + newLastWord;
    }

    /**
     * Gets the resulting text after removing last word from {@code content}
     */
    public String getTextWithoutLastWord() {
        int newLength = content.length() - getLastWord().length();
        return content.substring(0, newLength);
    }

    /**
     * Gets the resulting text after removing last word from {@code inputText}
     */
    public String getTextWithoutLastWord(String inputText) {
        int newLength = inputText.length() - getLastWord().length();
        return inputText.substring(0, newLength);
    }

    /**
     * Sets content in TextInputProcessor to {@code inputText}
     */
    public void setContent(String inputText) {
        content = inputText;
        text.setText(inputText);
        text.setFont(font);
    }

    /**
     * Sets font of content in TextInputProcessor to {@code font}
     */
    public void setFont(Font inputFont) {
        font = inputFont;
    }
}
```
###### /src/main/java/seedu/recipe/ui/SuggestionsPopUp.java
``` java

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
        if (isShowing()) {
            hide();
        }
    }

    /**
     * Shows suggestions for commands when users type in Command Box
     */
    protected void showSuggestions() {
        String prefix = commandTextArea.getText().substring(0, commandTextArea.getCaretPosition());
        textInputProcessor.setContent(prefix);
        textInputProcessor.setFont(commandTextArea.getFont());
        String lastWord = textInputProcessor.getLastWord();
        // finds suggestions and displays
        ArrayList<String> suggestionList = new ArrayList<>(APPLICATION_KEYWORDS);
        suggestionList.addAll(APPLICATION_COMMANDS);

        findSuggestions(lastWord, suggestionList);

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
        item.setOnAction(event -> commandBox.autoComplete(item.getText()));
        getItems().add(item);
    }
}
```
