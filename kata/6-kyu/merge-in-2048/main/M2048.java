interface M2048 {
  static int[] merge(int[] line) {
    int[] shrink = new int[line.length];
    for (int i = 0, j = 0, m = 0; i < line.length; i++) {
      if (m < 0 && line[i] == shrink[j - 1]) {
        shrink[m = j - 1] *= 2;
      } else if (line[i] > 0) {
        m -= 2048 - (shrink[j++] = line[i]);
      }
    }
    return shrink;
  }
}