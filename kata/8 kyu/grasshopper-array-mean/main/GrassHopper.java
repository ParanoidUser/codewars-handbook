import java.util.Arrays;

class GrassHopper {
  static int findAverage(int[] nums) {
    return (int) Arrays.stream(nums).average().orElse(0);
  }
}
