interface Kata {
  static String getHonorPath(int honorScore, int targetHonorScore) {
    return (targetHonorScore -= honorScore) > 0 ? "2kyus: " + targetHonorScore % 2 + ", 1kyus: " + targetHonorScore / 2 : "";
  }
}
