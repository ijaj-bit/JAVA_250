package JAVA_250_Code;

import java.util.Scanner;

//Palindrom String
public class ex04_Palindrome_String {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Word");
        String word = sc.next();

        String reversed = new StringBuilder(word).reverse().toString();

        if(word.equalsIgnoreCase(reversed))
        {
            System.out.println("It is palindrom");
        }
        else
        {
            System.out.println("Not a palindrom");
        }

        sc.close();
    }
}
