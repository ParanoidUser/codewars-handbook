interface Kata {
  static String autocorrect(String input) {
    return input.replaceAll("\\b(?i:u|you+)\\b", "your sister");
  }
}
