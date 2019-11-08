import java.util.Arrays;

class ZywOo {
  static int[] take(int[] arr, int n) {
    return Arrays.stream(arr).limit(n).toArray();
  }
}
