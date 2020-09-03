import static java.util.stream.IntStream.of;

interface Kata {
  static int houseNumbersSum(int[] arr) {
    return of(arr).takeWhile(i -> i > 0).sum();
  }
}
