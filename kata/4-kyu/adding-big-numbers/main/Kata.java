interface Kata {
  static String add(String a, String b) {
    var sum = new StringBuilder();
    int al = a.length() - 1;
    int bl = b.length() - 1;
    boolean overflow = false;
    while (al >= 0 || bl >= 0) {
      int s = (al < 0 ? 0 : a.charAt(al--) - 48) + (bl < 0 ? 0 : b.charAt(bl--) - 48) + (overflow ? 1 : 0);
      sum.insert(0, s % 10);
      overflow = s > 9;
    }
    return (overflow ? sum.insert(0, 1) : sum).toString().replaceFirst("^0+", "");
  }
}