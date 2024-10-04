import java.util.*;
public class reversenumber {
    public static void main(String[] args) {
    //Using While loop
        int n,r,rev=0;
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;//last digit
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse number : "+rev);

        System.out.println();

    //Using for loop
        int revs=0;
        System.out.println("Enter number: ");
        n=sc.nextInt();
        for(;n!=0;n=n/10)
        {
            r=n%10;//last digit
            revs=revs*10+r;
        }
        System.out.println("Reverse number: "+revs);
        sc.close();
    }
}
