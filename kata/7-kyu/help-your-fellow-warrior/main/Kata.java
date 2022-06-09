interface Kata {
  static String getHonorPath(int honorScore, int targetHonorScore) {
    targetHonorScore -= honorScore;
    return targetHonorScore > 0 ? "2kyus: " + targetHonorScore % 2 + ", 1kyus: " + targetHonorScore / 2 : "";
  }
}
