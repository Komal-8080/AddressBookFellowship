package AddressBook.IOStreams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AddressBookFileIOService {
	
	public static String PERSON_FILE_NAME = "addressBook-file.txt";

	public void writeData(List<AddressBookData> addressBookList) {
		StringBuffer abBuffer = new StringBuffer();
		addressBookList.forEach(person -> {
			String personDataString = person.toString().concat("\n");
			abBuffer.append(personDataString);
		});
		try {
			Files.write(Paths.get(PERSON_FILE_NAME), abBuffer.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public long countEntries() {
		long entries = 0;
		try {
			entries = Files.lines(new File(PERSON_FILE_NAME).toPath()).count();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(entries);
		return entries;
	}
}
