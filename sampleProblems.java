public class sampleProblems {

  public sampleProblems() {

  }

  public String doubleChar(String s) {
    String result = "";

    char[] cArray = s.toCharArray();

    for (char c : cArray) {
      result = result + c;
      result = result + c;
    }

    return result;
  }

  public boolean prefixAgain(String s, int n) {
    if (s.substring(n + 1)contains(s.substring(0, n))){

    return true;
  }
  else{
    return false;
  }
  }


  // Return an integer. Either 0, 1 or 2. 0 = bad
  // 1 = good and 2 = great.
  // A tea party is good if both the tea and the candy
  // are at least 5. However if either the tea or The
  // candy are more than double the amount of the other
  // then the party is great. In all cases, however,
  // the party is bad if either the tea or the candy
  // is less than 5.
  public int teaParty(int tea, int candy) {
    if (tea > 5 && candy > 5){
      if (tea => candy * 2 && candy => tea * 2){
        System.out.println("2"));

      }
      System.out.println("1"));

    }
    else{
      return 0;
    }


  }





  public static void main(String[] args) {

    sampleProblems sample = new sampleProblems();
    //test problem 1
    System.out.println(sample.doubleChar("Hi Computer Class"));
    //test problem 2

    System.out.println("word");
    Scanner choice = new Scanner(System.in);
    String s = choice.next();
    System.out.println("number");
    Scanner choice = new Scanner(System.in);
    int n = choice.next();
    sample.prefixAgain(String s, int n);

    //test problem 3
    System.out.println("candy");
    Scanner choice = new Scanner(System.in);
    int candy = choice.next();
    System.out.println("tea");
    Scanner choice = new Scanner(System.in);
    int tea = choice.next();
    sample.teaParty(int tea, int candy);


  }
}
