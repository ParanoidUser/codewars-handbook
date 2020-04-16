import static java.util.stream.IntStream.of;

import java.util.HashMap;

class EnoughIsEnough {
  static int[] deleteNth(int[] elements, int maxOccurrences) {
    HashMap<Integer, Integer> stats = new HashMap<>();
    return of(elements).filter(e -> stats.merge(e, 1, Integer::sum) <= maxOccurrences).toArray();
  }
}
