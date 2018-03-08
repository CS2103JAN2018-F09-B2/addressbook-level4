package seedu.address.model;

import static junit.framework.TestCase.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import seedu.address.model.tag.Tag;
import seedu.address.model.tag.UniqueTagList;

public class UniqueTagListTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void asObservableList_modifyList_throwsUnsupportedOperationException() {
        UniqueTagList uniqueTagList = new UniqueTagList();
        thrown.expect(UnsupportedOperationException.class);
        uniqueTagList.asObservableList().remove(0);
    }

    @Test
    public void remove_existingTag_tagRemoved() {
        Tag testTag = new Tag("test");
        Tag extraTag = new Tag("extra");

        Set<Tag> testTagList = new HashSet<Tag>();
        testTagList.add(testTag);
        testTagList.add(extraTag);
        Set<Tag> expectedTagList = new HashSet<Tag>();
        expectedTagList.add(extraTag);

        UniqueTagList uniqueTagList = new UniqueTagList(testTagList);
        UniqueTagList expectedUniqueTagList = new UniqueTagList(expectedTagList);

        uniqueTagList.remove(testTag);
        assertEquals(expectedUniqueTagList, uniqueTagList);
    }

    @Test
    public void remove_notExistedTag_nothingChanged() {
        Tag nonExistedTag = new Tag("notexist");
        Tag existingTag = new Tag("exist");

        Set<Tag> testTagList = new HashSet<Tag>();
        testTagList.add(existingTag);
        Set<Tag> expectedTagList = new HashSet<Tag>();
        expectedTagList.add(existingTag);

        UniqueTagList uniqueTagList = new UniqueTagList(testTagList);
        UniqueTagList expectedUniqueTagList = new UniqueTagList(expectedTagList);

        uniqueTagList.remove(nonExistedTag);
        assertEquals(expectedUniqueTagList, uniqueTagList);
    }
}
