import static java.util.stream.IntStream.of;

interface Sum {
  static int arrayPlusArray(int[] arr1, int[] arr2) {
    return of(arr1).sum() + of(arr2).sum();
  }
}
