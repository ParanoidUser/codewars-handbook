import static java.util.stream.IntStream.of;

interface GrassHopper {
  static int findAverage(int[] nums) {
    return (int) of(nums).average().orElse(0);
  }
}
