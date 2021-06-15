import static java.util.Arrays.copyOfRange;

interface Kata {
  static int[] splitAndAdd(int[] numbers, int n) {
    if (numbers.length > 1 && n > 0) {
      int[] half = copyOfRange(numbers, numbers.length / 2, numbers.length);
      for (var i = 0; i < numbers.length / 2; i++) {
        half[numbers.length % 2 > 0 ? i + 1 : i] += numbers[i];
      }
      return splitAndAdd(half, n - 1);
    }
    return numbers;
  }
}
