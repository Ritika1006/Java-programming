public class car
{
 	String color;
	car(String c)
	{
		color=c;
		System.out.println("car color set using constructor");
	}
	void displaycolor()
	{
        System.out.println("car color set +ve  car's is:"+color);
    	}
    	public static void main(String [] args)
    	{
         car mycar=new car("Blue");
         mycar.displaycolor();
    }
}

