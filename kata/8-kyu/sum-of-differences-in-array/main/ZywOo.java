import static java.util.stream.IntStream.of;

interface ZywOo {
  static int sumOfDifferences(int[] arr) {
    var stat = of(arr).summaryStatistics();
    return arr.length > 1 ? stat.getMax() - stat.getMin() : 0;
  }
}
