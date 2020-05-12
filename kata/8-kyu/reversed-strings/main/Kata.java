interface Kata {
  static String solution(String str) {
    return new StringBuilder(str).reverse().toString();
  }
}
