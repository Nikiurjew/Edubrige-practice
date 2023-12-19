package Threads_based;
class MyThread4 implements Runnable{

	@Override
	public void run() {
		System.out.println("child Thread");
		
	}
	
}

public class Runable_interface_unimplements {

	public static void main(String[] args) {
		MyThread4 ob = new MyThread4();
		Thread t = new Thread(ob);
		t.start();

	}

}
