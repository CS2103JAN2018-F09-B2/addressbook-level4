package seedu.address.storage;

import java.io.IOException;
import java.util.Optional;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.ReadOnlyRecipeBook;
import seedu.address.model.RecipeBook;

/**
 * Represents a storage for {@link RecipeBook}.
 */
public interface AddressBookStorage {

    /**
     * Returns the file path of the data file.
     */
    String getAddressBookFilePath();

    /**
     * Returns RecipeBook data as a {@link ReadOnlyRecipeBook}.
     *   Returns {@code Optional.empty()} if storage file is not found.
     * @throws DataConversionException if the data in storage is not in the expected format.
     * @throws IOException if there was any problem when reading from the storage.
     */
    Optional<ReadOnlyRecipeBook> readAddressBook() throws DataConversionException, IOException;

    /**
     * @see #getAddressBookFilePath()
     */
    Optional<ReadOnlyRecipeBook> readAddressBook(String filePath) throws DataConversionException, IOException;

    /**
     * Saves the given {@link ReadOnlyRecipeBook} to the storage.
     * @param addressBook cannot be null.
     * @throws IOException if there was any problem writing to the file.
     */
    void saveAddressBook(ReadOnlyRecipeBook addressBook) throws IOException;

    /**
     * @see #saveAddressBook(ReadOnlyRecipeBook)
     */
    void saveAddressBook(ReadOnlyRecipeBook addressBook, String filePath) throws IOException;

}
