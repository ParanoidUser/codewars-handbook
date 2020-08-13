interface PizzaPayments {
  static double michaelPays(double cost) {
    return Math.round(100 * (cost > 5 ? cost - Math.min(10, cost / 3) : cost)) / 100.;
  }
}
