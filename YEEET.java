import java.util.*;

public class YEEET {

  public YEEET() {

  }

  int Result = 0;
  public static void main(String[] args) {
    System.out.println("How long is the list?");
    Scanner choice = new Scanner(System.in);
    int ch = choice.nextInt();
    int[] R = new int[ch];
    System.out.println(" ");


    for (int i = 0; i < R.length; i++) {
      int t = i + 1;
      System.out.println("Select number for #" + t + " of list");
      int huh = choice.nextInt();
      R[i] = huh;
    }
    int Co = 0;
    int Su = 0;
    for (int i = 0; i < R.length; i++){
       Co = Co + 1;
       Su = Su + R[i];
    }
    int Result = Su/Co;
    System.out.println(Result);
  }
}
