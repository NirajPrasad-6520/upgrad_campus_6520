import java.util.*;
public class casting {

   public static void main(String[] args) {

       Scanner input= new Scanner(System.in);
       System.out.println("Enter the number according to data types");
       int a=input.nextInt();
       float f=input.nextFloat();
       double d=input.nextDouble();
       float x=(float)a;
       int y=(int)f;
       float z=(float)d;;   
       System.out.println("x="+x+" y="+y+" z="+z);
   }
}
