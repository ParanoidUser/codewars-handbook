import static java.util.stream.IntStream.of;

interface EvenNumbers {
  static int[] divisibleBy(int[] numbers, int divider) {
    return of(numbers).filter(n -> n % divider == 0).toArray();
  }
}
