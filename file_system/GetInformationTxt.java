package file_system;

import java.io.File;

public class GetInformationTxt {

	public static void main(String[] args) {
		File ob = new File("java.txt");
		if(ob.exists()) {
			System.out.println("Path"+ ob.getAbsolutePath());
			System.out.println("Nameof the File"+ob.getName());
			System.out.println("can we write"+ob.canWrite());
			System.out.println("can we read"+ ob.canRead());
		}
		else {
			System.out.println("file doesn't exist");
		}

	}

}
