import java.util.Scanner;

public class Pattern_usingForLoop {
    public static void main(String []args)
    {
        int rows;
        System.out.println("Enter rows:");
        Scanner sc=new Scanner(System.in);
        rows=sc.nextInt();

        //Right Triangle Star Pattern
        System.out.println("Right Triangle Star Pattern:");
         for(int i=0;i < rows; i++)
         {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
         }

        //Mirrored Right Triangle Star Pattern
        System.out.println("Mirrored Right Triangle Star Pattern:");
         for(int i=1;i <= rows; i++)
         {
             for(int j=(rows-i)*2;j>=1;j--)
                System.out.print(" ");
             for(int j=1;j<=i;j++)
                System.out.print("* ");
             System.out.println();
         }

        //Downward Right Triangle Star Pattern
        System.out.println("Downward right triangle star pattern:");
         for(int i=0;i < rows; i++)
         {
             for(int j=0;j<rows-i;j++)
                System.out.print("* ");
             System.out.println();
         }

        //Mirrored downward right triangle star pattern
        System.out.println("Mirrored downward right triangle star pattern:");
         for (int i = rows; i >= 1; i--) 
                {
                    for (int j = 1; j <= rows - i; j++)
                        System.out.print("  ");
                    for (int j = 1; j <= i; j++) 
                        System.out.print("* ");
                    System.out.println();
                }

        //Pyramid Star Pattern
        System.out.println("Pyramid Star Pattern:");
         for(int i=0;i<rows;i++)
        {
            for(int j=rows-i-1;j>=1;j--)
               System.out.print(" ");
            for(int j = 0;j<=i;j++)
               System.out.print("* ");
            System.out.println();
        }

        // Reverse Pyramid Star Pattern
        System.out.println("Reverse Pyramid Star Pattern:");
         for(int i=0;i<rows;i++)
         {
            for(int j=0;j<i;j++)
               System.out.print(" ");
            for(int j = i;j<rows;j++)
               System.out.print("* ");
            System.out.println();
         }

        //Diamond shape Star Pattern
        System.out.println("Diamond shape Star Pattern:");
         for(int i=0;i<rows;i++){
            for(int j=0;j<rows-i-1;j++)
               System.out.print(" ");
            for(int j = 0;j<=i;j++)
               System.out.print("* ");            
            System.out.println();
         }
         for(int i=0;i<rows-1;i++){
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<rows-i-1;j++)
               System.out.print("* ");
            System.out.println();
         }

        //Number Triangle Pattern
        System.out.println("Number Triangle Pattern:");
         for(int i=1;i <= rows; i++)
        {
            for(int j=1;j <= i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Reverse Number pattern
        System.out.println("Reverse number triangle pattern");
        for(int i=1;i<=rows;i++)
        {
         for(int j=1;j<=rows-i+1;j++)
         {
            System.out.print(j+" ");
         }
         System.out.println();
        }

        System.out.println("Sequence number triangle:");
        int o=5;
        int number=1;
        for(int i=1;i<=o;i++)
        {
         for(int j=1;j<=i;j++)
         {
            System.out.print(number+" ");
            number++;
         }
         System.out.println();
        }

        //Hollow Rectangle
        System.out.println("Hollow Rectangle :");
        int n=6;
        int m=20;

        for(int i=1;i<=n;i++)
        {
         for(int j=1;j<=m;j++){
            if(i == 1 || j == 1 || i == n || j == m){
               System.out.print("* ");
            }
            else
            {
               System.out.print("  ");
            }
         }
         System.out.println();
        }
        sc.close();
    }
}