import static java.util.stream.Stream.of;
import static org.apache.commons.lang3.math.NumberUtils.min;

import java.util.function.ToIntFunction;

interface Solution {
  static int count_different_matrices(int[][] matrices) {
    ToIntFunction<int[]> hash = m -> min(
        1000 * m[0] + 100 * m[1] + 10 * m[3] + m[2],
        1000 * m[1] + 100 * m[3] + 10 * m[2] + m[0],
        1000 * m[2] + 100 * m[0] + 10 * m[1] + m[3],
        1000 * m[3] + 100 * m[2] + 10 * m[0] + m[1]);
    return (int) of(matrices).mapToInt(hash).distinct().count();
  }
}