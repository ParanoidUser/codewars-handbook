interface Kata {
  static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    return distanceToPump <= mpg * fuelLeft;
  }
}
