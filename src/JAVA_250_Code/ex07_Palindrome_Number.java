package JAVA_250_Code;

import java.util.Scanner;
//Palindrome Number
public class ex07_Palindrome_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        int org_num=num;
        int rev=0;
        while (num!=0)
        {
            rev=rev*10+num%10;//→ Shifts rev left (by multiplying by 10) and adds the extracted last
            num=num/10;//Removes the last digit from num.
            //Loop continues until num becomes 0.
        }
        if (org_num==rev)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not a Palindrome");
        }

    }
}
