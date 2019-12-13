class ArithmeticFunction {
  static int arithmetic(int a, int b, String op) {
    return op == "multiply" ? a * b : op == "divide" ? a / b : a + (op == "add" ? b : -b);
  }
}
