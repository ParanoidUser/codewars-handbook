import static java.util.stream.IntStream.of;

import java.util.IntSummaryStatistics;

interface Solution {
  static int solve(int[][] arr) {
    var r = new IntSummaryStatistics(2, 1, 1, 2);
    for (int[] array : arr) {
      var t = of(array).summaryStatistics();
      r = of(r.getMax() * t.getMax(), r.getMax() * t.getMin(), r.getMin() * t.getMax(), r.getMin() * t.getMin()).summaryStatistics();
    }
    return r.getMax();
  }
}