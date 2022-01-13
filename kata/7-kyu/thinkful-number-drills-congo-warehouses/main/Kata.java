interface Kata {
  static int boxCapacity(int l, int w, int h) {
    return (l * 3 / 4) * (w * 3 / 4) * (h * 3 / 4);
  }
}