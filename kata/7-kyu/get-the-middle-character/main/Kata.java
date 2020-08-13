interface Kata {
  static String getMiddle(String word) {
    return word.substring((int) Math.ceil(word.length() / 2.) - 1, word.length() / 2 + 1);
  }
}
