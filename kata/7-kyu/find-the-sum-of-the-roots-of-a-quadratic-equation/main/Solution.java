import java.util.OptionalDouble;

interface Solution {
  static OptionalDouble roots(double a, double b, double c) {
    return b * b < 4 * a * c ? OptionalDouble.empty() : OptionalDouble.of(-b / a);
  }
}