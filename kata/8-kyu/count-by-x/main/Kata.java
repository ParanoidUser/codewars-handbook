import static java.util.stream.IntStream.iterate;

interface Kata {
  static int[] countBy(int x, int n) {
    return iterate(x , i -> i + x).limit(n).toArray();
  }
}