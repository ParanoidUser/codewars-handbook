class Solution {
  static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
    for (int i = 0; i < moves.length; i++) {
      switch (moves[i]) {
        case "up": position[0] = 0; break;
        case "right": position[1] = (position[1] + 1) % 6; break;
        case "down": position[0] = 1; break;
        case "left": position[1] = (position[1] + 5) % 6; break;
      }
      moves[i] = fighters[position[0]][position[1]];
    }
    return moves;
  }
}
