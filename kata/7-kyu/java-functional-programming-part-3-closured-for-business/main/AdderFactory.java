import java.util.function.IntUnaryOperator;

interface AdderFactory {
  static IntUnaryOperator create(int addTo) {
    return n -> n + addTo;
  }
}
