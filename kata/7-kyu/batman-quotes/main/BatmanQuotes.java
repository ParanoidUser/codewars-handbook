interface BatmanQuotes {
  static String getQuote(String[] quotes, String hero) {
    return (hero.startsWith("B") ? "Batman" : hero.startsWith("R") ? "Robin" : "Joker") + ": " + quotes[hero.replaceAll("[^\\d]", "").charAt(0) - 48];
  }
}
