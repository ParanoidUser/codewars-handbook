interface Solution {
  static Object[] longestRepetition(String s) {
    var result = new Object[]{"", 0};
    int max = 1;
    for (int i = 0, last = '_'; i < s.length(); last = s.charAt(i), i++) {
      if ((max = last == s.charAt(i) ? max + 1 : 1) > (int) result[1]) {
        result[0] = s.charAt(i) + "";
        result[1] = max;
      }
    }
    return result;
  }
}
