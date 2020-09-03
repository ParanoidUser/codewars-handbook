import static java.util.stream.IntStream.iterate;

interface Kata {
  static int[] multiples(int m, int n) {
    return iterate(n, i -> i + n).limit(m).toArray();
  }
}
