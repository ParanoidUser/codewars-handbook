interface StringCombiner {
  static String combineNames(String first, String last) {
    return String.format("%s %s", first, last);
  }
}