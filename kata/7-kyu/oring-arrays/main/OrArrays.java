import static java.util.stream.IntStream.range;

interface OrArrays {
  static int[] orArrays(int[] arr1, int[] arr2, int... params) {
    int def = params.length == 0 ? 0 : params[0];
    return range(0, Math.max(arr1.length, arr2.length))
        .map(i -> (i < arr1.length ? arr1[i] : def) | (i < arr2.length ? arr2[i] : def))
        .toArray();
  }
}
