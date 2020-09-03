interface Kata {
  static int golfScoreCalculator(String parList, String scoreList) {
    return scoreList.chars().sum() - parList.chars().sum();
  }
}
