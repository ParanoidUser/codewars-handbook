interface Clock {
  static int Past(int h, int m, int s) {
    return (h * 3600 + m * 60 + s) * 1000;
  }
}
