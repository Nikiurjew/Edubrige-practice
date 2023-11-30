package Opps.concept;

class College{
	public void college() {
		System.out.println("Amc engineering college "+ " CSE"+" Bengalore");
	}
}
class Student extends College{
	public void student() {
		System.out.println("Nikita "+ 126 + " Bihar");
		
	}
	
}
public class SIngle_Inheretance {

	public static void main(String[] args) {
		Student ob= new Student();
		ob.college();
		ob.student();

	}

}







