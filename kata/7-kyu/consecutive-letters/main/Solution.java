interface Solution {
  static boolean solve(String s) {
    var stat = s.chars().summaryStatistics();
    return stat.getMax() - stat.getMin() == s.length() - 1;
  }
}