import java.util.Arrays;

interface Kata {
  static long[] wheatFromChaff(long[] values) {
    values = Arrays.copyOf(values, values.length);
    int r = values.length - 1;
    for (int l = 0; l < r; l++) {
      while (values[l] > 0 && l < r) {
        if (values[r--] < 0) {
          long temp = values[l];
          values[l] += values[r + 1] - temp;
          values[r + 1] = temp;
        }
      }
    }
    return values;
  }
}
