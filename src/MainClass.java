
public class MainClass {

  public static void main(String[] args) {
    //demo1();
    //demo2();
    //demo3();
    //demo4();
  }



  private static void demo1(){
   Mathe mathe = new Mathe();
    System.out.println(mathe.zweierPotenz(10));
    //System.out.println(mathe.zweierPotenz(0));
    //System.out.println(mathe.zweierPotenz(-2));
  }

  private static void demo2(){
    Fuhrpark fuhrpark = new Fuhrpark();
    Auto auto = new Auto("blau", "Kastenwagen");
    fuhrpark.addAuto(auto);
    fuhrpark.addAuto(new Auto("rot", "Truck"));
    fuhrpark.printAutos();
    fuhrpark.printAuto(2);
  }

  private static void demo3() {
    Taschenrechner taschenrechner = new Taschenrechner();
    taschenrechner.konsolenAddition();
  }

  private static void demo4(){
    Words words = Words.getInstance();
    System.out.println(words.getRandomWord());
    System.out.println(words.getRandomWord());
    System.out.println(words.getWordWithXCharacters(3));
    System.out.println(words.getWordWithXCharacters(3));
    System.out.println(words.getShortestWordLastInAlphabet());
  }
}
