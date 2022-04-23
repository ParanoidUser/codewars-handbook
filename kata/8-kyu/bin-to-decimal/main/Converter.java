interface Converter {
  static int binToDecimal(String binary) {
    return Integer.parseInt(binary, 2);
  }
}