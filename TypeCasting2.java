public class TypeCasting2 {
    public static void main(String[] args) {
        float f=2.5f;//allow
        //long l=f;//error

        System.out.println(12);//integer literals is by default int
        System.out.println(12.234);//floating point literals is by default double

        //float f=2.5//or
        float e=(float)2.5;//allowed//floating point precision is 6-7 and double ka 15-16

        int a=12;
        //byte b=a;//error
        byte b=12;//allowed

        long d=123456789012L;//error ,if you want to remove error then you have to use "l" 123456789012L

        char cc='h';
        double bb=cc;       
        
        //int se byte me convert nhi kar shakte
        
        short s1=55,s2=77;
        //short s3=s1+s2;//error
        short s3=55+77;

        int d1=10+20;
        System.out.println(d1);

        long l=1245689001234560L;
        System.out.println(l);

        double n=98765532;
        System.out.println(n);

        int u=100, z=100;
        int w=u+z;
        System.out.println(w);
    }
}
