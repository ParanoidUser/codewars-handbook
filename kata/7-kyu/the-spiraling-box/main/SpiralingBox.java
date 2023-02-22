import static java.util.stream.IntStream.range;
import static org.apache.commons.lang3.math.NumberUtils.min;

interface SpiralingBox {
  static int[][] createBox(int w, int l) {
    return range(0, l).mapToObj(i -> range(0, w).map(j -> min(i, l - i - 1, j, w - j - 1) + 1).toArray()).toArray(int[][]::new);
  }
}