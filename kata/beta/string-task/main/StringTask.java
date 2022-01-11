interface StringTask {
  static String perform(String word) {
    return word.toLowerCase().replaceAll("[aeiouy]", "").replaceAll("([a-z])", ".$1");
  }
}
