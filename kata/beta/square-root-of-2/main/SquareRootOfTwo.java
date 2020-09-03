class SquareRootOfTwo {
  String calculate(int n) {
    return String.format("%.10f", 1 + (n > 0 ? 1 / (1 + Double.parseDouble(calculate(--n))) : 0));
  }
}