
// find out even odd number by ternary operator

import java.util.Scanner;

public class OddEvenTernary {

    public static void main (String [] args ){

//        create scanner object

        Scanner scanner = new Scanner ( System.in);

        System.out.println(" Please Enter Number1 of your Choice:");

        int number1 = scanner.nextInt();

//        ternary operator syntax =  (test result = (test condition) ? true value : false value)

        System.out.println((number1%2==0)? + number1 +  " is Even" : + number1 + " is Odd");


        System.out.println("Please Enter Number2 of your choice;");

        int number2 = scanner.nextInt();

        System.out.println((number2%2==0)? + number2 + " is Even" : + number2 + " is Odd");

//        ternary operator or conditional operator - alternative of if else statement - used in boolean condition

    }
}
