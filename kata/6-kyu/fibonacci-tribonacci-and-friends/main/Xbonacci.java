import java.util.Arrays;

class Xbonacci {
  double[] xbonacci(double[] signature, int n) {
    var result = Arrays.copyOf(signature, n);
    for (int i = signature.length; i < n; i++) {
      result[i] = Arrays.stream(result, i - signature.length, i).sum();
    }
    return result;
  }
}
