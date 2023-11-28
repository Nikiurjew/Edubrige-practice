package constructor;

class Details{
	public Details() {
		
		String Name = "AMC Engineering College";
		String Branch= "CSE";
		String Address = "Bengalore";
		System.out.println(Name+" "+ " "+ " "+Branch +" "+Address);
		
	}
	public Details(String Name , int rollno) {
		
		this();
		String name = "Nikita";
		int rollno1= 126;
		System.out.println(name + " "+rollno1);
	}
}
public class College_Details {

	public static void main(String[] args) {
		Details ob = new Details("niki",12);

	}

}
