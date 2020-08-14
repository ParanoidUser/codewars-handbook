import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.of;

interface Solution {
  static int[] solve(String[] arr) {
    return of(arr).mapToInt(s -> (int) range(0, s.length()).filter(i -> i == s.toUpperCase().charAt(i) - 65).count()).toArray();
  }
}
