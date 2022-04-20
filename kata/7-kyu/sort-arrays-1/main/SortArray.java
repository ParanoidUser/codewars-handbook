import java.util.Arrays;

interface SortArray {
  static <T> T sortArray(T array) {
    if (array instanceof int[] ints) {
      Arrays.sort(ints);
    } else if (array instanceof long[] longs) {
      Arrays.sort(longs);
    } else if (array instanceof float[] floats) {
      Arrays.sort(floats);
    } else if (array instanceof double[] doubles) {
      Arrays.sort(doubles);
    } else {
      Arrays.sort((Object[]) array);
    }
    return array;
  }
}
