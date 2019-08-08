import java.util.Scanner;
//two number interchange value by using temp variable
public class InterChangeValue {

    public static void main (String [] args ){

        int a;
        int b;
        int temp;
        Scanner scanner = new Scanner (System.in );
        System.out.println("Enter value of A AND B:");

        System.out.print("A =  ");
        a = scanner.nextInt();



        System.out.print( "B =  ");
        b = scanner.nextInt();
        temp = a;
        a = b;
        b = temp;

        System.out.println ("Value of A and B Interchanged Successfully.");

        System.out.println("A = " +a);
        System.out.print("B = " +b);



    }
}
