import java.util.Arrays;

class Sum {
  static int arrayPlusArray(int[] arr1, int[] arr2) {
    return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
  }
}
