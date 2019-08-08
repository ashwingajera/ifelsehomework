import java.util.Scanner;

//find out employee gross salary, HRA, DA, TA, PF, BASIC SALARY
public class GrossSalary {

    public static void main (String [] args) {

        int employeeId;
        String name;
        float BS, HRA, TA, DA, PF, GS;

        //decimal value so float data type


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Employee ID: ");

        employeeId = scan.nextInt();

        scan.nextLine();


        System.out.println("Enter the Employee Name: ");

        name = scan.nextLine();


        System.out.println("Enter the Basic Salary : ");
        BS = scan.nextFloat();


        HRA = (float) BS * 10 / 100;

        System.out.println( "HRA is " + HRA );

        TA = (float) BS * 9 / 100;

        System.out.println("TA is " + TA);


        DA = (float) BS * 8 / 100;

        System.out.println("DA is " + DA);


        PF = (float) BS * 20 / 100;

        System.out.println("PF is " + PF);

//  gross salary formula
        GS = (BS + HRA + TA + DA - PF);


        System.out.println("Gross Salary of " + name + " is " + GS);
    }





}

