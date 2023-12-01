package file_system;

import java.io.File;
import java.io.IOException;

public class GetinformationPdf {

	public static void main(String[] args) throws IOException {
		File ob = new File("core java.pdf");
		if(ob.exists()) {
			System.out.println("Path:"+ ob.getAbsolutePath());
			System.out.println("Nameof the File:"+ob.getName());
			System.out.println("can we write:"+ob.canWrite());
			System.out.println("can we read:"+ ob.canRead());
			//System.out.println("can we delete:"+ob.delete());
			ob.delete();
		}
		else {
			System.out.println("file doesn't exist");
		}
		

	}

}
