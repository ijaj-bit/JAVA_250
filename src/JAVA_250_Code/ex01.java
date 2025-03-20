package JAVA_250_Code;

import java.util.Scanner;
//You can take input from users using the Scanner class
public class ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(num*i);


        }

    }
}
