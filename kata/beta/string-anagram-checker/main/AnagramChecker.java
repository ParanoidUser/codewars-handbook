interface AnagramChecker {
  static boolean isAnagram(String first, String second) {
    for (var i = 0; first != null && second != null && i < first.length(); i++) {
      second = second.replaceFirst("" + first.charAt(i), "");
    }
    return second != null && second.isEmpty();
  }
}