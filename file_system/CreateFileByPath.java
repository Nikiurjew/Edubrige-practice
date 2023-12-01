package file_system;

import java.io.File;
import java.io.IOException;

public class CreateFileByPath {

	public static void main(String[] args) throws IOException {
		File ob = new File("C:\\Users\\nikij\\eclipse-workspace\\FirstCoreJavaProject\\src\\file_system\\Java1.txt");
		if(ob.createNewFile()) {
			System.out.println("FIle Sucessfully created");
//			
		}
		else {
			System.out.println("file already exist");
		}
		if(ob.exists()) {
			System.out.println("Path:"+ ob.getAbsolutePath());
			System.out.println("Nameof the File:"+ob.getName());
			System.out.println("can we write:"+ob.canWrite());
			System.out.println("can we read:"+ ob.canRead());
			System.out.println("can we delete:"+ob.delete());
		}else {
			System.out.println("file doesn't exist");
		}

	}

}
