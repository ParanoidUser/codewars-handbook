interface Dinglemouse {
  static int tvRemote(String words) {
    int[] cursor = {0, 0};
    boolean[] upper = {false};
    return words.chars().reduce(0, (s, c) -> {
      if ((!upper[0] && Character.isUpperCase(c)) || (upper[0] && Character.isLowerCase(c))) {
        s += moveCursor('^', cursor);
        upper[0] = !upper[0];
      }
      return s + moveCursor((char) c, cursor);
    });
  }

  private static int moveCursor(char c, int[] cursor) {
    var keypad = "abcde123fghij456klmno789pqrst.@0uvwxyz_/^ ";
    int index = keypad.indexOf(Character.toLowerCase(c));
    int i = index / 8;
    int j = index % 8;
    int moves = Math.min(6 - Math.abs(cursor[0] - i), Math.abs(cursor[0] - i)) +
                Math.min(8 - Math.abs(cursor[1] - j), Math.abs(cursor[1] - j)) + 1;
    cursor[0] = i;
    cursor[1] = j;
    return moves;
  }
}