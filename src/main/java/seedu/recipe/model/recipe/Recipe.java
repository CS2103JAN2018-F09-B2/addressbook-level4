package seedu.recipe.model.recipe;

import static seedu.recipe.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;

import seedu.recipe.model.tag.Tag;
import seedu.recipe.model.tag.UniqueTagList;
import seedu.recipe.model.util.HtmlFormatter;

/**
 * Represents a Recipe in the recipe book.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Recipe {

    public static final String LINE_BREAK = "\n\n";
    public static final String NAME_HEADER = "Name:\n";
    public static final String INGREDIENTS_HEADER = "Ingredients:\n";
    public static final String INSTRUCTIONS_HEADER = "Instructions:\n";

    private final Name name;
    private final Ingredient ingredient;
    private final Instruction instruction;
    private final CookingTime cookingTime;
    private final PreparationTime preparationTime;
    private final Calories calories;
    private final Servings servings;
    private final Url url;
    private final Image image;
    private final UniqueTagList tags;

    /**
     * Every field must be present and not null.
     */
    public Recipe(Name name, Ingredient ingredient, Instruction instruction,
                  CookingTime cookingTime, PreparationTime preparationTime,
                  Calories calories, Servings servings, Url url, Image image, Set<Tag> tags) {
        requireAllNonNull(name, preparationTime, ingredient, instruction, url, image, tags);
        this.name = name;
        this.ingredient = ingredient;
        this.instruction = instruction;
        this.cookingTime = cookingTime;
        this.preparationTime = preparationTime;
        this.calories = calories;
        this.servings = servings;
        this.url = url;
        this.image = image;
        // protect internal tags from changes in the arg list
        this.tags = new UniqueTagList(tags);
    }

    public Name getName() {
        return name;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public Instruction getInstruction() {
        return instruction;
    }

    public CookingTime getCookingTime() {
        return cookingTime;
    }

    public PreparationTime getPreparationTime() {
        return preparationTime;
    }

    public Calories getCalories() {
        return calories;
    }

    public Servings getServings() {
        return servings;
    }

    public Url getUrl() {
        return url;
    }

    public Image getImage() {
        return image;
    }

    public boolean isNullImage() {
        return image.toString().equals(Image.NULL_IMAGE_REFERENCE);
    }

    /**
     * Returns an immutable tag set, which throws {@code UnsupportedOperationException}
     * if modification is attempted.
     */
    public Set<Tag> getTags() {
        return Collections.unmodifiableSet(tags.toSet());
    }

    //@@author RyanAngJY
    public String getTextFormattedRecipe() {
        return NAME_HEADER + getName() + LINE_BREAK
                + INGREDIENTS_HEADER + getIngredient() + LINE_BREAK
                + INSTRUCTIONS_HEADER + getInstruction() + LINE_BREAK;
    }
    //@@author

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Recipe)) {
            return false;
        }

        Recipe otherRecipe = (Recipe) other;
        return otherRecipe.getName().equals(this.getName())
                && otherRecipe.getIngredient().equals(this.getIngredient())
                && otherRecipe.getInstruction().equals(this.getInstruction())
                && otherRecipe.getCookingTime().equals(this.getCookingTime())
                && otherRecipe.getPreparationTime().equals(this.getPreparationTime())
                && otherRecipe.getCalories().equals(this.getCalories())
                && otherRecipe.getServings().equals(this.getServings())
                && otherRecipe.getUrl().equals(this.getUrl())
                && otherRecipe.getImage().equals(this.getImage())
                && otherRecipe.getTextFormattedRecipe().equals(this.getTextFormattedRecipe());
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(name, preparationTime, ingredient, instruction, url, image, tags);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getName())
                .append(" PreparationTime: ")
                .append(getPreparationTime())
                .append(" Ingredient: ")
                .append(getIngredient())
                .append(" Instruction: ")
                .append(getInstruction())
                .append(" Url: ")
                .append(getUrl())
                .append(" Image: ")
                .append(getImage())
                .append(" Tags: ");
        getTags().forEach(builder::append);
        return builder.toString();
    }

}
