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

    ibcs.changeSizeInches(12);

    System.out.println(ibcs.returnSizeInches());
}

}
