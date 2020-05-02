import static java.util.stream.IntStream.of;

interface Kata {
  static double find_average(int[] array) {
    return of(array).average().orElse(0);
  }
}
