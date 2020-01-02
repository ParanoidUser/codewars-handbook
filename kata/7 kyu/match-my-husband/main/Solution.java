import static java.util.stream.IntStream.of;

class Solution {
  static String match(int[] usefulness, int months) {
    return of(usefulness).sum() < 100 * Math.pow(.85, months) ? "No match!" : "Match!";
  }
}
