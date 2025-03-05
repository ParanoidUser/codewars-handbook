interface Kata {
  static String removeUrlAnchor(String url) {
    return url.replaceAll("#.*", "");
  }
}