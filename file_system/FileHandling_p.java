package file_system;

import java.io.File;
import java.io.IOException;

public class FileHandling_p {

	public static void main(String[] args) throws IOException {
		File ob=new File("Java.txt");
		if(ob.createNewFile()) {
			System.out.println("File Sucessfully created");
		}else {
			System.out.println("File already exist");
		}

	}

}
