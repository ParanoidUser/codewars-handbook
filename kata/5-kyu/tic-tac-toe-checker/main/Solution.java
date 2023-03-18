import static java.util.stream.IntStream.of;

interface Solution {
  static int isSolved(int[][] board) {
    var stats = of(
        board[0][0] * board[0][1] * board[0][2],
        board[1][0] * board[1][1] * board[1][2],
        board[2][0] * board[2][1] * board[2][2],
        board[0][0] * board[1][0] * board[2][0],
        board[0][1] * board[1][1] * board[2][1],
        board[0][2] * board[1][2] * board[2][2],
        board[0][0] * board[1][1] * board[2][2],
        board[0][2] * board[1][1] * board[2][0]
    ).map(i -> i == 8 ? 2 : i == 1 ? 1 : i > 0 ? 0 : -2).summaryStatistics();
    return stats.getSum() == 0 ? 0 : stats.getMax() > 0 ? stats.getMax() : -1;
  }
}