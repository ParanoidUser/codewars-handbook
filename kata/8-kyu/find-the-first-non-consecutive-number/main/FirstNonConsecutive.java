import static java.util.stream.IntStream.range;

interface FirstNonConsecutive {
  static Integer find(int[] array) {
    return range(1, array.length).filter(i -> array[i] - array[i - 1] != 1).mapToObj(i -> array[i]).findFirst().orElse(null);
  }
}
