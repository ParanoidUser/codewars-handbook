interface SillyAdditon {
  static int add(int num1, int num2) {
    var sum = new StringBuilder();
    do {
      sum.insert(0, num1 % 10 + num2 % 10);
      num1 /= 10;
      num2 /= 10;
    } while (num1 + num2 > 0);
    return Integer.parseInt(sum.toString());
  }
}