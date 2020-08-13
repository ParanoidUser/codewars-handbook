interface JomoPipi {
  static String antiString(String str) {
    return str.chars()
        .map(c -> (char) ((c < 'A' ? 105 : 187) - c))
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .reverse().toString();
  }
}
