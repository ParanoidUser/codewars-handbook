interface MultilineMaker {
  static String make(String n, String s) {
    return String.format("String %s=\"%s\";", n, s.replaceAll("[\\\\\"]", "\\\\$0").replace("\n", "\\n\"+\n\""));
  }
}