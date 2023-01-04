import static java.util.stream.IntStream.rangeClosed;

interface Multiplication {
  static int[][] multiplicationTable(int n) {
    return rangeClosed(1, n).mapToObj(i -> rangeClosed(1, n).map(j -> i * j).toArray()).toArray(int[][]::new);
  }
}