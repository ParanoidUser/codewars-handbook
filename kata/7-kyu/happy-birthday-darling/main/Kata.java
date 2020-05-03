interface Kata {
  static String womensAge(int n) {
    return n + "? That's just " + (n % 2 + 20) + ", in base " + n / 2 + "!";
  }
}