import static java.util.stream.IntStream.of;

interface Bonus {
  static long[] bonus(int[] arr, long s) {
    double sum = of(arr).mapToDouble(i -> i).reduce(0, (t, n) -> t + 1 / n);
    return of(arr).mapToLong(e -> Math.round(s / (sum * e))).toArray();
  }
}