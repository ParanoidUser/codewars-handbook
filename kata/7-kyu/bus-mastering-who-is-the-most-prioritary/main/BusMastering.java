interface BusMastering {
  static String arbitrate(String input, int n) {
    return input.replaceAll("(?<=1)(0*)1", "$10");
  }
}
