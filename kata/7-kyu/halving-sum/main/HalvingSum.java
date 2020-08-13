class HalvingSum {
  int halvingSum(int n) {
    return n < 1 ? 0 : n + halvingSum(n / 2);
  }
}
