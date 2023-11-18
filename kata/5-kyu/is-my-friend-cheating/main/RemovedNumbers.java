import static java.util.stream.LongStream.range;

import java.util.List;

interface RemovedNumbers {
  static List<long[]> removNb(long n) {
    return range(1, n)
        .mapToObj(a -> new double[]{a, (n * (n + 1) / 2. - a) / (a + 1)})
        .filter(ab -> ab[1] < n && ab[1] % 1 == 0)
        .map(ab -> new long[]{(long) ab[0], (long) ab[1]})
        .toList();
  }
}