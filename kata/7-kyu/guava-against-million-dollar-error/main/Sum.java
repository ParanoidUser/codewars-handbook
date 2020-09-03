import java.util.Objects;

interface Sum {
  static double sum(Double a, Double b) {
    Objects.requireNonNull(a, "Illegal Argument passed: First parameter is Null.");
    Objects.requireNonNull(b, "Illegal Argument passed: Second parameter is Null.");
    if (a > 0 && b > 0) {
      return a + b;
    }
    throw new IllegalArgumentException("Illegal Argument passed: Non-positive value " + (a <= 0 ? a : b) + ".");
  }
}
