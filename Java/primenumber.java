import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any individual number to check Prime or Not :");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            System.out.println("Prime number.");
        }
        else{
            System.out.println("Not Prime Number.");
        }
        System.out.println();

        int a,count1,j,m,total=0;
        Scanner scc=new Scanner(System.in);
        System.out.println("Enter n number:");
        m=scc.nextInt();
        for(a=1;a<=m;a++)
        {
            count1=0;
            for(j=1;j<=a;j++)
            {
                if(a%j == 0)
                {
                    count1++;
                }
            }
            if(count1  == 2)
                {
                    System.out.print(a+" ");
                    total=total+1;// count total Prime number between 1 to n numbers 
                }
        }
        System.out.println();
        System.out.println("Total Prime Number : "+total);
    }
    
}
