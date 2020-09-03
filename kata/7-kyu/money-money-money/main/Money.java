interface Money {
  static int calculateYears(double principal, double interest, double tax, double desired) {
    return (int) Math.ceil(Math.log(desired / principal) / Math.log(interest * (1 - tax) + 1));
  }
}
