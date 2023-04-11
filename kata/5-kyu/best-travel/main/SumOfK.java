import static java.util.Comparator.reverseOrder;

import java.util.List;

interface SumOfK {
  static Integer chooseBestSum(int t, int k, List<Integer> ls) {
    int[] routes = new int[t + 1];
    for (int dist : ls.stream().sorted(reverseOrder()).toList()) {
      for (int i = t - dist; i >= 0; i--) {
        if (i == 0 || routes[i] > 0 && k > routes[i] && k > routes[i + dist]) {
          routes[i + dist] = routes[i] + 1;
        }
      }
    }
    for (int i = t; i >= 0; i--) {
      if (routes[i] == k) {
        return i;
      }
    }
    return null;
  }
}