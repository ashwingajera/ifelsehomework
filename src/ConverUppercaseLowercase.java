import java.util.Scanner;
// convert any alphabet uppercase to lowercase

public class ConverUppercaseLowercase {

    public static void main(String[] input)
    {
        char ch;
        int temp;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a alphabet in Uppercase : ");

        ch = scan.next().charAt(0);

        temp = (int) ch;
        temp = temp + 32;
        ch = (char) temp;

        System.out.print("Equivalent alphabet in Lowercase = " + ch);
    }
}
