interface Palindromes {
  static int longestPalindrome(String s) {
    var longest = 0;
    for (int len = s.length(); len > longest; len--) {
      for (var i = 0; i <= s.length() - len; i++) {
        var sub = s.substring(i, i + len);
        if (new StringBuilder(sub).reverse().toString().equals(sub)) {
          longest = len;
          break;
        }
      }
    }
    return longest;
  }
}
