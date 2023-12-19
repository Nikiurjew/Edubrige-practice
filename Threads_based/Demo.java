package Threads_based;

class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("child Thread");
//		super.run();
		}
	}
	
}

public class Demo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		for(int i =0;i<10;i++) {
			System.out.println("parent thread");
		}

	}

}
