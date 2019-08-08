// to find out year is leap year or not by if else statement

import java.util.Scanner;

public class LeapYear {


    public static void main (String [] args ) {

        int year;

//        create scanner object for user input

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter any year your choice");

        year = scanner.nextInt();

//        if else statement with logical  AND/OR operator

        if ((year%400==0)|| (year%4==0)&& (year%100!=0)){
            System.out.println( year + " is a Leap year"); }
        else {
            System.out.println( year + " is not a Leap Year");}



    }


}
