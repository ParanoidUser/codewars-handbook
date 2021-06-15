interface Solution {
  static String[] capitalize(String s) {
    var r = new String[] {"", ""};
    for (var i = 0; i < s.length(); i++) {
      r[i & 1] += (char) (s.charAt(i) - 32);
      r[i & 1 ^ 1] += s.charAt(i);
    }
    return r;
  }
}
