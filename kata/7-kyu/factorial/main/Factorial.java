import java.util.stream.IntStream;

class Factorial {
  static int factorial(int n) {
    if(n < 0 || n > 12) throw new IllegalArgumentException();
    return IntStream.rangeClosed(2, n).reduce(1, (x, y) -> x * y);
  }
}
