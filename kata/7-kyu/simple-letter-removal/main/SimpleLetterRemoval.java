interface SimpleLetterRemoval {
  static String solve(String s, int k) {
    for (int c : s.chars().sorted().limit(k).toArray()) {
      s = s.replaceFirst((char) c + "", "");
    }
    return s;
  }
}
