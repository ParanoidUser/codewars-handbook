import static java.util.stream.IntStream.of;

interface Kata {
  static int sumList(int[] list) {
    return of(list).sum();
  }
}
