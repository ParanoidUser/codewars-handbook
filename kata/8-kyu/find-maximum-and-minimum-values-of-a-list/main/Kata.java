import static java.util.stream.IntStream.of;

class Kata {
  int min(int[] list) {
    return of(list).min().orElse(0);
  }

  int max(int[] list) {
    return of(list).max().orElse(0);
  }
}
