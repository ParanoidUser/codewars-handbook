interface Kata {
  static String ticker(String text, int width, int tick) {
    tick %= (width + text.length());
    return (" ".repeat(width) + text + " ".repeat(width)).substring(tick, tick + width);
  }
}