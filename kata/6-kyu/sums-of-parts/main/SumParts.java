interface SumParts {
  static int[] sumParts(int[] ls) {
    var sum = new int[ls.length + 1];
    for (int i = ls.length - 1; i > -1; i--) {
      sum[i] = sum[i + 1] + ls[i];
    }
    return sum;
  }
}
