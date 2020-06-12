interface CamelCaseTranslator {
  static String toUnderScore(String name) {
    return name.replaceAll("(?<=[^_-])_?(?=[A-Z])|(?<=[^\\d_])_?(?=\\d)", "_");
  }
}
