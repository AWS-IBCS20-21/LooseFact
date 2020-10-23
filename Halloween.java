import java.util.*;

public class Halloween {

  public Halloween() {

  }

  public static void main(String[] args) {

    Random R = new Random();

    int[] SA = new int[4]
    for (int i = 0; i =< SA.length; i++) {
      SA[i] = R.nextFloat();
    }
    int[] SB = new int[4]
    for (int i = 0; i =< SB.length; i++) {
      SB[i] = R.nextFloat();
    }
    int[] SC = new int[4]
    for (int i = 0; i =< SC.length; i++) {
      SC[i] = R.nextFloat();
    }
    int[] SD = new int[4]
    for (int i = 0; i =< SD.length; i++) {
      SD[i] = R.nextFloat();
    }
    int[] SE = new int[4]
    for (int i = 0; i =< SE.length; i++) {
      SE[i] = R.nextFloat();
    }

    int[][] All = {SA,SB,SC,SD,SE};
    for (int[] col : All) {
      System.out.println("");
      for (int x : col) {
        System.out.print(x);
        System.out.print(" ");
      }
    }
  }

}
