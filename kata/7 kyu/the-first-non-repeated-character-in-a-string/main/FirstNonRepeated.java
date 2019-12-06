class FirstNonRepeated {
  static Character firstNonRepeated(String source) {
    for (char ch : source.toCharArray()) {
      if (source.indexOf(ch) == source.lastIndexOf(ch)) return ch;
    }
    return 0;
  }
}
