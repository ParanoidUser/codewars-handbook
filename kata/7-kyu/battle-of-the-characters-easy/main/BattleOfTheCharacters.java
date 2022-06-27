interface BattleOfTheCharacters {
  static String battle(String x, String y) {
    int xs = x.chars().map(i -> i - 64).sum();
    int ys = y.chars().map((i -> i - 64)).sum();
    return xs > ys ? x : xs < ys ? y : "Tie!";
  }
}
