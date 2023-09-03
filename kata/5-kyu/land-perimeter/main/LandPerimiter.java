import static java.util.stream.IntStream.range;

interface LandPerimiter {
  static String landPerimeter(String[] arr) {
    return "Total land perimeter: " + range(0, arr.length).flatMap(i -> range(0, arr[i].length()).map(
      j -> i > 0 && arr[i - 1].charAt(j) == 'X' && j > 0 && arr[i].charAt(j - 1) == 'X' || arr[i].charAt(j) == 'O' ? 0 :
           i > 0 && arr[i - 1].charAt(j) == 'X' ? 2 : j > 0 && arr[i].charAt(j - 1) == 'X' ? 2 : 4)).sum();
  }
}