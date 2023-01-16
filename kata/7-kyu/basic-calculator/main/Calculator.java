interface Calculator {
  static Double calculate(double numberOne, String operation, double numberTwo) {
    return switch (operation) {
      case "+" -> numberOne + numberTwo;
      case "-" -> numberOne - numberTwo;
      case "*" -> numberOne * numberTwo + 0.0;
      case "/" -> numberTwo != 0 ? numberOne / numberTwo : null;
      default -> null;
    };
  }
}