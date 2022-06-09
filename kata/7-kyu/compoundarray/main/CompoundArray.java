interface CompoundArray {
  static int[] compoundArray(int[] a, int[] b) {
    var c = new int[a.length + b.length];
    int i = 0;
    for (int j = 0; i < c.length; j++) {
      if (j < a.length) c[i++] = a[j];
      if (j < b.length) c[i++] = b[j];
    }
    return c;
  }
}
