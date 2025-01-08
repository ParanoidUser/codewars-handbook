import java.util.function.LongToIntFunction;

interface Solution {
  static int solve(long n) {
    LongToIntFunction sum = l -> (l + "").chars().map(c -> c - 48).sum();
    long a = (long) Math.pow(10, (n + "").length() - 1.) - 1;
    return (int) (n > 1 ? sum.applyAsInt(a) + sum.applyAsInt(n - a) : n);
  }
}