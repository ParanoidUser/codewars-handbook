interface Kata {
  static String simpleTransposition(String text) {
    var trans = new StringBuilder();
    for (var i = 0; i < text.length(); i += 2) {
      trans.insert(i / 2, text.charAt(i)).append(i < text.length() - 1 ? text.charAt(i + 1) : "");
    }
    return trans.toString();
  }
}
