/** Auto. */
public class Auto {
  private final String farbe;
  private final String modell;

  /**
   * Creates a new Auto.
   *
   * @param f farbe
   * @param m modell
   */
  public Auto(String f, String m) {
    farbe = f;
    modell = m;
  }

  public String getFarbe() {
    return farbe;
  }

  public String getModell() {
    return modell;
  }
}
