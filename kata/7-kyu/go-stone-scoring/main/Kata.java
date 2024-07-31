import static java.util.stream.IntStream.range;

interface Kata {
  static GameScore determineWinner(char[][] board) {
    int[] az = new int[100];
    range(0, board.length).forEach(i -> range(0, board[i].length).forEach(j -> az[board[i][j]]++));
    return az[66] > az[87] ? new GameScore('B', az[66]) : new GameScore(az[87] > az[66] ? 'W' : 'T', az[87]);
  }
}