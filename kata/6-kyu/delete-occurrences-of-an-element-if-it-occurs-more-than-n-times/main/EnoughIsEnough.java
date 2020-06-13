import static java.util.stream.IntStream.of;

import java.util.HashMap;

interface EnoughIsEnough {
  static int[] deleteNth(int[] elements, int maxOccurrences) {
    var stats = new HashMap<Integer, Integer>();
    return of(elements).filter(e -> stats.merge(e, 1, Integer::sum) <= maxOccurrences).toArray();
  }
}
