import java.util.*;
class Calculator {
  public Calculator() {

  }

  public double Addition(double num1, double num2) {
    double result1 = num1 + num2;
    return result1;
  }
  public double Multiplication(double num3, double num4) {
    double result2 = num3 * num4;
    return result2;
  }

  public double ExponentThing(double num5, double num6TheOneOnTop) {
    double result3 = 1;
    for (int i = 0; i < num6TheOneOnTop; i++) {
      result3 = num5*result3;
    }
    return result3;
  }

public static void main(String[] args) {
  Calculator C = new Calculator();

    System.out.println("Pick one of the following numbers.");
    System.out.println("1. Addition");
    System.out.println("2. Multiplication");
    System.out.println("3. To The Power Of");

    Scanner number = new Scanner(System.in);
    String num = number.next();

    if (num.equals("1")) {
      System.out.println("Pick a number.");
      Scanner userInput = new Scanner(System.in);
      double num1 = userInput.nextDouble();
      System.out.println("Pick another number.");
      double num2 = userInput.nextDouble();
      System.out.println("The result of " + num1 + " added to " + num2 + " is ");
      System.out.println(C.Addition(num1, num2));
      System.out.println("Wow.");

    }
    if (num.equals("2")) {
      System.out.println("Pick a number.");
      Scanner userInput = new Scanner(System.in);
      double num3 = userInput.nextDouble();
      System.out.println("Pick another number.");
      double num4 = userInput.nextDouble();
      System.out.println("The result of " + num3 + " multiplied to " + num4 + " is ");
      System.out.println(C.Multiplication(num3, num4));
      System.out.println("Wow.");

    }
    if (num.equals("3")) {
      System.out.println("Pick a base.");
      Scanner userInput = new Scanner(System.in);
      double num5 = userInput.nextDouble();
      System.out.println("Pick a exponent.");
      double num6TheOneOnTop = userInput.nextDouble();
      System.out.println("The result of " + num5 + " to the power of " + num6TheOneOnTop + " is ");
      System.out.println(C.ExponentThing(num5, num6TheOneOnTop));
      System.out.println("Wow.");


    }
}
}
