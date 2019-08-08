import java.util.Scanner;

//find out student result , percentage, grade

public class ResultPercentageGrade {

    public static void main (String []args) {

        String studentname;
        int rollnum;
        int maths;
        int science;
        int eng;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter Student Name:");

        studentname = scanner.next();

        System.out.println("Enter Student RollNumber:");

        rollnum = scanner.nextInt();

        System.out.println("Enter Maths mark:");

        maths = scanner.nextInt();

        System.out.println("Enter science mark:");

        science = scanner.nextInt();

        System.out.println("Enter eng mark :");

        eng = scanner.nextInt();

        float total = maths + science + eng;
        float percentage  = total/300*100;

        //output print criteria
        System.out.println("Student Roll Number: " + rollnum);
        System.out.println("Student Name: " + studentname);
        System.out.println("Total Marks: " + total + " Total Marks = maths+ science+eng");
        System.out.println("Total Percentage is: " + percentage);

        //pass and fail condition by if else
        if(percentage>=35)
            System.out.println(studentname + " is pass");
        else
            System.out.println(studentname + " is failed");


// grade condition by if else ladder

        if(percentage>=85){
            System.out.println("Grade of " + studentname +" " + " is " + "A+");}
        else if(percentage>=60 && percentage<85){
            System.out.println("Grade of " + studentname + " " + " is " + "A");}
        else if(percentage>=50 && percentage<60){
            System.out.println("Grade of " + studentname + " " + " is " + "B");}
        else if(percentage<50 && percentage>=35){
            System.out.println("Grade of " + studentname + " " + " is " + "C");}


    }



}
