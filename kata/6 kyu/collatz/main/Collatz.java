class Collatz {
  static String collatz(int n) {
    return n > 0 ? n + "->" + collatz(n % 2 == 0 ? n / 2 : 3 * n + 1) : "0";
  }
}
