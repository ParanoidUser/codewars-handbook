interface Kata {
  static String plant(char s, int w, int f, int t) {
    if (t < 20 || t > 30) {
      f = 0;
    }
    return ("-".repeat(w) + ("" + s).repeat(f)).repeat(w) + (f > 0 ? "" : s);
  }
}