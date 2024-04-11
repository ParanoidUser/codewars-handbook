import static java.util.stream.IntStream.range;

interface CodeWars {
  static int[][] matrix(int[][] array) {
    return range(0, array.length).peek(i -> array[i][i] = array[i][i] < 0 ? 0 : 1).mapToObj(i -> array[i]).toArray(int[][]::new);
  }
}