interface Kata {
  static boolean hasUniqueChars(String str) {
    return str.length() == str.chars().distinct().count();
  }
}