import java.util.function.LongToIntFunction;

interface Solution {
  static int solve(long n) {
    LongToIntFunction sum = l -> (l + "").chars().map(c -> c - 48).sum();
    long a = (long) Math.pow(10, Math.floor(Math.log10(n))) - 1;
    return (int) (n > 1 ? sum.applyAsInt(a) + sum.applyAsInt(n - a) : n);
  }
}