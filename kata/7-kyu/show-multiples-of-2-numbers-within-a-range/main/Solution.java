import static java.util.stream.IntStream.range;

import java.util.List;

interface Solution {
  static List<Integer> findMultiples(int s1, int s2, int s3) {
    return range(Math.max(s1, s2), s3).filter(n -> n % s1 == 0 && n % s2 == 0).boxed().toList();
  }
}
