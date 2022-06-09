import java.util.List;

interface OXAdjudicator {
  static String judge(List<Integer> history) {
    var field = new char[9];
    var xMoving = false;
    for (int move : history) {
      xMoving = !xMoving;
      field[move] = xMoving ? 'X' : 'O';
    }
    for (int[] state : new int[][] {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}}) {
      if (field[state[0]] > 0 && field[state[0]] == field[state[1]] && field[state[1]] == field[state[2]]) {
        return field[state[0]] + "_WIN";
      }
    }
    return "NO_WINNER";
  }
}
