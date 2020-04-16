import static java.util.stream.IntStream.range;

class Solution {
  static int chocolate(int n, int[] firstBar, int[] secondBar) {
    int[] temp = new int[firstBar.length + 1];
    for (int i = 1; i < firstBar.length; i++) temp[firstBar[i - 1]] = firstBar[i];
    return (int) (-range(1, n).filter(i -> temp[secondBar[i - 1]] == secondBar[i]).count() + --n);
  }
}
