import java.util.List;

interface MinMax {
  static int[] getMinMax(List<Integer> list) {
    var stats = list.stream().mapToInt(i -> i).summaryStatistics();
    return new int[]{stats.getMin(), stats.getMax()};
  }
}