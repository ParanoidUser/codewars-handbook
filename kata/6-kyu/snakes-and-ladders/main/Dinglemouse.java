import static java.util.stream.IntStream.of;

interface Dinglemouse {
  static int snakesAndLadders(int[] board, int[] dice) {
    final int[] p = {0};
    return of(dice).filter(r -> p[0] < board.length - r).reduce(0, (s, r) -> p[0] += board[p[0] + r] + r);
  }
}