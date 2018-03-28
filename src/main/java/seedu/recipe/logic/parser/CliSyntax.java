package seedu.recipe.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_INGREDIENT = new Prefix("e/");
    public static final Prefix PREFIX_INSTRUCTION = new Prefix("a/");
    public static final Prefix PREFIX_COOKING_TIME = new Prefix("c/");
    public static final Prefix PREFIX_PREPARATION_TIME = new Prefix("p/");
    public static final Prefix PREFIX_CALORIES = new Prefix("cl/");
    public static final Prefix PREFIX_SERVINGS = new Prefix("s/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");
    public static final Prefix PREFIX_URL = new Prefix("url/");
    public static final Prefix PREFIX_IMG = new Prefix("img/");

}
