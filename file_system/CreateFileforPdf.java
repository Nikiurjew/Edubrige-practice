package file_system;

import java.io.File;
import java.io.IOException;

public class CreateFileforPdf {

	public static void main(String[] args) throws IOException {
		File ob = new File("core java.pdf");
		if(ob.createNewFile()) {
			System.out.println("pdf created");
		}else {
			System.out.println("already exist");
		}

	}

}
