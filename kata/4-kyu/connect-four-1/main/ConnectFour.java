import java.util.List;

class ConnectFour {
  static String whoIsWinner(List<String> piecesPositionList) {
    var board = new String[7][6];
    for (String piece : piecesPositionList) {
      int row, column = piece.charAt(0) - 65;
      for (row = 0; board[column][row] != null; row++) ;

      board[column][row] = piece.substring(2);
      for (var step : new int[][] {{0, 1}, {1, 0}, {1, 1}, {1, -1}}) {
        var result = move(column, row, step, piece.substring(2), board);
        if (!result.isEmpty()) {
          return result;
        }
      }
    }
    return "Draw";
  }

  private static String move(int column, int row, int[] step, String piece, String[][] board) {
    for (int n = 0, f = 1; f >= -1; f -= 2) {
      for (int c = column, r = row;
          c >= 0 && c < 7 && r >= 0 && r < 6 && piece.equals(board[c][r]);
          c += step[0] * f, r += step[1] * f) {
        if (++n > 4) {
          return piece;
        }
      }
    }
    return "";
  }
}
