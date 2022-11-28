interface Kata {
  static String sumStrings(String a, String b) {
    int length = Math.max(a.length(), b.length()) + 1;
    a = "0".repeat(length - a.length()) + a;
    b = "0".repeat(length - b.length()) + b;
    var result = new StringBuilder(length);
    int r = 0;
    for (int i = length - 1; i >= 0; i--) {
      r = r / 10 + a.charAt(i) + b.charAt(i) - 96;
      result.insert(0, r % 10);
    }
    return result.toString().replaceFirst("0*", "");
  }
}