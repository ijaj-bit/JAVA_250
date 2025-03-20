package JAVA_250_Code;

public class ex14_Star_Pattern_L {
    public static void main(String[] args) {
        int row =4;
        for (int i = 1; i <=4 ; i++) {
            for (int j=4; j>=i;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
