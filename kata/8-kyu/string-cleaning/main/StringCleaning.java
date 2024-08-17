interface StringCleaning {
  static String stringClean(String text) {
    return text.replaceAll("\\d", "");
  }
}