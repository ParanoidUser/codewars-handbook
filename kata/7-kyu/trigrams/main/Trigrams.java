interface Trigrams {
  static String trigrams(String phrase) {
    var result = new StringBuilder();
    phrase = phrase.replace(" ", "_");
    for (var i = 0; i < phrase.length() - 2; i++) {
      result.append(phrase, i, i + 3).append(" ");
    }
    return result.toString().trim();
  }
}
