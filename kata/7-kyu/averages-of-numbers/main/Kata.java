import static java.util.stream.IntStream.range;

interface Kata {
  static double[] averages(int[] nums) {
    return nums != null ? range(0, nums.length - 1).mapToDouble(i -> (nums[i] + nums[i + 1]) / 2.).toArray() : new double[0];
  }
}
