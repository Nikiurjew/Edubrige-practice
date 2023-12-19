package Threads_based;
class MyThread5 implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println("child thread");
		}
		
	}
	
}

public class Runable_for_Loop {

	public static void main(String[] args) {
		MyThread5 ob=new MyThread5();
		Thread t= new Thread(ob);
		t.start();
		for(int i =0;i<10;i++) {
			System.out.println("parent thread");
		}

	}

}
