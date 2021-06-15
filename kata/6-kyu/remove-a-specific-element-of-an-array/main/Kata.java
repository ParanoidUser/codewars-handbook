import static java.util.stream.IntStream.of;

import java.util.HashSet;

interface Kata {
  static int[][] selectSubarray(int[] arr) {
    var sum = of(arr).sum();
    var prod = of(arr).mapToDouble(Math::abs).reduce(1, (a, b) -> a * b);

    double min = prod;
    var idx = new HashSet<Integer>();
    for (var i = 0; i < arr.length; i++) {
      var q = Math.abs(prod / arr[i] / (sum == arr[i] ? 1 : sum - arr[i]));
      if (q < min) {
        min = q;
        idx.clear();
      }
      if (q == min) {
        idx.add(i);
      }
    }
    return idx.stream().map(i -> new int[]{i, arr[i]}).toArray(int[][]::new);
  }
}