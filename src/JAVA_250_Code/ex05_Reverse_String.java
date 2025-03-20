package JAVA_250_Code;
//Reverse The String

import java.util.Scanner;

public class ex05_Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

       // String org_str = str;

        String rev = "";

        int len = str.length();

        for (int i =len-1; i>=0 ; i--) {
            rev =rev+str.charAt(i);

        }
        System.out.println(rev);

    }
}
