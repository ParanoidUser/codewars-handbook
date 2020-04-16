import java.util.Arrays;

class Kata {
  static long stairsIn20(int[][] stairs) {
    return 20L * Arrays.stream(stairs).flatMapToInt(Arrays::stream).sum();
  }
}
