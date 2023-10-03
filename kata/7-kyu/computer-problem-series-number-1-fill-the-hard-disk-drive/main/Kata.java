import static java.util.stream.IntStream.range;

interface Kata {
  static long save(int[] sizes, int hd) {
    return range(0, sizes.length).takeWhile(i -> (sizes[0] += i > 0 ? sizes[i] : 0) <= hd).count();
  }
}