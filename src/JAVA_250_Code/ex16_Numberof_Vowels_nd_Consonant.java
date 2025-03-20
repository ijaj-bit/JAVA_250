package JAVA_250_Code;

import java.util.Scanner;

public class ex16_Numberof_Vowels_nd_Consonant {

    public static void main(String[] args) {

        int vol=0;
        int con=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String str = sc.nextLine();

        str=str.toUpperCase();
        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                if(ch=='A'||ch=='E'||ch=='I'||ch=='U'||ch=='O')
                {
                    vol++;
                }
                else
                {
                    con++;
                }
            }
        }
        System.out.println("Number of Vol:"+vol+"\nNumber of cons:"+con);
    }
}
