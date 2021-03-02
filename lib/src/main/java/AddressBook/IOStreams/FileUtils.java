package AddressBook.IOStreams;

//AddressBook With File-IOStreams
import java.io.File;

public class FileUtils {
	
	//Delete Method
	public static boolean deleteFiles(File contentsToDelete) {
		File[] allContents = contentsToDelete.listFiles();
		if (allContents != null) {
			for (File file : allContents)
				deleteFiles(file);
		}
		return contentsToDelete.delete();
	}
}
