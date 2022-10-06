interface Kata {
  static boolean areTanksInRange(double tankDistance, double initialVelocity, double angle) {
    return Math.pow(initialVelocity, 2) / 9.8 * Math.sin(Math.toRadians(2 * angle)) >= tankDistance;
  }
}