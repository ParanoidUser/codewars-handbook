import java.util.Arrays;

interface Kata {
  static int consecutive(int[] arr) {
    Arrays.sort(arr);
    return arr.length > 0 ? arr[arr.length - 1] - arr[0] - arr.length + 1 : 0;
  }
}