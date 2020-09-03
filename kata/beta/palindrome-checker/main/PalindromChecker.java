class PalindromChecker {
  boolean isPalindrome(String str) {
    str = str == null ? "no" : str.toLowerCase().replaceAll("[^a-z0-9]", "");
    return new StringBuilder(str).reverse().toString().equals(str);
  }
}