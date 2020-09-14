import java.util.*;

public class CoffeeShop {
  public static void main(String[] args) {
    System.out.println("");
    System.out.println("Welcome to Thou Art Mcdonuts.");
    System.out.println("");
    System.out.println("Canst thou know thee order?");
    System.out.println("");

    Scanner userorder = new Scanner(System.in);
    String order = userorder.next();

    System.out.println("");
    System.out.println("Processing thy " + order + ".");
    System.out.println("");
    System.out.println("Thyself wants to know thee name.");
    System.out.println("");

    Scanner userIn = new Scanner(System.in);
    String name = userIn.next();

    System.out.println("");
    System.out.println("Thee name art " + name + "?");
    System.out.println("Ay, tis a great name.");
    System.out.println("Thine name is Arthur.");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("Thou hast " + order + " for " + name + ".");
    System.out.println("");




  }
}
