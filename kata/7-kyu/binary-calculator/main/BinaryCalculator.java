interface BinaryCalculator {
  static String calculate(String n1, String n2, String o) {
    int a = Integer.parseInt(n1, 2);
    int b = Integer.parseInt(n2, 2);
    return Integer.toBinaryString(o.equals("add") ? a + b : o.equals("multiply") ? a * b : a - b);
  }
}
