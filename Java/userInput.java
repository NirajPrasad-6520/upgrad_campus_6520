import java.util.*;

public class userInput {
    public static void main( String[] args ) {
        int numberA;
        int numberB;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for a");

        numberA = input.nextInt();

        System.out.println("Enter the value for b");

        numberB = input.nextInt();
        System.out.println(numberA + numberB);

    // Write a Java program to take the temperature from the user in Celsius, convert it into Fahrenheit and display it to the user. You can use the following formula for this purpose: 
    //F=9C/5+32 Where, C is the temperature in Celsius and F is the temperature in Fahrenheit.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        int celsius = scanner.nextInt();
        int fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

    //The following variables have been initialized for you:
    //     int a;
    //     float f;
    //     double d;
    //     You have to cast the variable into different data types as follows:
    //     Cast a as float to a variable x.
    //     Cast f as an integer to a variable y.
    //     Cast d as float to a variable z.

       Scanner input1= new Scanner(System.in);
       System.out.println("Enter the number according to given data types");
       int a=input1.nextInt();
       float f=input1.nextFloat();
       double d=input1.nextDouble();
       float x;
       int y;
       float z;
       x=(float)a;
       y=(int)f;
       z=(float)d;
       System.out.println("x="+x+" y="+y+" z="+z);

}
}
