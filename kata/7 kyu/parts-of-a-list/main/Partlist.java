import static java.util.Arrays.copyOfRange;

class Partlist {
  static String[][] partlist(String[] arr) {
    var pairs = new String[arr.length - 1][2];
    for (int i = 0; i < pairs.length; i++) {
      pairs[i][0] = String.join(" ", copyOfRange(arr, 0, i + 1));
      pairs[i][1] = String.join(" ", copyOfRange(arr, i + 1, arr.length));
    }
    return pairs;
  }
}
