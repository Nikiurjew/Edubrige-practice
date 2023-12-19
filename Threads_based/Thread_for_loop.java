package Threads_based;
class Thread8 extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("child Thread");
		}
	}
	
}

public class Thread_for_loop {

	public static void main(String[] args) {
		Thread8 t = new Thread8();
		t.start();
		

	}

}
