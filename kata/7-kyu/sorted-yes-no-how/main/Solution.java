import static java.util.stream.IntStream.range;

interface Solution {
  static String isSortedAndHow(int[] array) {
    return range(1, array.length).noneMatch(i -> array[i - 1] > array[i]) ? "yes, ascending" :
           range(1, array.length).noneMatch(i -> array[i - 1] < array[i]) ? "yes, descending" : "no";
  }
}
