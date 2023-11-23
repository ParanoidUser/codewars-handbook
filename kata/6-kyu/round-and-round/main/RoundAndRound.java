interface RoundAndRound {
  static double roundTo2DecimalPlaces(double number) {
    return Double.parseDouble(String.format("%.2f", number));
  }
}