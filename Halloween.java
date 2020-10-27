import java.util.*;

public class Halloween {

  public Halloween() {

  }

  public static void main(String[] args) {

    Random R = new Random();

    float[] SA;
    SA = new float[5];
    for (int i = 0; i < SA.length; i++) {
      SA[i] = R.nextFloat() * 10;
    }
    float[] SB;
    SB = new float[5];
    for (int i = 0; i < SB.length; i++) {
      SB[i] = R.nextFloat() * 10;
    }
    float[] SC;
    SC = new float[5];
    for (int i = 0; i < SC.length; i++) {
      SC[i] = R.nextFloat() * 10;
    }
    float[] SD;
    SD = new float[5];
    for (int i = 0; i < SD.length; i++) {
      SD[i] = R.nextFloat() * 10;
    }
    float[] SE;
    SE = new float[5];
    for (int i = 0; i < SE.length; i++) {
      SE[i] = R.nextFloat() * 10;
    }
    float[][] All = {{SA[0],SA[1],SA[2],SA[3],SA[4]},{SB[0],SB[1],SB[2],SB[3],SB[4]},{SC[0],SC[1],SC[2],SC[3],SC[4]},{SD[0],SD[1],SD[2],SD[3],SD[4]},{SE[0],SE[1],SE[2],SE[3],SE[4]}};

    int Street = 0;
    int House = 0;
    float CandyRate1 = All[0][0];
    for (int a = 0; a < All.length; a++) {
      for (int b = 0; b < All[a].length; b++) {
        if (All[a][b] > CandyRate1) {
          CandyRate1 = All[a][b];
          Street = a+1;
          House = b+1;
        }
      }
    }

    float CandyRate2 = All[0][0];
    for (int a = 0; a < All.length; a++) {
      for (int b = 0; b < All[a].length; b++) {
        if (All[a][b] > CandyRate2 && All[a][b] != CandyRate1) {
          CandyRate2 = All[a][b];
          Street = a+1;
          House = b+1;
        }
      }
    }

    float CandyRate3 = All[0][0];
    for (int a = 0; a < All.length; a++) {
      for (int b = 0; b < All[a].length; b++) {
        if (All[a][b] > CandyRate3 && All[a][b] != CandyRate1 && All[a][b] != CandyRate2) {
          CandyRate3 = All[a][b];
          Street = a+1;
          House = b+1;
        }
      }
    }

    float CandyRate4 = All[0][0];
    for (int a = 0; a < All.length; a++) {
      for (int b = 0; b < All[a].length; b++) {
        if (All[a][b] > CandyRate4 && All[a][b] != CandyRate1 && All[a][b] != CandyRate2 && All[a][b] != CandyRate3) {
          CandyRate4 = All[a][b];
          Street = a+1;
          House = b+1;
        }
      }
    }

    float CandyRate5 = All[0][0];
    for (int a = 0; a < All.length; a++) {
      for (int b = 0; b < All[a].length; b++) {
        if (All[a][b] > CandyRate5 && All[a][b] != CandyRate1 && All[a][b] != CandyRate2 && All[a][b] != CandyRate3 && All[a][b] != CandyRate4) {
          CandyRate5 = All[a][b];
          Street = a+1;
          House = b+1;
        }
      }
    }


    System.out.println("Welcome to RATE THE HOUSES");
    System.out.println("1: All ratings for the houses in your area");
    System.out.println("2: The best house to visit");
    System.out.println("3: The second best house to visit");
    System.out.println("4: The third best house to visit ");
    System.out.println("5: The fourth best house to visit");
    System.out.println("6: The fifth best house to visit");

    Scanner choice = new Scanner(System.in);
    String ch = choice.next();

    if (ch.equals("1")) {
      for (float[] col : All) {
        for (float x : col) {
          System.out.println(x);
        }
      }
    }

    if (ch.equals("2")) {

      System.out.println("House " + House + " on street " + Street + " is rated #1");
    }

    if (ch.equals("3")) {

      System.out.println("House " + House + " on street " + Street + " is rated #2");
    }

    if (ch.equals("4")) {

      System.out.println("House " + House + " on street " + Street + " is rated #3");
    }

    if (ch.equals("5")) {

      System.out.println("House " + House + " on street " + Street + " is rated #4");
    }

    if (ch.equals("6")) {

      System.out.println("House " + House + " on street " + Street + " is rated #5");
        }
      }
    }
