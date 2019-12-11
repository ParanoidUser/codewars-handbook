import static java.util.stream.IntStream.of;

class Solution {
  static long[] productArray(int[] numbers) {
    long p = of(numbers).asLongStream().reduce(1, (x, y) -> x * y);
    return of(numbers).mapToLong(x -> p / x).toArray();
  }
}
