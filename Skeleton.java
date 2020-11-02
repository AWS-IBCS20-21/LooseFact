import java.util.*;

public class Skeleton {

  public Skeleton() {

  }

  public static void main(String[] args) {

    Skeleton s = new Skeleton();

    ArrayList<String> SadAndConfusingWierdMovies = new ArrayList<String>();

    SadAndConfusingWierdMovies.add("Blue Perfect");
    SadAndConfusingWierdMovies.add("Maquia: When the Promised Flower Blooms");
    SadAndConfusingWierdMovies.add("Millenium Actress");
    SadAndConfusingWierdMovies.add("Japan Sinks");
    SadAndConfusingWierdMovies.add("Ghost in the Shell");
    SadAndConfusingWierdMovies.add("Grave of the Fireflies");



    System.out.println(SadAndConfusingWierdMovies.size());

    for (String stuff : SadAndConfusingWierdMovies) {
      System.out.println(stuff);
    }

  }


}
