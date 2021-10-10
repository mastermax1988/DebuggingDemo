import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taschenrechner {

  public Taschenrechner() {}

  public void konsolenAddition() {
    while (true) {
      System.out.println("Bitte 1. Summanden eingeben:");
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int a = 0;
      int b = 0;
      try {
        String aStr = in.readLine();
        a = Integer.parseInt(aStr);
        System.out.println("Bitte 2. Summanden eingeben:");
        String bStr = in.readLine();
        b = Integer.parseInt(bStr);
        // https://www.javatpoint.com/java-string-format
        System.out.printf("%d + %d = %d%n", a, b, a + b);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
