interface Factorial {
  static long factorial(int n) {
    return n > 1 ? n * factorial(n - 1) : 1;
  }
}
