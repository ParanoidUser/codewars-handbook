import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static int[][] pyramid(int n) {
    return rangeClosed(1, n).mapToObj(i -> rangeClosed(1, i).map(j -> 1).toArray()).toArray(int[][]::new);
  }
}