interface Dinglemouse {
  static int tvRemote(String word) {
    int moves = 0;
    int x = 0;
    int y = 0;
    for (char c : word.toCharArray()) {
      int index = "abcde123fghij456klmno789pqrst.@0uvwxyz_/".indexOf(c);
      moves += Math.abs(x - index % 8) + Math.abs(y - index / 8) + 1;
      x = index % 8;
      y = index / 8;
    }
    return moves;
  }
}
