import java.util.Arrays;

class Kata {
 static int squareSum(int[] n) {
    return Arrays.stream(n).map(i -> i * i).sum();
  }
}
