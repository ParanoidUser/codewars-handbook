interface M2048 {
  static int[] merge(int[] line) {
    var shrink = new int[line.length];
    int j = 0;
    int m = 0;
    for (int l : line) {
      if (m < 0 && l == shrink[j - 1]) {
        m = j - 1;
        shrink[m] *= 2;
      } else if (l > 0) {
        shrink[j++] = l;
        m -= 2048 - l;
      }
    }
    return shrink;
  }
}