import java.util.*;
public class reversenumber {
    public static void main(String[] args) {
        int n,r,rev=0;
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse number : "+rev);
        sc.close();
    }
}
