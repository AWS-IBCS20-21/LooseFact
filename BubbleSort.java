import java.util.*;

public class BubbleSort {

  public BubbleSort() {

  }

  public static void main(String[] args) {
    System.out.println("How long is the list?");
    Scanner choice = new Scanner(System.in);
    int ch = choice.nextInt();
    int[] array = new int[ch];
    System.out.println(" ");

    for (int i = 0; i < array.length; i++) {
      int t = i + 1;
      System.out.println("Select number for #" + t + " of list");
      int huh = choice.nextInt();
      array[i] = huh;
    }

    System.out.println(" ");
    System.out.println("The unorganized list is:");
    for (int x : array) {
        System.out.print(x);
        System.out.println(" ");
      }
    System.out.println(" ");
    long erg = System.nanoTime();
    for (int u = 0; u < array.length - 1; u++){
      for (int a = 0; a < array.length - 1; a++){
        if (array[a] > array[a + 1]) {
          int p = array[a];
          int f = array [a + 1];
          int g = p - f;
          array[a] = p - g;
          array[a + 1] = f + g;
        }


      }
    }
    long frrrg = System.nanoTime();
    long o = frrrg - erg;
    System.out.println("The organized list is:");

    for (int f : array) {
        System.out.print(f);
        System.out.println(" ");
      }
    System.out.println(" ");
    System.out.println("The time it took to make the organized list is " + o + " nanoseconds.");

  }
}
