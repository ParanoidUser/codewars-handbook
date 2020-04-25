interface NewYear {
  static int yakim(String words) {
    return words.replaceAll("[^A-z]", "").length();
  }
}