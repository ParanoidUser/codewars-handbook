class Eratosthenes {
  double circumference(double rodHeight, double shadowLength, double distanceToWell) {
    return 6.28 * distanceToWell / Math.atan(shadowLength / rodHeight);
  }
}
