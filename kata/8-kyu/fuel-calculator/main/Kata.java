interface Kata {
  static double fuelPrice(int litres, double price) {
    return litres * (price - Math.min(Math.floorDiv(litres, 2) * .05, .25));
  }
}
