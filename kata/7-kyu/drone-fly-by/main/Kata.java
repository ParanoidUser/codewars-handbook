interface Kata {
  static String flyBy(String lamps, String drone) {
    return "o".repeat(Math.min(lamps.length(), drone.length())) + "x".repeat(Math.max(0, lamps.length() - drone.length()));
  }
}