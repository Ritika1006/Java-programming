public class std
{
	String name;
	int age;
	std(String n, int a)
	{
		name=n;
		age=a;
		
		System.out.println("student details:");
	}
	void display()
	{
		System.out.println( "the student details:" +name);
		System.out.println( "the student details:"+age);
	}
public static void main(String [] args)
{
	std st=new std("Ritika",22);
	st.display();
}
}