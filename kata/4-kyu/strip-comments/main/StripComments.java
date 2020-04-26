interface StripComments {
  static String stripComments(String text, String[] commentSymbols) {
    return text.replaceAll("\\h*[" + String.join("", commentSymbols) + "].*(\\n?)", "$1")
               .replaceAll("\\h(\\n)", "$1")
               .replaceAll("\\h+\\z", "");
  }
}
