import java.util.Arrays;

interface Kata {
  static int addAll(int[] numbers) {
    var total = 0;
    while (numbers.length > 1) {
      Arrays.sort(numbers);
      total += numbers[1] += numbers[0];
      numbers = Arrays.copyOfRange(numbers, 1, numbers.length);
    }
    return total;
  }
}
