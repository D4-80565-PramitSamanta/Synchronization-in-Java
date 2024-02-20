
class Theater {
	static int seats = 20;
	static synchronized void book(int s)
	{
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
}
