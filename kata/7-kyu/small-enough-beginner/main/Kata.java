import static java.util.stream.IntStream.of;

interface Kata {
  static boolean smallEnough(int[] a, int limit) {
    return of(a).noneMatch(i -> i > limit);
  }
}
