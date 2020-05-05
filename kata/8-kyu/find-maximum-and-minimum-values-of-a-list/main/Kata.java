import static java.util.stream.IntStream.of;

class Kata {
  static int min(int[] list) {
    return of(list).min().orElse(0);
  }

  static int max(int[] list) {
    return of(list).max().orElse(0);
  }
}
