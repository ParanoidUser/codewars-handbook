interface DRoot {
  static int digital_root(int n) {
    return --n % 9 + 1;
  }
}
