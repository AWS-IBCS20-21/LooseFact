import java.util.*;

public class Calculator {

  public int Add(int num1, int num2){
    product1 = num1 + num2
  }
  public int Multiply(int num3, int num4){
    product2 = num3 * num4
  }
  public int ToThePowerOF(int num5, int num6TheOneOnTop){
    for (int i = 0; i<num6TheOneOnTop; i++)
    product3 = num5 * product3
  }

  public static void main(String[] args) {

    System.out.println("Pick one of the following numbers.");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. To The Power Of");

    Scanner number = new Scanner(System.in);
    int num = number.next();

    if (num.equals("1")) {
      System.out.println("Pick a number.");
      Scanner choice1 = new Scanner(System.in);
      int num1 = choice1.next();
      System.out.println("Pick another number.");
      Scanner choice2 = new Scanner(System.in);
      int num2 = choice2.next();

    }
    if (num.equals("2")) {

    }
    if (num.equals("3")) {

    }


}
