class Kata {
  static int maxContiguousSum(int[] arr) {
    int max = 0, sum = 0;
    for (int num : arr) {
      max = max > (sum = Math.max(sum + num, 0)) ? max : sum;
    }
    return max;
  }
}
