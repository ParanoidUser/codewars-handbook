import static java.util.stream.IntStream.range;

import java.util.List;
import java.util.function.IntBinaryOperator;

interface Kata {
  static int[][] rotateCounterclockwise(int[][] m, int times) {
    var getAt = List.<IntBinaryOperator>of(
        (r, c) -> m[r][c],
        (r, c) -> m[c][m.length - 1 - r],
        (r, c) -> m[m.length - 1 - r][m.length - 1 - c],
        (r, c) -> m[m.length - 1 - c][r]
    ).get(times % 4);

    return range(0, m.length).mapToObj(r -> range(0, m.length)
        .map(c -> getAt.applyAsInt(r, c)).toArray()).toArray(int[][]::new);
  }
}
