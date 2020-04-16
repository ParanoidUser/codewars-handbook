import java.util.Arrays;

class ZywOo {
  static int sumOfDifferences(int[] arr) {
    var stat = Arrays.stream(arr).summaryStatistics();
    return arr.length > 1 ? stat.getMax() - stat.getMin() : 0;
  }
}
