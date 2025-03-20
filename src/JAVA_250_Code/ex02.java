package JAVA_250_Code;

import java.util.Scanner;
//Print  lines of output; each line  (where ) contains the  of  in the form:
//N x i = result.

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.next();

        System.out.println("Enter your Age:");
        int age= sc.nextInt();

        System.out.println("Hello "+name+" Your "+age+" year old");

        sc.close();
    }
}
