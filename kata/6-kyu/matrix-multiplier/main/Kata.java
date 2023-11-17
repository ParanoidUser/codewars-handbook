interface Kata {
  static double[][] getMatrixProduct(double[][] a, double[][] b) {
    if (a[0].length != b.length) {
      return null;
    }
    double[][] product = new double[a.length][b[0].length];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b[0].length; j++) {
        for (int k = 0; k < a[0].length; k++) {
          product[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    return product;
  }
}