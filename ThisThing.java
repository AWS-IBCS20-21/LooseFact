import java.util.*;

public class ThisThing {

  public ThisThing() {

  }

  public static void main(String[] args) {
    Scanner choice = new Scanner(System.in);
    int ch = choice.nextInt();
    int[] array = new int[ch];

    for (int i = 0; i < array.length; i++) {
      int huh = choice.nextInt();
      array[i] = huh;
    }
    for (int x : array) {
        System.out.print(x);
        System.out.print(" ");
      }
    array.length * 0.25
    
  }
}
