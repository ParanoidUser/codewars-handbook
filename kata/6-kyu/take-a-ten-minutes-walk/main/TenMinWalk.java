interface TenMinWalk {
  static boolean isValid(char[] walk) {
    int x = 0;
    int y = 0;
    for (char c : walk) {
      if (c == 'n') y++;
      if (c == 's') y--;
      if (c == 'w') x--;
      if (c == 'e') x++;
    }
    return x == 0 && y == 0 && walk.length == 10;
  }
}
