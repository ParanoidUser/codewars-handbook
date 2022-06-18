import static java.util.Arrays.sort;

interface WaveSorter {
  static void waveSort(int[] array) {
    sort(array);
    for (int i = 0; i < array.length - 1; i += 2) {
      int swap = array[i];
      array[i] = array[i + 1];
      array[i + 1] = swap;
    }
  }
}