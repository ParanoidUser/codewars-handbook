interface SentenceCalculator {
  static int lettersToNumbers(String s) {
    return s.replaceAll("\\W", "").chars().map(c -> c < 48 ? 0 : c < 58 ? c - 48 : c < 91 ? 2 * (c - 64) : c - 96).sum();
  }
}