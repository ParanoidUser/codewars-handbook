import static java.lang.Math.pow;

import java.util.HashMap;

interface Solution {
  static int[] peelTheOnion(int s, int d) {
    var res = new int[(s + 1) / 2];
    var cache = new HashMap<Integer, Double>();
    for (int i = 0; i < res.length; i++) {
      double n1 = cache.computeIfAbsent(s - 2 * i, n -> pow(n, d));
      double n2 = cache.computeIfAbsent(Math.max(0, s - 2 * (i + 1)), n -> pow(n, d));
      res[i] = (int) (n1 - n2);
    }
    return res;
  }
}