import static java.util.stream.IntStream.of;

interface Solution {
  static int stray(int[] numbers) {
    return of(numbers).reduce(0, (a, b) -> a ^ b);
  }
}
