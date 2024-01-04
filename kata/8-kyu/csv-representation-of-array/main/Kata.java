import static java.util.Arrays.deepToString;

interface Kata {
  static String toCsvText(int[][] array) {
      return deepToString(array).replaceAll(" |]]|\\Q[]\\E|\\Q[[\\E", "").replace("],[", "\n");
  }
}