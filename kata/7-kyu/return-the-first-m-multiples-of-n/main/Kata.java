import static java.util.stream.IntStream.iterate;

class Kata {
  static int[] multiples(int m, int n) {
    return iterate(n, i -> i + n).limit(m).toArray();
  }
}
