interface Solution {
  static String isSmooth(long n) {
    for (var i = 2; i < 8; i++) {
      while (n % i == 0) n /= i;

      if (n == 1 && i == 2) return "power of 2";
      if (n == 1 && i == 3) return "3-smooth";
      if (n == 1 && i == 5) return "Hamming number";
      if (n == 1) return "humble number";
    }
    return "non-smooth";
  }
}
