public class Mathe {

  public long zweierPotenz(int i) {
    return i == 0 ? 0 : 2 * zweierPotenz(i - 1);
  }

}
