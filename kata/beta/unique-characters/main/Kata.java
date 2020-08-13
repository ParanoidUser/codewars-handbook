interface Kata {
  static boolean hasUniqueChars(String str) {
    return str.chars().distinct().count() == str.length();
  }
}
