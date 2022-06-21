interface TirePressure {
  static String checkPressure(int x) {
    if (x < 220) {
      return "Too low";
    }
    if (x > 220) {
      return "Too high";
    }
    return "Optimal";
  }
}