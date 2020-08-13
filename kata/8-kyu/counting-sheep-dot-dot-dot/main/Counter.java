import static java.util.stream.Stream.of;

class Counter {
  int countSheeps(Boolean[] sheep) {
    return (int) of(sheep).filter(b -> b != null && b).count();
  }
}
