import static java.util.stream.IntStream.of;

interface Solution {
  static int[] distinct(int[] array) {
    return of(array).distinct().toArray();
  }
}