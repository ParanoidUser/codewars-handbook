import static java.util.Arrays.stream;

interface Minimum {
  static int minValue(int[] values) {
    return stream(values).distinct().sorted().reduce(0, (a, b) -> 10 * a + b);
  }
}
