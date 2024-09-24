interface Kata {
  static boolean interlockable(long a, long b) {
    return (a & b) == 0;
  }
}