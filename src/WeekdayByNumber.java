import java.util.Scanner;
//to find out weekday by number 1-7 input if else ladder
public class WeekdayByNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number from 1 to 7 ");

        char x = scanner.next().charAt(0);

//        if else ladder

        if (x == '1') {
            System.out.println("MONDAY");
        } else if (x == '2') {
            System.out.println("TUESDAY");
        } else if (x == '3') {
            System.out.println("WEDNESDAY");
        } else if (x == '4') {
            System.out.println("THURSDAY");}
        else if (x == '5') {
            System.out.println("FRIDAY");}
        else if (x == '6') {
            System.out.println("SATURDAY");} else if (x == '7') {
            System.out.println("SUNDAY");}
        else {
            System.out.println("invalid entry"); }

    }
}
