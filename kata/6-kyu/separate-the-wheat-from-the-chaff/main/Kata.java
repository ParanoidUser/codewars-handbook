import java.util.Arrays;

interface Kata {
  static long[] wheatFromChaff(long[] values) {
    values = Arrays.copyOf(values, values.length);
    for (int l = 0, r = values.length - 1; l < r; l++) {
      while (values[l] > 0 && l < r) {
        if (values[r--] < 0) {
          values[l] += values[r + 1] - (values[r + 1] = values[l]);
        }
      }
    }
    return values;
  }
}
