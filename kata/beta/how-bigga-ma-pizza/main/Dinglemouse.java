interface Dinglemouse {
  static double howBiggaMaPizza(double blob, String crust) {
    return Math.sqrt(Math.pow(blob, 3) / ("thick".equals(crust) ? 30 : 6));
  }
}