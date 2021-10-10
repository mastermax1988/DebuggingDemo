/** Demo. */
public class Mathe {

  /**
   * Berechnet 2^i.
   *
   * @param i nicht negativer exponent
   * @return 2^i, wenn i>=0, sonst 0
   */
  public long zweierPotenz(int i) {
    if (i < 0) {
      return 0;
    }
    if (i == 0) {
      return 1;
    }
    return 2 * zweierPotenz(i - 1);
  }
}
