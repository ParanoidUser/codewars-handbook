class Score {

  private int score;

  int get() {
    return score;
  }

  void init() {
    decreaseByValue(score);
  }

  void increaseByTen() {
    increaseByValue(10);
  }

  void increaseByValue(int value) {
    score += value;
  }

  void decreaseByValue(int value) {
    score = Math.max(0, score - value);
  }
}