package JAVA_250_Code;

public class ex13_Star_Pattern_R {
    public static void main(String[] args) {
       int row=4;
        for (int i = 1; i <=4 ; i++) {//works for row
            for (int j = 1; j <=i ; j++) {//works for column

                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
