import java.util.*;
public class fibonacci {
    public static void main(String []args)
    {
        //nth number of fibonacci example:if n=50 so between 0 to 50 fibonacci print,n=500 so between 0 to 500 fibonacci print.
        int c=0,a=0,b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int  n=sc.nextInt();
        System.out.print(a+" "+b+" ");
        while(c<=n)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
        System.out.println();

        //Sequence fibonacci series
        //example if m=7 so only 1 to 7 index of fibonacci print 
        System.out.println("Sequence fibonacci series");
        int r=0,q=0,s=1;
        Scanner scc=new Scanner(System.in);
        System.out.println("Enter number");
        int m=scc.nextInt();
        for(int i=1;i<=m;i++){
            System.out.print(q+" ");
            r=q+s;
            q=s;
            s=r;
        }

    }
}
