import static java.util.stream.IntStream.of;

class Kata {
  static int modifiedSum(int[] array, int power) {
    return of(array).map(n -> (int) Math.pow(n, power) - n).sum();
  }
}
