import static java.util.stream.IntStream.of;

class Valley {
  static int[] makeValley(int[] arr) {
    var sorted = of(arr).sorted().toArray();
    for (int i = 0; i < sorted.length; i++) {
      arr[i % 2 == 0 ? i / 2 : arr.length - 1 - i / 2] = sorted[arr.length - i - 1];
    }
    return arr;
  }
}
