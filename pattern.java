public class pattern
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=5;j<i;j+=1)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println();
    }
}