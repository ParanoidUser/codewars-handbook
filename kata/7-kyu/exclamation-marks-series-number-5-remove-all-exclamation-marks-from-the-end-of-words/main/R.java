interface R {
  static String removeBang(String str) {
    return str.replaceAll("\\b!+", "");
  }
}
