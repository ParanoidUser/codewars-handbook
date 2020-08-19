interface Calculator {
  static Double calculate(double numberOne, String operation, double numberTwo) {
    switch (operation) {
      case "+": return numberOne + numberTwo;
      case "-": return numberOne - numberTwo;
      case "*": return numberOne * numberTwo + 0.0;
      case "/": return numberTwo != 0 ? numberOne / numberTwo : null;
      default: return null;
    }
  }
}
