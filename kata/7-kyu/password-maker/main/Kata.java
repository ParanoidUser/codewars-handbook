interface Kata {
  static String makePassword(String phrase) {
    return phrase
        .replaceAll("\\s*(\\w)\\w+", "$1")
        .replaceAll("[oO]", "0")
        .replaceAll("[iI]", "1")
        .replaceAll("[sS]", "5");
  }
}