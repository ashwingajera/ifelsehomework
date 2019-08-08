import java.util.Scanner;

//find out entered value is symbol/alphabet/number by if else statement

public class AlphabetNumberSymbol {
    public static void main(String args[])
    {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a any value : ");
        ch = scanner.next().charAt(0);
//        if else condition
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        { System.out.print(ch + " is an Alphabet"); }

        else if  ((ch>='0') || (ch<=9) )
        { System.out.println(ch+ " is a Number");}
        else { System.out.print(ch+ " is a symbol" ); }
    }
}
