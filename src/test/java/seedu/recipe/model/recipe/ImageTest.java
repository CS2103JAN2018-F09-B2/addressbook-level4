//@@author RyanAngJY
package seedu.recipe.model.recipe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.URL;

import org.junit.Test;

import seedu.recipe.MainApp;
import seedu.recipe.testutil.Assert;

public class ImageTest {
    private static final int PATH_START_INDEX = 5;
    private static final String VALID_PATH = "/images/clock.png";

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
        assertFalse(Image.isValidImage(" ")); // spaces only

        // invalid image
        assertFalse(Image.isValidImage("estsed")); //random string

        // valid Url
        assertTrue(Image.isValidImage(Image.VALID_IMAGE_PATH));
    }
}
//@@author