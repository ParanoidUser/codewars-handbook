interface FibonacciRabbits {
  static int fibRabbits(int n, int b) {
    return n > 1 ? fibRabbits(--n, b) + fibRabbits(--n, b) * b : n;
  }
}