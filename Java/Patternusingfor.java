import java.util.Scanner;

public class Patternusingfor {
    public static void main(String []args){
        int rows;
        System.out.println("Enter rows:");
        Scanner sc=new Scanner(System.in);
        rows=sc.nextInt();
        for(int i=0;i < rows; i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
