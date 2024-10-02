import java.util.*;
public class palindromenumber {
    public static void main(String[]args){
        int n,c,r,s=0;
        System.out.println("Enter any number :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
        System.out.println("Palindrome Number");
        else
        System.out.println("Not Palindrome Number");
    }
}
