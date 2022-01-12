interface Kata {
  static int scrabbleScore(String word) {
    return word.replace(" ", "").chars().map(c -> ScoreBoard.getScore((char) (c & -33))).sum();
  }
}