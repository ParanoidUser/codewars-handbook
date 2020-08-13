interface Troll {
  static String disemvowel(String str) {
    return str.replaceAll("(?i)[aeiou]", "");
  }
}
