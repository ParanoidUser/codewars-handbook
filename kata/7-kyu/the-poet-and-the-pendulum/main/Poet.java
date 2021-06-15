import static java.util.Arrays.sort;

interface Poet {
  static int[] pendulum(int[] values) {
    sort(values);
    var result = new int[values.length];
    for (int i = 0, l = (values.length - 1) / 2, r = l; i < result.length; i++) {
      result[i % 2 == 0 ? l-- : ++r] = values[i];
    }
    return result;
  }
}
