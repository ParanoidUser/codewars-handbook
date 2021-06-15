class FindIndexOfSubArray {
  final int[] arr;
  final boolean disc;

  FindIndexOfSubArray(int[] arr) {
    this.arr = arr;
    disc = arr[arr.length - 1] - arr[0] < 0;
  }

  int[] findIndexOfSubArray() {
    var bounds = new int[]{arr.length, 0};
    for (var i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (disc && arr[i] < arr[j] || !disc && arr[i] > arr[j]) {
          bounds[0] = Math.min(i, bounds[0]);
          bounds[1] = Math.max(j, bounds[1]);
        }
      }
    }
    return bounds[0] < arr.length ? bounds : new int[2];
  }
}
