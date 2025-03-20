package JAVA_250_Code;
//YOUTUBE:https://www.youtube.com/watch?v=-edAgWN1mQk
public class ex17_Prime_Number {
    public static void main(String[] args) {
        int num =13;
        int count=0;
        for (int i = 1; i <=num ; i++) {
            if (num%i==0)// If 'i' is a divisor of 'num'
            {
                count++;
            }
        }
        if(count==2)// Prime numbers have exactly two divisors: 1 and itself
        {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }

    }
}
