import static java.util.stream.IntStream.of;

interface Solution {
  static int findMissing(int[] numbers) {
    return (numbers[0] + numbers[numbers.length - 1]) * (numbers.length + 1) / 2 - of(numbers).sum();
  }
}
