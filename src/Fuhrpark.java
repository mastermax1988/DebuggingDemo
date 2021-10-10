import java.util.ArrayList;
import java.util.List;

/** Fuhrpark. */
public class Fuhrpark {

  private List<Auto> autos;

  /** Constructor. */
  public Fuhrpark() {
    autos = new ArrayList<>();
  }

  /**
   * Adds a Auto.
   *
   * @param a Auto
   */
  public void addAuto(Auto a) {
    autos.add(a);
  }

  /** Prints all Autos in the Fuhrpark. */
  public void printAutos() {
    for (Auto a : autos) {
      printAuto(a);
    }
  }

  /**
   * Prints the Auto at a certain index.
   *
   * @param index index
   */
  public void printAuto(int index) {
    printAuto(autos.get(index));
  }

  private void printAuto(Auto auto) {
    System.out.println(auto.getModell() + ", " + auto.getFarbe());
  }
}
