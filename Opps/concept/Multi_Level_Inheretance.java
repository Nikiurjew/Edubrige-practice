package Opps.concept;

class GrandParent{
	public void grandparent() {
		System.out.println("grandparent properties");
	}
}
class P extends GrandParent{
	public void parents() {
		System.out.println("parent properties");
	}
}
class C extends P{
	public void child() {
		System.out.println("Child properties");
	}
}

public class Multi_Level_Inheretance {

	public static void main(String[] args) {
		C ob=new C();
		ob.child();ob.grandparent();ob.parents();

	}

}
