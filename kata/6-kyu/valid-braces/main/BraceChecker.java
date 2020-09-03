class BraceChecker {
  boolean isValid(String braces) {
    for (int i = braces.length() / 2; i > 0; i--)
      braces = braces.replaceAll("\\(\\)|\\[]|\\{}", "");
    return braces.isEmpty();
  }
}
