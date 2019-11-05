class Maps {
  static int[] map(int[] arr) {
    return java.util.Arrays.stream(arr).map(i -> 2 * i).toArray();
  }
}
