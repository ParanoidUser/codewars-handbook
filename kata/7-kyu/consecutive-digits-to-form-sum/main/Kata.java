interface Kata {
  static boolean consecutiveDucks(int n) {
    return (n & --n) > 0;
  }
}