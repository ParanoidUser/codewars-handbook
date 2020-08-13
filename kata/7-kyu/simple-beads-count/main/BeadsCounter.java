interface BeadsCounter {
  static int countRedBeads(int nBlue) {
    return nBlue < 2 ? 0 : 2 * nBlue - 2;
  }
}
