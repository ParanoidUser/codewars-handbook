interface Kata {
  static int nextHigher(int n) {
    return Integer.parseInt(Integer.toBinaryString(n).replaceAll("0?1(1*)(0*)$", "10$2$1"), 2);
  }
}