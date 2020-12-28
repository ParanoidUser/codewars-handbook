interface Kata {
  static int quarterOf(int month) {
    return (int) Math.ceil(month / 3.);
  }
}