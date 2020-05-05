interface Numbers {
  static double TwoDecimalPlaces(double number) {
    return Math.round(number * 100) / 100.0;
  }
}
