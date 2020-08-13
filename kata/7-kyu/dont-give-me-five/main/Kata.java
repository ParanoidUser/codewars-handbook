import static java.util.stream.IntStream.range;

interface Kata {
  static long dontGiveMeFive(int start, int end) {
    return range(start, ++end).filter(i -> !(i + "").contains("5")).count();
  }
}
