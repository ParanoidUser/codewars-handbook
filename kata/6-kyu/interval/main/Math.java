import static java.util.stream.IntStream.of;

interface Math {
  static int[] interval(int[] arr, String str) {
    if (str.isEmpty()) {
      return new int[0];
    }
    int from = Integer.parseInt(str.replaceAll(".(-?\\d+),(-?\\d+).", "$1")) - (str.startsWith("[") ? 1 : 0);
    int to = Integer.parseInt(str.replaceAll("^.(-?\\d+),(-?\\d+).$", "$2")) + (str.endsWith("]") ? 1 : 0);
    return of(arr).filter(i -> i > from && i < to).sorted().toArray();
  }
}