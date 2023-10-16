import java.util.Arrays;

interface Solution {
  static int[] trouble(int[] x, int t) {
    int n = 1;
    for (int i = 1; i < x.length; i++) {
      if (x[n - 1] + x[i] != t) {
        x[n++] = x[i];
      }
    }
    return Arrays.copyOf(x, n);
  }
}