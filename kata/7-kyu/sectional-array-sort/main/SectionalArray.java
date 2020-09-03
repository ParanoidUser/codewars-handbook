import java.util.Arrays;

interface SectionalArray {
  static int[] sort(int[] array, int start, int... length) {
    Arrays.sort(array, start, length.length > 0 && start + length[0] < array.length ? start + length[0] : array.length);
    return array;
  }
}
