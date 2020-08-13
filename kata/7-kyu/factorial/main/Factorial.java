import static java.util.stream.IntStream.rangeClosed;

class Factorial {
  int factorial(int n) {
    if(n < 0 || n > 12) throw new IllegalArgumentException();
    return rangeClosed(2, n).reduce(1, (x, y) -> x * y);
  }
}
