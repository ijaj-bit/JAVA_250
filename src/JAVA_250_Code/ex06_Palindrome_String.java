package JAVA_250_Code;

import java.util.Scanner;

//Palindrome String...
public class ex06_Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();// Read input

        String org_str=str; // Store original string

        String rev=""; // Initialize empty reversed string

        int len=str.length();// Get length of input string

        for (int i = len-1; i>=0 ; i--) {
            rev=rev+str.charAt(i);// Corrected way to append characters
        }
        System.out.println(rev);//to reverse the string

        // Check for palindrome
        if (org_str.equalsIgnoreCase(rev))
        {
            System.out.println("This is palindrome string");
        }
        else
        {
            System.out.println("This is not a palindrome string");
        }

        sc.close();//Close the scanner

    }

}


