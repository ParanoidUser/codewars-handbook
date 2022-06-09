interface NotVisibleCubes {
  static Long notVisibleCubes(long n) {
    return (long) Math.pow(Math.max(0, n - 2), 3);
  }
}