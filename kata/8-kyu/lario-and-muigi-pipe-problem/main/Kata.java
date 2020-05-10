import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static int[] pipeFix(int[] numbers) {
    return rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
  }
}
