import java.util.Scanner;

//find out enter number positive negative or zero
public class PostiveNegativeZero {

    public static void main (String [] args){

        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number of your choice: ");
        num = scanner.nextInt();


        //check condition for positive, negative and Zero by using if  else if else statement

        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println("IT's ZERO.");




    }
}
