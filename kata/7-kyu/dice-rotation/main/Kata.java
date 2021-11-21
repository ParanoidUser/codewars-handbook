import static java.util.stream.IntStream.*;

interface Kata {
  static int rotations(int[] dieArray) {
    return rangeClosed(1, 6).map(n -> of(dieArray).map(d -> n != d ? n + d == 7 ? 2 : 1 : 0).sum()).min().orElse(0);
  }
}