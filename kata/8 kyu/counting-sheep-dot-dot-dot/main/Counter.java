import java.util.Arrays;

class Counter {
  int countSheeps(Boolean[] sheep) {
    return (int) Arrays.stream(sheep).filter(b -> b != null && b).count();
  }
}
