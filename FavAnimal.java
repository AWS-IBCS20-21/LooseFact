import java.util.*;

public class FavAnimal {
  String name;
  String habitat;
  int sizeInches;
  String similarAnimals;
  String speciality;

  public FavAnimal(){
    name = "Psychrolutes Marcidus.";
    habitat = "In the sea at least at a depth of 2,000 or lower.";
    sizeInches = 12;
    similarAnimals = "Lanternfish";
    speciality = "They don't have bones.";
  }
  public String returnName(){
    return name;
  }
  public String returnHabitat(){
    return habitat;
  }
  public int returnSizeInches(){
    return sizeInches;
  }
  public String returnSimilarAnimals(){
    return similarAnimals;
  }
  public String returnSpeciality(){
    return speciality;
  }
  public static void main(String[] args) {
    FavAnimal ibcs = new FavAnimal();

    System.out.println("Pick one of the following numbers.");
    System.out.println("1. Animal name");
    System.out.println("2. Animal habitat");
    System.out.println("3. Animal size in inches");
    System.out.println("4. A similar animal");
    System.out.println("5. Fun fact");

    Scanner choice = new Scanner(System.in);
    String ch = choice.next();

    if (ch.equals("1")) {
      System.out.println(ibcs.returnName());
    }
    if (ch.equals("2")) {
      System.out.println(ibcs.returnHabitat());
    }
    if (ch.equals("3")) {
      System.out.println(ibcs.returnSizeInches());
    }
    if (ch.equals("4")) {
      System.out.println(ibcs.returnSimilarAnimals());
    }
    if (ch.equals("5")) {
      System.out.println(ibcs.returnSpeciality());
    }

}

}
