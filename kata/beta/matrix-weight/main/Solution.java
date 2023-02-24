import static java.util.Arrays.stream;
import static java.util.stream.IntStream.of;
import static java.util.stream.IntStream.range;

interface Solution {
  static String thinOrFat(int[][] m) {
    double w = stream(m).mapToDouble(row -> Math.sqrt(of(row).sum())).sum();
    double h = range(0, m.length).mapToDouble(col -> Math.sqrt(stream(m).mapToInt(i -> i[col]).sum())).sum();
    return Double.isNaN(h) ? null : w < h ? "thin" : w > h ? "fat" : "perfect";
  }
}