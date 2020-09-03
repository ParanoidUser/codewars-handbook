import static java.util.Comparator.comparingInt;
import static java.util.stream.IntStream.range;

interface Kata {
  static int[] sortByValueAndIndex(int[] array) {
    return range(0, array.length).boxed().sorted(comparingInt(i -> (i + 1) * array[i])).mapToInt(i -> array[i]).toArray();
  }
}
