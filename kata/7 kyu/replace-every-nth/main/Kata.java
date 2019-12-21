class Kata {
  static String replaceNth(String text, int n, char oldValue, char newValue) {
    if (n < 1) return text;
    var result = new StringBuilder();
    for (int i = 0, c = 0; i < text.length(); i++) {
      result.append(text.charAt(i) == oldValue && ++c % n == 0 ? newValue : text.charAt(i));
    }
    return result.toString();
  }
}
