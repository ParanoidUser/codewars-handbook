interface Persist {
  static int persistence(long n) {
    var times = 0;
    while (n > 9) {
      n = (n + "").chars().reduce(1, (a, b) -> a * (b - 48));
      times++;
    }
    return times;
  }
}
