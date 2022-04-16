interface Kata {
  static boolean isVeryEvenNumber(int n) {
    return n == 0 || --n % 9 % 2 > 0;
  }
}