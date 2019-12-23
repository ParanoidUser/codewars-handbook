class StringTask {
  static String perform(String word) {
    return word.toLowerCase().replaceAll("[aeiouy]", "").replaceAll(".", ".$0");
  }
}
