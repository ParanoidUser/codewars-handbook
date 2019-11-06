class BasicOperations {
  static Integer basicMath(String op, int v1, int v2) {
    return op == "*" ? v1 * v2 : op == "/" ? v1 / v2 : v1 + (op == "+" ? v2 : -v2);
  }
}
