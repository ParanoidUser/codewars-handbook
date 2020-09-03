interface Vowels {
  static int getCount(String str) {
    return str.replaceAll("(?i)[^aeiou]", "").length();
  }
}
