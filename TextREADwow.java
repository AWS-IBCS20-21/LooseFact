import java.io.*;
import java.util.*;

public class TextREADwow {


  public static void main(String[] args) {

    try {
      File Gyudon = new File("PrisonerOfTheBrain-Mistress.txt");
      Scanner Karage = new Scanner(Gyudon);

      while (Karage.hasNextLine()) {

        System.out.println(Karage.nextLine());
      }

    } catch (FileNotFoundException Natto) {

      System.out.println("File not found");
      Natto.printStackTrace();

    }
  }
}
