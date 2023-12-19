package synchonazation;
class Display1{
	public synchronized void menu(String item) throws InterruptedException {
		for(int i=0;i<=10;i++)
		{
			//Thread.sleep(1000);
			Thread.yield();
			System.out.println("Place your order : "+item);
		}
	}
}

class Mythread1 extends Thread{
	Display1 d;
	String item;
	
	public Mythread1(Display1 d, String item) {
		super();
		this.d = d;
		this.item = item;
	}

	public void run() {
		try {
			d.menu(item);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class Synchonazation_1 {

	public static void main(String[] args) throws InterruptedException {
		Display1 d=new Display1();
		Mythread1 t1=new Mythread1(d,"Dosa");
		t1.start();
		Mythread1 t2=new Mythread1(d,"Briyani");
		t2.start();
		t2.join();
		Mythread1 t3=new Mythread1(d,"Chicken 65");
		t3.start();
		System.out.println("main thread");


	}

}
