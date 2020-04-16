import java.util.Arrays;

class Kata {
  static int[] checkIsContained(int[][] mat1, int[][] mat2) {
    int cnt = 0;
    for (int i = 0; i < mat1.length - 2; i++) {
      for (int j = 0; j < mat1[i].length - 2; j++) {
        for (int k = 0; k < 3; k++) {
          if (Arrays.equals(Arrays.copyOfRange(mat1[i + k], j, j + 3), mat2[k])) {
            cnt++;
          } else {
            cnt = 0;
            break;
          }
          if (cnt == 3) {
            return new int[] {i, j};
          }
        }
      }
    }
    return new int[] {-1, -1};
  }
}
