import static java.util.stream.IntStream.range;

interface Kata {
  static int searchLostNumber(int[] nums) {
    int step = nums[0] - nums[1] == nums[1] - nums[2] ? nums[1] - nums[0] : nums[3] - nums[2];
    return range(0, nums.length - 1).filter(i -> nums[i] + step != nums[i + 1])
        .map(i -> nums[i + 1] - step).findFirst().orElse(nums[nums.length - 1] + step);
  }
}
