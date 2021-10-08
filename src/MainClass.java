
public class MainClass {

  public static void main(String[] args) {
    Mathe mathe = new Mathe();
    System.out.println(mathe.zweierPotenz(5));

    Fuhrpark fuhrpark = new Fuhrpark();
    Auto auto = new Auto("blau", "Kastenwagen");
    fuhrpark.addAuto(auto);
    fuhrpark.addAuto(new Auto("rot", "Truck"));
    fuhrpark.printAutos();
    fuhrpark.printAuto(2);
  }
}
