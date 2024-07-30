import static java.util.stream.LongStream.of;

interface Kata {
  static long sumTwoSmallestNumbers(long[] numbers) {
    return of(numbers).sorted().limit(2).sum();
  }
}