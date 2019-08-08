import java.util.Scanner;
//find out user input alphabet is vowel or consonant by if else
public class VowelConsonant {

    public static void main(String args[])
    {
        char ch;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Alphabet : ");
        ch = scanner.next().charAt(0);

        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
                ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
                ch=='u' || ch=='U')
        { System.out.print(ch + " is a Vowel"); }
        else
        { System.out.print(ch + " is a consonant "); }
    }
}
