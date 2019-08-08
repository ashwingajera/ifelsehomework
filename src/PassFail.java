import java.util.Scanner;
//find out student pass or fail depend on each sub marks
public class PassFail {

    public static void main (String [] args){

        String name;
        int rollnumber;
        float chemistry , science, english;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");

        name = sc.next();


        System.out.println("Enter Roll Number: ");
        rollnumber = sc.nextInt();


        System.out.println("Enter Marks of Chemistry: ");
        chemistry = sc.nextFloat();


        System.out.println("Enter Marks of Science: ");
        science = sc.nextFloat();


        System.out.println("Enter Marks of English: ");
        english = sc.nextFloat();


        //Calculate total and percentage
        double total = chemistry + science + english;

        double Percentage =  total / 300 * 100;

        System.out.println("Student Roll Number: " + rollnumber);
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total );
        System.out.println("Total Percentage is: " + Percentage);


//Condition to check pass or failed in each subject
        if (chemistry< 35){


            System.out.println(name + " is Failed");}
        else if (science<35){


            System.out.println(name + " is Failed");}


        else if(english<35){


            System.out.println(name + " is Failed");}


        else {


            System.out.println(name + " is Pass");}






    }

}
