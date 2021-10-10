import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Taschenrechner demo. */
public class Taschenrechner {

  public Taschenrechner() {}

  /** Interactive addition in the shell. */
  public void konsolenAddition() {
    while (true) {
      System.out.println("Bitte 1. Summanden eingeben:");
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int a = 0;
      int b = 0;
      try {
        String astr = in.readLine();
        a = Integer.parseInt(astr);
        System.out.println("Bitte 2. Summanden eingeben:");
        String bstr = in.readLine();
        b = Integer.parseInt(bstr);
        // https://www.javatpoint.com/java-string-format
        System.out.printf("%d + %d = %d%n", a, b, a + b);
      } catch (IOException e) {
        return;
      } catch (NumberFormatException e) {
        System.out.println("Das war keine Zahl!");
        return;
      }
    }
  }
}
