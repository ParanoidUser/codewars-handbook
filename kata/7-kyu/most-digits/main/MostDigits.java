import static java.util.stream.IntStream.of;

interface MostDigits {
  static int findLongest(int[] numbers) {
    return of(numbers).reduce(0, (a, b) -> ("" + Math.abs(a)).length() < ("" + Math.abs(b)).length() ? b : a);
  }
}
