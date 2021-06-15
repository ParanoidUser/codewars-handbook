import static java.util.stream.IntStream.range;

interface Solution {
  static int chocolate(int n, int[] firstBar, int[] secondBar) {
    var temp = new int[firstBar.length + 1];
    range(1, firstBar.length).forEach(i -> temp[firstBar[i - 1]] = firstBar[i]);
    return (int) (-range(1, n).filter(i -> temp[secondBar[i - 1]] == secondBar[i]).count() + --n);
  }
}
