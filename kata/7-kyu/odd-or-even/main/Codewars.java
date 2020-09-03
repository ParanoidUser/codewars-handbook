import static java.util.Arrays.stream;

interface Codewars {
  static String oddOrEven(int[] array) {
    return stream(array).sum() % 2 > 0 ? "odd" : "even";
  }
}
