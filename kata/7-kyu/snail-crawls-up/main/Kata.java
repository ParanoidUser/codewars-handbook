interface Kata {
  static int snail(double column, double day, double night) {
    return Math.max(0, (int) Math.ceil((column - day) / (day - night))) + 1;
  }
}
