public class Auto {
  private String farbe;
  private String modell;

  public Auto(String f, String m){
    String farbe = f;
    System.out.println("Auto mit Farbe " + farbe + " erzeugt.");
  }

  public String getFarbe() {
    return farbe;
  }

  public String getModell() {
    return modell;
  }
}
