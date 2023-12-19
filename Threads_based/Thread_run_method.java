package Threads_based;
class Thread2 extends Thread{

	@Override
	public void run() {
		System.out.println("child Thread");
		super.run();
	}
	
}


public class Thread_run_method {

	public static void main(String[] args) {
		Thread2 t = new Thread2();
		t.start();

	}

}
