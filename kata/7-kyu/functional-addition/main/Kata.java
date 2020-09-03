import java.util.function.IntUnaryOperator;

interface Kata {
  static IntUnaryOperator add(int n) {
    return a -> a + n;
  }
}
