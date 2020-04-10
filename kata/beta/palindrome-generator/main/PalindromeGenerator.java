class PalindromeGenerator {
  static boolean isPalindrome(String word) {
    return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
  }

  static String generateString(String word) {
    return word + new StringBuilder(isPalindrome(word) ? "" : word).reverse().toString();
  }
}
