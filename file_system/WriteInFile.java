package file_system;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

	public static void main(String[] args) throws IOException {
		FileWriter ob = new FileWriter("C:\\Users\\nikij\\eclipse-workspace\\FirstCoreJavaProject\\src\\file_system\\Java1.txt");
		ob.write("Java is Robust Language.");
		System.out.println("written sucessfully");
		
		ob.close();
	}
	

}
