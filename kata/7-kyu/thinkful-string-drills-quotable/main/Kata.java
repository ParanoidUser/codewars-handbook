interface Kata {
  static String quotable(String name, String quote) {
    return "%s said: \"%s\"".formatted(name, quote);
  }
}