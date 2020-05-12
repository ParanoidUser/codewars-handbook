import static java.util.stream.IntStream.of;

interface Kata {
  static int squareSum(int[] n) {
    return of(n).map(i -> i * i).sum();
  }
}
