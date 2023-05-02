interface MaxSumBetweenTwoNegatives {
  static int maxSum(int[] arr) {
    int max = -1;
    int sum = -1;
    for (int n : arr) {
      if (n < 0) {
        max = Math.max(sum, max);
        sum = 0;
      } else if (sum > -1) {
        sum += n;
      }
    }
    return max;
  }
}