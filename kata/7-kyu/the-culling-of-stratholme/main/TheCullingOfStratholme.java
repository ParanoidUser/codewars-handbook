interface TheCullingOfStratholme {
  static String purify(String s) {
    return s.replaceAll("\\w?[iI]+\\w?", "").replaceAll("\\s+", " ").trim();
  }
}