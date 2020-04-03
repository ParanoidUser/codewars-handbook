import static java.util.stream.IntStream.of;

class SortArray {
  static int[] sortArray(int[] ar) {
    return of(ar).sorted().toArray();
  }
}