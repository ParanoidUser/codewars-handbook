interface Lucas {
  static int lucasnum(int n) {
    return n < 0 ? -lucasnum(++n) + lucasnum(++n) : n < 1 ? 2 : n < 2 ? 1 : lucasnum(--n) + lucasnum(--n);
  }
}
