interface Kata {
  static String encode(String s) {
    return code(s, false);
  }

  static String decode(String s) {
    return code(s, true);
  }

  private static String code(String s, boolean swap) {
    char[] chars = new char[s.length()];
    for (int i = 0, l = 0, r = s.length() - 1; l <= r; i += 2, l++, r--) {
      int[] j = swap ? new int[]{l, r, i, i + 1} : new int[]{i, i + 1, l, r};
      chars[j[0]] = s.charAt(j[2]);
      chars[Math.min(s.length() - 1, j[1])] = s.charAt(Math.min(s.length() - 1, j[3]));
    }
    return new String(chars);
  }
}