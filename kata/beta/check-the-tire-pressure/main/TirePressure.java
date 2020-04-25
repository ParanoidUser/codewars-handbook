interface TirePressure {
  static String checkPressure(int x) {
    return x > 220 ? "Too high" : x < 220 ? "Too low" : "Optimal";
  }
}