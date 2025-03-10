import static java.util.stream.IntStream.range;

interface Kata {
  static int evenLast(int[] nums) {
    return range(0, nums.length).reduce(0, (s, i) -> i % 2 == 0 ? s + nums[i] * nums[nums.length - 1] : s);
  }
}