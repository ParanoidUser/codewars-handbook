interface Consonants {
  static int getCount(String str) {
    return str.replaceAll("(?i)[^bcdfghj-np-tv-z]", "").length();
  }
}
