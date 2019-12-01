import static java.util.Arrays.stream;

class Codewars {
  static String oddOrEven(int[] array) {
    return stream(array).sum() % 2 == 0 ? "even" : "odd";
  }
}
