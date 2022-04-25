import java.util.Arrays;

interface BitMarchArray {
  static int[][] bitMarch(int n) {
    var march = new int[9 - n][8];
    for (var i = 0; i < march.length; i++) {
      Arrays.fill(march[i], 8 - i - n, 8 - i, 1);
    }
    return march;
  }
}
