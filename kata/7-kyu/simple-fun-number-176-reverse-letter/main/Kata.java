interface Kata {
  static String reverseLetter(String str) {
    return new StringBuilder(str.replaceAll("[^a-z]", "")).reverse().toString();
  }
}