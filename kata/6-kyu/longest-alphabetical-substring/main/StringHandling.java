interface StringHandling {
  static String longestAlpabeticalSubstring(String text) {
    int start = 0;
    int offset = 0;
    int j = 0;
    for (int i = 1; i < text.length(); i++) {
      if (text.charAt(i - 1) > text.charAt(i)) {
        j = i;
      }
      else if (i - j > offset - start) {
        start = j;
        offset = i;
      }
    }
    return text.substring(start, offset + 1);
  }
}
