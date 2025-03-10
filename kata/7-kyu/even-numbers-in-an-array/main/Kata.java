interface Kata {
  static int[] evenNumbers(int[] arr, int n) {
    int[] evens = new int[n];
    for (int i = arr.length - 1; n > 0; i--) {
      if (arr[i] % 2 == 0) {
        evens[--n] = arr[i];
      }
    }
    return evens;
  }
}