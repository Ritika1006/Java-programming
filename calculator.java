public class calculator
{
	int a;
	int b;
	double res;
	calculator(int x,int y, double n)
	{
		x=a;
		y=b;
		res=n;
		
		System.out.println("Add the values:");
	}
	void display()
	{
		System.out.println( "Add the values:" +a +b);
		System.out.println( "the sum:"+res);
	}
public static void main(String [] args)
{
	calculator sc=new calculator(10,20,10);
	calculator.display(res);
}
}
