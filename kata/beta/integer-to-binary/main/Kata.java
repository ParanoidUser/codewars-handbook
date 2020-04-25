interface Kata {
  static String int2bin(int num) {
    return "0" + (num > 0 ? Integer.toBinaryString(num) : "");
  }
}