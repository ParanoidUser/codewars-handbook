import static java.util.stream.IntStream.of;

interface ElectionWinners {
  static int find(int[] votes, int k) {
    int max = of(votes).max().orElse(0);
    if (k > 0) {
      return (int) of(votes).filter(n -> n > max - k).count();
    }
    return of(votes).filter(n -> n == max).count() == 1 ? 1 : 0;
  }
}
