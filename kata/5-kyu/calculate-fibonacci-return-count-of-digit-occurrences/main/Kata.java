import static java.math.BigInteger.ONE;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Stream.iterate;

import java.math.BigInteger;
import java.util.Comparator;

interface Kata {
  static int[][] FibDigits(int n) {
    return iterate(new BigInteger[]{ONE, ONE}, i -> new BigInteger[]{i[1], i[0].add(i[1])})
        .limit(n).reduce((x, y) -> y).orElse(new BigInteger[1])[0].toString().chars()
        .mapToObj(c -> c - 48).collect(groupingBy(d -> d, counting())).entrySet().stream()
        .map(e -> new int[]{e.getValue().intValue(), e.getKey()})
        .sorted(Comparator.<int[]>comparingInt(d -> d[0]).thenComparing(d -> d[1]).reversed())
        .toArray(int[][]::new);
  }
}