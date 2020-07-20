import static java.util.stream.IntStream.of;

interface NumberZooPatrol {
  static int findMissingNumber(int[] numbers) {
    return (int) (numbers.length * (numbers.length + 3L) / 2 - of(numbers).sum()) + 1;
  }
}
