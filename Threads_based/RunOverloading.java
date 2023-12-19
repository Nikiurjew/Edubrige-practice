package Threads_based;
class Threads3 extends Thread{
	public void run() {
		System.out.println("no arg");
	}
	public void run(int a) {
		System.out.println("1 arg");
	}
	
}

public class RunOverloading {

	public static void main(String[] args) {
		Threads3 t=new Threads3();
		t.start();
		t.run();
		t.run(1);
	}

}
