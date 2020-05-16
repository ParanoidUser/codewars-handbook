interface Solution {
  static String camelCase(String input) {
    return input.replaceAll("([A-Z])", " $1");
  }
}