import static java.util.stream.LongStream.of;

import java.util.List;

interface SqProd2Sum {
  static List<long[]> prod2Sum(long a, long b, long c, long d) {
    var ef1 = of(a * c + b * d, Math.abs(a * d - b * c)).sorted().toArray();
    var ef2 = of(a * d + b * c, Math.abs(a * c - b * d)).sorted().toArray();
    return ef1[0] == ef2[0] ? List.of(ef1) : List.of(ef1, ef2);
  }
}