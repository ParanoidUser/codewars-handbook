interface Penta {
  static boolean pNum(long n) {
    return (Math.sqrt(24 * n + 1.) + 1) / 6 % 1 == 0;
  }

  static boolean gpNum(long n) {
    return Math.sqrt(24 * n + 1.) % 1 == 0;
  }

  static boolean spNum(long n) {
    return Math.sqrt(n) % 1 == 0 && pNum(n);
  }
}
