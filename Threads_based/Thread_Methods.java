package Threads_based;

class MyThread9 implements Runnable{

	@Override
	public void run() {
		
		for(int i = 0;i<10;i++) {
			try {
			System.out.println("child thread");
		}catch(Exception e ) {
			System.out.println(e);
		}
		
		}
	}
	
}

public class Thread_Methods {

	public static void main(String[] args) throws Exception {
		MyThread9 ob=new MyThread9();
		Thread t= new Thread(ob);
		t.start();
		System.out.println("Thread name "+t.getName());
		System.out.println("Thread name after updating");
		System.out.println("thread priority "+t.getPriority());
		System.out.println("get Id "+t.getId( ));
		t.setPriority(7);
		System.out.println("set priority "+t.getPriority());
		t.sleep(1000);
		t.start();
		
		

	}

}
