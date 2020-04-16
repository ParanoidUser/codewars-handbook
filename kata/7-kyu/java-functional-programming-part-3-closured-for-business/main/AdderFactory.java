import java.util.function.IntUnaryOperator;

class AdderFactory {
  static IntUnaryOperator create(int addTo) {
    return n -> n + addTo;
  }
}
