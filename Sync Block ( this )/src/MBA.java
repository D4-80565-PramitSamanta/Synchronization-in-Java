
public class MBA extends Thread {
	static Theater theater;

	int seats;
	@Override
	public void run() {
		theater.book(seats);
	}
	
	
	public static void main(String[] args) {
		theater = new Theater();
		
		MBA app1 = new MBA();
		app1.seats = 6;
		
		MBA app2 = new MBA();
		app2.seats = 7;
		
		app1.start();
		app2.start();
		
	}
}	
