interface CollatzConjecture {
  static int hotpo(int n) {
    return n > 1 ? hotpo(n % 2 > 0 ? 3 * n + 1 : n / 2) + 1 : 0;
  } 
}