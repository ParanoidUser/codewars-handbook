import static java.util.stream.IntStream.range;

interface Solution {
  static boolean isOrthogonal(int[] u, int[] v) {
    return range(0, u.length).reduce(0, (s, i) -> s + u[i] * v[i]) == 0;
  }
}