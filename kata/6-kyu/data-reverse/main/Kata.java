import static java.util.stream.IntStream.range;

interface Kata {
  static int[] DataReverse(int[] data) {
    return range(0, data.length).map(i -> data[data.length + 2 * (i % 8) - i - 8]).toArray();
  }
}
