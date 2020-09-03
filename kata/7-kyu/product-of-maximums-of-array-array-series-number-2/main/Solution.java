import static java.util.stream.IntStream.of;

interface Solution {
  static long maxProduct(int[] numbers, long subSize) {
    return of(numbers).sorted().skip(numbers.length - subSize).mapToLong(i -> i).reduce(1, (p, n) -> p * n);
  }
}
