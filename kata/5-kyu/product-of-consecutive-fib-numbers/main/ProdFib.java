interface ProdFib {
  static long[] productFib(long prod) {
    long f1 = 0;
    long f2 = 1;
    while (f1 * f2 < prod) {
      f2 = f1 + f2;
      f1 = f2 - f1;
    }
    return new long[] {f1, f2, (f1 * f2 == prod ? 1 : 0)};
  }
}