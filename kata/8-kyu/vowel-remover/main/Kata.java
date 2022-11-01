interface Kata {
  static String shortcut(String input) {
    return input.replaceAll("[aeiou]", "");
  }
}