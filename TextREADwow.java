import java.io.*;
import java.util.*;

public class TextREADwow {



  public static void main(String[] args) {

    StringBuilder prisonerOfTheBrainL = new StringBuilder();


    try {
      File Gyudon = new File("PrisonerOfTheBrain-Mistress.txt");
      Scanner Karage = new Scanner(Gyudon);

      while (Karage.hasNextLine()) {

        prisonerOfTheBrainL.append(Karage.nextLine());
    }

    }
    catch (FileNotFoundException Natto) {

      System.out.println("File not found");
      Natto.printStackTrace();

    }

    String WO = prisonerOfTheBrainL.toString();
    String[] prisonerOfTheBrainW = WO.split(" ");

    //for (String w : prisonerOfTheBrainW) {
      //System.out.println(w);
    //}

    System.out.println("The amount of letters in this text is " + prisonerOfTheBrainL.length());//number of letters
    System.out.println("The amount of words in this text is " + prisonerOfTheBrainW.length);//numbers of words
    //Testing for current problems
    //System.out.println(prisonerOfTheBrainW[99]);
    //String a = prisonerOfTheBrainW[99];
    //System.out.println(a.length());
    //System.out.println(prisonerOfTheBrainW[99].length());

    int t = prisonerOfTheBrainL.length()/prisonerOfTheBrainW.length;
    System.out.println("The average word length is " + t);//average word length

    int a = 0;
    for(int i = 1; i < prisonerOfTheBrainW.length; i++){

      if(prisonerOfTheBrainW[i].length() > prisonerOfTheBrainW[a].length()){
        a = i;
      }
    }
    System.out.println("The longest word is " + prisonerOfTheBrainW[a]); //longest word

    //Testing
    //System.out.println(prisonerOfTheBrainW[3]);
    //System.out.println(prisonerOfTheBrainW[14]);
    //if(prisonerOfTheBrainW[3].contains(prisonerOfTheBrainW[14])){
      //System.out.println("wooo");
    //}

    int h = 0;
    int l = prisonerOfTheBrainW.length - 1;
    int[] array = new int[l];
    for(int c = 0; c < prisonerOfTheBrainW.length - 1; c++){
      for(int i = 1; i < prisonerOfTheBrainW.length; i++){
        if (prisonerOfTheBrainW[c].contains(prisonerOfTheBrainW[i])){
          array[c] ++;
        }
        if (prisonerOfTheBrainW[c].length() != prisonerOfTheBrainW[i].length()){
          array[c] --;
        }

    }
    }
    //for (int o : array) {
          //System.out.println(o);
        //}
    //System.out.println(" ");
    //Tests
    //System.out.println(array[46]);
    //System.out.println(prisonerOfTheBrainW[46]);
    int max = 0;
    int THEMAX = 0;
    for (int v = 0; v < array.length; v++){
             if (array[v] > max){
                 max = array[v];
                 THEMAX = v;
               }

            }
            System.out.println("The most common word is " + prisonerOfTheBrainW[THEMAX]); //attempted common word



  }
}
