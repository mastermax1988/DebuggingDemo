import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/** Steams debugging. */
public class Words {
  private static Words words = new Words();
  private static List<String> wordList;
  final ThreadLocal<Random> rnd = new ThreadLocal<Random>();

  private Words() {
    rnd.set(new Random());
    try {
      File file =
          new File(Objects.requireNonNull(getClass().getResource("dictionary.txt")).getPath());
      wordList = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
    } catch (IOException e) {
      wordList = new ArrayList<>();
      System.out.println("dictionary not loaded!");
    }
  }

  public static Words getInstance() {
    return words;
  }

  public String getRandomWord() {
    return wordList.get(rnd.get().nextInt(wordList.size()));
  }

  public String getWordWithCharacters(int x) {
    List<String> wl = wordList.stream().filter(w -> w.length() == x).toList();
    return wl.get(rnd.get().nextInt(wl.size()));
  }

  /**
   * Returns the shortest word, which comes last in alphabet.
   *
   * @return shortestWordLastInAlphabet
   */
  public String getShortestWordLastInAlphabet() {
    return wordList.stream()
        .sorted((a, b) -> b.compareTo(a))
        .sorted((a, b) -> a.length() - b.length())
        .toList()
        .get(0);
  }
}
