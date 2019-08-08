
// to find out city name by typing alphabet (a to f) and invalid entry if any other alphabet


import java.util.Scanner;

public class CityName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any alphabet from a to f ");

        char x = scanner.next().charAt(0);

//        if else ladder

        if (x == 'a') {
            System.out.println("AHMEDABAD");
        } else if (x == 'b') {
            System.out.println("BOMBAY");
        } else if (x == 'c') {
            System.out.println("CHANDIGARH");
        } else if (x == 'd') {
            System.out.println("DARJILING"); }
        else if (x == 'e') {
            System.out.println("ELURU"); }
        else if (x == 'f') {
            System.out.println("FATEHPUR"); }
        else {
            System.out.println("invalid entry"); }

    }


}







