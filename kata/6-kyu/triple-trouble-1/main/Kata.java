interface Kata {
  static int TripleDouble(long num1, long num2) {
    for (var i = "0"; !i.equals("10"); i = Integer.parseInt(i) + 1 + "") {
      if ((num1 + "").contains(i + i + i) && (num2 + "").contains(i + i)) {
        return 1;
      }
    }
    return 0;
  }
}
