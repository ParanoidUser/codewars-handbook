interface InParts {
  static String splitInParts(String s, int partLength) {
    return s.replaceAll("(.{" + partLength + "})(?!$)", "$1 ");
  }
}
