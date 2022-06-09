import static java.util.Arrays.sort;

interface Poet {
  static int[] pendulum(int[] values) {
    sort(values);
    var result = new int[values.length];
    int l = (values.length - 1) / 2;
    int r = l;
    for (int i = 0; i < result.length; i++) {
      result[i % 2 == 0 ? l-- : ++r] = values[i];
    }
    return result;
  }
}
