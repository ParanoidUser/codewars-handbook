interface PigLatin {
  static String pigIt(String str) {
    return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
  }
}