interface Dinglemouse {
  static int tvRemote(String words) {
    int moves = 0;
    int i = 0;
    boolean upper = false;
    for (char c : words.toCharArray()) {
      if (Character.isLetter(c) && Character.isUpperCase(c) != upper) {
        moves += 6 - i / 8 + i % 8;
        i = 40;
        upper = !upper;
      }
      int p = "abcde123fghij456klmno789pqrst.@0uvwxyz_/^ ".indexOf(Character.toLowerCase(c));
      moves += Math.abs(i / 8 - p / 8) + Math.abs(i % 8 - p % 8) + 1;
      i = p;
    }
    return moves;
  }
}