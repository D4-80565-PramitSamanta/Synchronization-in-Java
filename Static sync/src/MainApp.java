
class MyThread1 extends Thread {
	Theater theater;
	int seats;
	public MyThread1(Theater th, int sts){
		theater = th;
		seats = sts;
	}
	@Override
	public void run() {
		theater.book(seats);
	}
}	


class MyThread2 extends Thread {
	Theater theater;
	int seats;
	public MyThread2(Theater th, int sts){
		theater = th;
		seats = sts;
	}
	@Override
	public void run() {
		theater.book(seats);
	}
}	

public class MainApp {
	public static void main(String[] args) {
		Theater theater1 = new Theater();
		MyThread1 thread1_0 = new MyThread1(theater1, 10);
		MyThread2 thread2_0 = new MyThread2(theater1, 10);
		
		thread1_0.start();
		thread2_0.start();
		
		
		Theater theater2 = new Theater();
		MyThread1 thread1_1 = new MyThread1(theater2, 5);
		MyThread2 thread2_1 = new MyThread2(theater2, 9);
		
		thread1_1.start();
		thread2_1.start();
		
		
		// two threads working on an objet 
		// another two threds working on another object 
		// multiple objects will have problem with synchronization
		// use static resource and static synchronized
	}
}
