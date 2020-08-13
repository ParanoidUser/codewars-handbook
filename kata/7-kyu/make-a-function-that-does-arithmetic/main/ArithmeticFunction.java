interface ArithmeticFunction {
  static int arithmetic(int a, int b, String op) {
    return op.equals("multiply") ? a * b : op.equals("divide") ? a / b : a + (op.equals("add") ? b : -b);
  }
}
