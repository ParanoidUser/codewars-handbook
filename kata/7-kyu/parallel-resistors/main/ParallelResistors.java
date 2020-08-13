import static java.util.stream.IntStream.of;

interface ParallelResistors {
  static double resistance(int... resistances) {
    return 1. / of(resistances).mapToDouble(i -> 1. / i).sum();
  }
}
