interface Kata {
  static int[] solve(String word) {
    return new int[] {
        word.replaceAll("[^A-Z]", "").length(),
        word.replaceAll("[^a-z]", "").length(),
        word.replaceAll("[^0-9]", "").length(),
        word.replaceAll("\\w", "").length()
    };
  }
}