import java.util.*;

public class BinarySort {

  public BinarySort() {

  }

  public static void main(String[] args) {
    System.out.println("How long is the list?");
    Scanner choice = new Scanner(System.in);
    int ch = choice.nextInt();
    int[] array = new int[ch];
    System.out.println(" ");
    Random R = new Random();
    for (int i = 0; i < array.length; i++) {
      int t = i + 1;
      int huh = R.nextInt();
      array[i] = huh;
    }

    System.out.println(" ");
    System.out.println("The unorganized list is:");
    for (int x : array) {
        System.out.print(x);
        System.out.println(" ");
      }
    System.out.println(" ");
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
    System.out.println("The organized list is:");

    for (int f : array) {
        System.out.print(f);
        System.out.println(" ");
      }
    System.out.println(" ");
    int yee = choice.nextInt();
    int gee =  huh/2
    for (int t = 0; t < array.length; t++){
      if ( < yee){
        for (int t = gee + 1; t < array.length; t++){
          if ()
        }
      }
      if ( > yee){
        for (int t = gee - 1; t > 0; t--){

        }

      }
      if ( = yee){
        System.out.println();
      }
      //???????wut


    }


  }
}
