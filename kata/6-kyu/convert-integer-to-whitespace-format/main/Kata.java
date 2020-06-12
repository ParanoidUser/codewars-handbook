interface Kata {
  static String whitespaceNumber(int n) {
    return (n > 0 ? ' ' : n < 0 ? '\t' : "") + Integer.toBinaryString(Math.abs(n)).replace('0', ' ').replace('1', '\t') + '\n';
  }
}
