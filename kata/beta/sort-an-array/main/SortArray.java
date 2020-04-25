import static java.util.stream.IntStream.of;

interface SortArray {
  static int[] sortArray(int[] ar) {
    return of(ar).sorted().toArray();
  }
}