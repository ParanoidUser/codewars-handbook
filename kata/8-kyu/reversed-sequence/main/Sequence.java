import java.util.stream.IntStream;

class Sequence {
  static int[] reverse(int n) {
    return IntStream.iterate(n, i -> --i).limit(n).toArray();
  }
}
