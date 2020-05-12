import static java.util.stream.IntStream.iterate;

interface Sequence {
  static int[] reverse(int n) {
    return iterate(n, i -> --i).limit(n).toArray();
  }
}
