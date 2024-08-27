import static java.util.stream.IntStream.range;

interface Solution {
  static String[] createArrayOfTiers(int num) {
    var s = num + "";
    return range(0, s.length()).mapToObj(i -> s.substring(0, i + 1)).toArray(String[]::new);
  }
}