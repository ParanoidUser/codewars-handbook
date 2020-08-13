interface Kata {
  static boolean eightBitNumber(String n) {
    return n.matches("[1-9]?\\d|1\\d\\d|2[0-4]\\d|25[0-5]");
  }
}
