interface Palindrome {
  static boolean isPalindrome(String x) {
    return new StringBuilder(x).reverse().toString().equalsIgnoreCase(x);
  }
}