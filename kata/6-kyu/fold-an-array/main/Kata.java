import static java.util.Arrays.copyOfRange;

interface Kata {
  static int[] foldArray(int[] array, int runs) {
    int[] folded = copyOfRange(array, 0, Math.round(array.length / 2.0f));
    for (var i = 0; i < array.length / 2; i++) {
      folded[i] = array[i] + array[array.length - i - 1];
    }
    return runs > 1 ? foldArray(folded, --runs) : folded;
  }
}
