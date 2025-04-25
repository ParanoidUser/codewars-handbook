interface Calculator {
  static double calculate(double a, double b, String op) {
    return switch (op) {
      case "+" -> a + b;
      case "-" -> a - b;
      case "*" -> a * b;
      case "/" -> b != 0 ? a / b : 0;
      default -> throw new IllegalArgumentException();
    };
  }
}