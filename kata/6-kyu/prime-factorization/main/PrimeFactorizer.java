import java.util.HashMap;
import java.util.Map;

class PrimeFactorizer {
  Map<Long, Integer> factor(long n) {
    Map<Long, Integer> factors = new HashMap<>();
    for (long i = 2; i <= n / i; i++) {
      while (n % i == 0) {
        factors.merge(i, 1, Integer::sum);
        n /= i;
      }
    }
    if (n > 1) {
      factors.put(n, 1);
    }
    return factors;
  }
}
