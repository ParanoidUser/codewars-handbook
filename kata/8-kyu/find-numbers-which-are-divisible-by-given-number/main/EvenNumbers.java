import java.util.Arrays;

class EvenNumbers {
  static int[] divisibleBy(int[] numbers, int divider) {
    return Arrays.stream(numbers).filter(n -> n % divider == 0).toArray();
  }
}
