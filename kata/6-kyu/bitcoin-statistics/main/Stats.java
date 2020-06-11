import static java.util.Arrays.stream;
import static java.util.stream.Stream.concat;
import static java.util.stream.Stream.of;

import java.util.DoubleSummaryStatistics;

interface Stats {
  static double[][] getMinAvgMax(long discard, double[][] data) {
    var summary = new DoubleSummaryStatistics();
    var stats = stream(data).map(a -> {
      var local = stream(a).limit(a.length - discard).skip(discard).summaryStatistics();
      summary.combine(local);
      return local;
    });
    return concat(stats, of(summary)).map(s -> new double[]{s.getMin(), s.getAverage(), s.getMax()}).toArray(double[][]::new);
  }
}
