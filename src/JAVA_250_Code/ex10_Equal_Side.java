package JAVA_250_Code;

public class ex10_Equal_Side {

//    ✅ Triangle Classifier:

//    Write a program that classifies a triangle based on its side lengths. Given three input values representing
//    the lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles
//    (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify
//    the triangle.

    public static void main(String[] args) {

      int side1=10;
      int side2=20;
      int side3=10;
      if(side1==side2 && side2==side3)
      {
          System.out.println(" equilateral");
      }
      else if (side1==side2 && side2!=side3)
      {
          System.out.println("isosceles");
      }
      else
      {
          System.out.println("scalene");
      }


    }

}
