interface Kata {
  static int[] solve(String word) {
    return new int[] {
        word.replaceAll("[^A-Z]", "").length(),
        word.replaceAll("[^a-z]", "").length(),
        word.replaceAll("\\D", "").length(),
        word.replaceAll("\\w", "").length()
    };
  }
}