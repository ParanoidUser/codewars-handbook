class Kata {
  static double fuelPrice(int litres, double price) {
    return litres * (price - Math.min(litres / 2 * 0.05, 0.25));
  }
}
