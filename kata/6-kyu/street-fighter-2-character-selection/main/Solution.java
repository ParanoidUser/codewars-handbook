interface Solution {
  static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
    for (var i = 0; i < moves.length; i++) {
      switch (moves[i]) {
        case "right" -> position[1] = (position[1] + 1) % 6;
        case "left" -> position[1] = (position[1] + 5) % 6;
        default -> position[0] = moves[i].equals("up") ? 0 : 1;
      }
      moves[i] = fighters[position[0]][position[1]];
    }
    return moves;
  }
}