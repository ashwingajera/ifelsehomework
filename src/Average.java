import java.util.Scanner;

//find out average of five user input number

public class Average {

    public static void main (String [] args) {

        Scanner scanner = new Scanner (System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        System.out.println("input number1 ");

        number1 = scanner.nextInt();

        System.out.println("input number2 ");

        number2 = scanner.nextInt();
        System.out.println("input number3 ");

        number3 = scanner.nextInt();
        System.out.println("input number4 ");

        number4 = scanner.nextInt();

        System.out.println("input number5 ");

        number5 = scanner.nextInt();


        System.out.println( "Average of " + number1 + "," + number2 + "," + number3 + "," + number4 + "," + number5 + " is :" + (number1+number2+number3+number4+number5) /5 );










    }
}
