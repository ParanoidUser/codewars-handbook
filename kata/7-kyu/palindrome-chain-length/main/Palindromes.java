interface Palindromes {
  static int palindromeChainLength(long n) {
    var r = Long.parseLong(new StringBuilder(n + "").reverse() + "");
    return (r + "").equals(n + "") ? 0 : palindromeChainLength(n + r) + 1;
  }
}
