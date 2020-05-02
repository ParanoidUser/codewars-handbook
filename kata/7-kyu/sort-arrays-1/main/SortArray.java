import java.util.Arrays;

interface SortArray {
  static <T> T sortArray(T array) {
    if (array instanceof int[]) {
      Arrays.sort((int[]) array);
    } else if (array instanceof long[]) {
      Arrays.sort((long[]) array);
    } else if (array instanceof float[]) {
      Arrays.sort((float[]) array);
    } else if (array instanceof double[]) {
      Arrays.sort((double[]) array);
    } else {
      Arrays.sort((Object[]) array);
    }
    return array;
  }
}
