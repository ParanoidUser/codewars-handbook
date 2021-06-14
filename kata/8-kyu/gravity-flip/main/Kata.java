import static java.util.stream.IntStream.of;

interface Kata {
  static int[] flip(char dir, int[] arr) {
    return of(arr).boxed().sorted((a, b) -> dir > 77 ? a - b : b - a).mapToInt(i -> i).toArray();
  }
}