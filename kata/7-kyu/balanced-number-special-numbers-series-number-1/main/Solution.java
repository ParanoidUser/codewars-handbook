interface Solution {
  static String balancedNum(long number) {
    var s = String.valueOf(number);
    int l = s.substring(0, s.length() / 2 - (s.length() % 2 == 0 ? 1 : 0)).chars().sum();
    int r = s.substring(s.length() / 2 + 1).chars().sum();
    return (l == r ? "" : "Not ") + "Balanced";
  }
}
