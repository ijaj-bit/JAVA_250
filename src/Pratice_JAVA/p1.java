package Pratice_JAVA;

import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {

        int num=7;
        int count=0;

        for (int i = 1; i <=7 ; i++) {
            if(num%i==0)
            {
                count++;
            }
            if(count==2)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not Prime");
            }

        }

    }

}
