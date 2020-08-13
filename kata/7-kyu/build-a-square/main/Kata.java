interface Kata {
  static String generateShape(int n) {
    return ("+".repeat(n) + '\n').repeat(n).trim();
  }
}
