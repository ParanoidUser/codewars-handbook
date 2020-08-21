interface Consonants {
  static int getCount(String str) {
    return str.replaceAll("[^a-zA-Z]|[aeiou]", "").length();
  }
}
