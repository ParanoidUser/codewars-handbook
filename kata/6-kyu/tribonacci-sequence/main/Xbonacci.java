import java.util.Arrays;

class Xbonacci {
  double[] tribonacci(double[] s, int n) {
    s = Arrays.copyOf(s, n);
    for (var i = 3; i < n; i++) {
      s[i] = s[i - 1] + s[i - 2] + s[i - 3];
    }
    return s;
  }
}
