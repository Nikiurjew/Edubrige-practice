package Opps.concept;
//declaration
class StudentDetails {
	private String usn;
	private String name;
	private float percentage;

//constructor
public StudentDetails(String usn,String name,float percentage) {
	super();
	this.usn = usn;
	this.name = name;
	this.percentage=percentage;
}
//Get method 
public String getusn() {
	return usn;
}
public String name() {
	return name;
}
public float percentage() {
	return percentage;
}

// set method
public void setusn(String usn) {
	this.usn = usn;
}
public void setname(String name) {
	this.name = name;
}
public void setpercentage(float percentage) {
	this.percentage=percentage;
}

}
public class Encapsulation_BankApplication {

	public static void main(String[] args) {
		StudentDetails ob = new StudentDetails("1AM19CS126","Nikita Jha",80);
		System.out.println("My usn is "+ob.getusn());
		System.out.println("My usn is "+ob.name());
		System.out.println("My usn is "+ob.percentage());
	}

}
