
class Theater {
	int seats = 10;
	//synchronized  // uncomment it so this method is poperly syncronized and provide proper result
	void book(int s)
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
