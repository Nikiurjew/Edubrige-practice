package synchonazation;

class Display{
	public synchonazation void menu(String item) throws InterruptedException {
		for(int i=0;i<=10;i++) {
			Thread.sleep(1000);
			System.out.println("Place the order :"+item);
			
		}
	}
	class MyThread13 extends Thread{
		Display d;
		String item;
		public MyThread13(Display d, String item) {
			super();
			this.d = d;
			this.item = item;
		}
		@Override
		public void run() {
			try {
				d.menu(item);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			super.run();
		}
		
		
	}
}


public class Synchronization_Threads {

	public static void main(String[] args) {
		Display d=new Display();
			MyThread13 t=new MyThread13(d,"Dosa");
			t.start();
			MyThread13 t1=new MyThread13(d,"Biryani");
			t1.start();
			MyThread13 t2=new MyThread13(d,"chicken 65");
			t2.start();
			
			
		}

	}

}
