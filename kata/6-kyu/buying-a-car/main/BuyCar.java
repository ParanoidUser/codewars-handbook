interface BuyCar {
  static int[] nbMonths(double priceOld, double priceNew, int savingsPerMonth, double lossByMonth) {
    int savings = 0;
    int months = 0;
    while (priceNew - priceOld > savings) {
      if (++months % 2 == 0) {
        lossByMonth += .5;
      }
      priceOld -= priceOld * lossByMonth / 100;
      priceNew -= priceNew * lossByMonth / 100;
      savings += savingsPerMonth;
    }
    return new int[] {months, (int) Math.round(priceOld - priceNew + savings)};
  }
}
