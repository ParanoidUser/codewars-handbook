interface Kata {
  static String plant(char s, int w, int f, int t) {
    return ("-".repeat(w) + ("" + s).repeat(f = t < 20 || t > 30 ? 0 : f)).repeat(w) + (f > 0 ? "" : s);
  }
}