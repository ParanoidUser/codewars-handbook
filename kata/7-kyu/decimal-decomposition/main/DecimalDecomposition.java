interface DecimalDecomposition {
  static String decimalDecomposition(int number) {
    int i = (("" + number).charAt(0) - '0') * (int) Math.pow(10, (int) Math.log10(number));
    return number == i ? i + "" : i + "+" + decimalDecomposition(number - i);
  }
}
