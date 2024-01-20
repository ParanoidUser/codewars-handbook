import java.util.function.IntUnaryOperator;

interface Solution {
  static int convergence(int n) {
    IntUnaryOperator next = i -> i > 9 ? (i + "").chars().map(c -> c > 48 ? c - 48 : 1).reduce(1, (p, j) -> p * j) : i;
    int count = 0;
    int base = 1;
    while (base != n) {
      if (base < n) {
        base += next.applyAsInt(base);
      } else {
        n += next.applyAsInt(n);
        count++;
      }
    }
    return count;
  }
}