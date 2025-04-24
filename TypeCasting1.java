public class TypeCasting1 {
    public static void main(String[] args) {
        char c='i';
        int n=c;
        System.out.println(n);
        
        int n2=105;
        char c2=(char)n2;
        System.out.println(c2);

        int r=8-9*2/5+6;
        int j=4;
        System.out.println(r);

        //System.out.println("i%j="+(i%(-j)));

        int a=10,b=20;
        int k=a*b/2+8*a;
        System.out.println(k);

        int l=10,m=20;
        int z=l^m;
        System.out.println(z);

        int p=4+2*5/10;
        System.out.println(p);

        int d=10;
        int x=d+++3;
        System.out.println(x);

        int f=10;
        int g=f*7-6/2+f++;
        System.out.println(g);
        
        int h=10;
        int i=4+--h+h++;
        System.out.println(i);

        int o=10,s=20;
        int q=o++-s++*o;
        System.out.println(q);

        int t=10,u=20;
       // boolean v=t*u++<t++/u--; false
        boolean v=t++<--u && t!=u++;  //true
        //int v=++t<u?t--+u:u++/t++;
        System.out.println(v);


    }
}
