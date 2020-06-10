interface Solution {
  static boolean isAlt(String word) {
    return word.matches("[aeiou]?([^aeiou][aeiou])*[^aeiou]?");
  }
}
