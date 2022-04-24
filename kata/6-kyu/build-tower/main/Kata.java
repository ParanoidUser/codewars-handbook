import static java.util.stream.IntStream.range;

interface Kata {
  static String[] towerBuilder(int f) {
    return range(0, f).mapToObj(i -> String.format("%1$s%2$s%1$s", " ".repeat(f - i - 1), "*".repeat(2 * i + 1))).toArray(String[]::new);
  }
}