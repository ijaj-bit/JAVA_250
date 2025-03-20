package JAVA_250_Code;

import java.util.Scanner;

public class ex09_Leap_Year {
//LEAP YEAR
    //Create a program that determines whether a given year is a leap year.A leap year is divisible by 4,but not
//by 100 unless it is also divisible by 400. Use an if-else statement to
//make this determination .

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int year=sc.nextInt();

        if((year%4==0&& year%100!=0)||(year%400==0))
        {
            System.out.println(year+" Leap year");
        }
        else
        {
            System.out.println(year+" Not a leap year");
        }
    }

}
