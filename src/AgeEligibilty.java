import java.util.Scanner;
//age eligibilty by his/her age for voting by if else statement
public class AgeEligibilty {

    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year you want to check : ");
        age = sc.nextInt();

        //check eligibility for voting

        if (age>=18)

             { System.out.println("person is eligible for voting"); }

        else
            { System.out.println("person is not eligible for voting"); }

    }
}
