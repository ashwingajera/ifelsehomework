import java.util.Scanner;
//enter any two number and  enter any symbol (+, -, /, *) find addition,
//subtraction, multiplication and division according to their symbol by using if else

public class MathematicalSymbol {

    public static void main(String args[])
    {
        int a;
        int b;
        char ch;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        a = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        b = scanner.nextInt();
        System.out.print("Enter Operator (+, -, *, /) : ");
        ch = scanner.next().charAt(0);

        if(ch == '+') {

            System.out.print("Addition of " +  a  + " and " +  b  + " = " + (a + b));
        }
        else if(ch == '-')
        {
            System.out.print("Subtraction of " +  a  + " and " +  b  + " = " + (a - b));
        }
        else if(ch == '*')
        {
            System.out.print("Multiplication of " + a + " and " + b + " = "  + (a * b));
        }
        else if(ch == '/')
        {
            System.out.print("Division of " + a + " and " + b +  " = " + (a / b) );
        }
        else
        {
            System.out.print("Wrong Mathematical Operator Entered");
        }
} }
