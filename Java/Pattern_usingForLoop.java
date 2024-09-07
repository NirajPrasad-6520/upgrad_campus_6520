import java.util.Scanner;

public class Pattern_usingForLoop {
    public static void main(String []args)
    {
        //Right Triangle Star Pattern
        int rows;
        System.out.println("Right Triangle Star Pattern");
        System.out.println("Enter rows:");
        Scanner sc=new Scanner(System.in);
        rows=sc.nextInt();
        for(int i=0;i < rows; i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

         //Mirrored Right Triangle Star Pattern
         int rows1;
         System.out.println("Mirrored Right Triangle Star Pattern");
         System.out.println("Enter rows number:");
         rows1=sc.nextInt();
         for(int i=1;i <= rows1; i++)
         {
             for(int j=(rows1-i)*2;j>=1;j--)
             System.out.print(" ");
             for(int j=1;j<=i;j++)
             System.out.print("* ");
             System.out.println();
         }

        //Pyramid Star Pattern
        System.out.println("Pyramid Star Pattern");
        int row;
        System.out.println("Enter rows number :");
        row=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=row-i-1;j>=1;j--)
            System.out.print(" ");
            for(int j = 0;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }

         // Reverse Pyramid Star Pattern
         System.out.println("Reverse Pyramid Star Pattern");
         int row1;
         System.out.println("Enter rows number :");
         row1=sc.nextInt();
         for(int i=0;i<row1;i++){
            for(int j=0;j<i;j++)
            System.out.print(" ");
            for(int j = i;j<row1;j++)
            System.out.print("* ");
            System.out.println();
         }
    }
    
}
