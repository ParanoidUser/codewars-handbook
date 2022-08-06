interface BatmanQuotes {
  static String getQuote(String[] quotes, String hero) {
    return (hero.startsWith("B") ? "Batman" : hero.startsWith("R") ? "Robin" : "Joker") + ": " + quotes[hero.replaceAll("\\D", "").charAt(0) - 48];
  }
}
