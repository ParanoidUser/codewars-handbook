interface MaxConsecutiveSum {
  static int[] maxConsecutiveSum(int num) {
    long start = 1;
    long end = (long) Math.sqrt(2. * num);
    long sum = end * (end + 1) / 2;
    for (; num > 2 && end < num / 2 + 2; end++, sum += end) {
      while (sum > num) {
        sum -= start++;
      }
      if (sum == num) {
        return new int[]{(int) start, (int) end};
      }
    }
    return new int[0];
  }
}