import static java.util.stream.IntStream.of;

interface Kata {
  static int[] invert(int[] array) {
    return of(array).map(i -> -i).toArray();
  }
}
