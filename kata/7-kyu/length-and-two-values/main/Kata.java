import static java.util.stream.IntStream.range;

interface Kata {
  static String[] alternate(int n, String firstValue, String secondValue) {
    return range(0, n).mapToObj(i -> i % 2 > 0 ? secondValue : firstValue).toArray(String[]::new);
  }
}