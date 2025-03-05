interface Kata {
  static String alternateCase(String string) {
    return string.chars().map(i -> Character.isLetter(i) ? (char) (i ^ 32) : i)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
  }
}
