import java.util.Arrays;

interface Kata {
  static int[] checkIsContained(int[][] mat1, int[][] mat2) {
    for (var i = 0; i < mat1.length - 2; i++) {
      for (var j = 0; j < mat1[i].length - 2; j++) {
        if (Arrays.equals(Arrays.copyOfRange(mat1[i], j, j + 3), mat2[0])) {
          return new int[]{i, j};
        }
      }
    }
    return new int[]{-1, -1};
  }
}
