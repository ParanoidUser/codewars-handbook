import static java.util.stream.Stream.of;

import java.util.stream.IntStream;

interface Kata {
  static long stairsIn20(int[][] stairs) {
    return 20L * of(stairs).flatMapToInt(IntStream::of).sum();
  }
}
