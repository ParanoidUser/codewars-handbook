import static java.util.stream.Stream.of;

interface Votes {
  static int[] getSum(int[][] votes) {
    return of(votes).reduce(new int[2], (s, d) -> new int[]{s[0] + d[0], s[1] + d[1]});
  }
}