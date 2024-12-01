interface LoveVsFriendship {
  static int wordsToMarks (String text) {
    return text.chars().reduce(0, (s, c) -> s + c - 96);
  }
}