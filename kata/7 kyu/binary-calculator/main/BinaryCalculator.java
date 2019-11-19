class BinaryCalculator {
  static String calculate(String n1, String n2, String o) {
    int a = Integer.parseInt(n1, 2), b = Integer.parseInt(n2, 2);
    return Integer.toBinaryString(o == "add" ? a + b : o == "multiply" ? a * b : a - b);
  }
}
