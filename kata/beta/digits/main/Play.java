interface Play {
  static int[] tryToGuess(Checker checker) {
    int[] code = {0, 0, 0, 9};
    int j = 0;
    for (int i = 0; i < 9 && j < 4; i++) {
      if (checker.check(new int[]{i, i, i, i}) == 1) { // 9 checks at max
        code[j++] = i;
      }
    }
    int x = 0;
    while (x == code[0] || x == code[1] || x == code[2] || x == code[3]) {
      x++;
    }
    int[] probe = {x, x, x, x};

    for (int i = 0; i < 3; i++) {
      probe[i] = code[i];
      j = i;
      while (j < 3 && checker.check(probe) == i) { // 6 checks at max
        probe[i] = code[++j];
      }
      int t = code[i];
      code[i] = code[j];
      code[j] = t;
    }
    return code;
  }
}