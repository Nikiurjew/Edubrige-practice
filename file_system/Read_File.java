package file_system;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File {

	public static void main(String[] args) throws FileNotFoundException {
		File ob = new File("C:\\Users\\nikij\\eclipse-workspace\\FirstCoreJavaProject\\src\\file_system\\Java1.txt");
		
		Scanner sc = new Scanner(ob);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

	}

}
