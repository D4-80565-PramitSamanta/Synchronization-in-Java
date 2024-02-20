
class Theater {
	int seats = 10;
	void book(int s)
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());

		synchronized (this) {
			if(seats>=s)
			{
				System.out.println("seats booked ...");
				seats-=s;
				System.out.println("seats left = " + seats);
			}
			else
			{
				System.out.println("can not book. not enough seats");
			}
		}
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
	}
}
