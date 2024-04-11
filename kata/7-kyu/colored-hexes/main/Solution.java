import static java.util.stream.Stream.of;

interface Solution {
  static String hexColor(String codes) {
    int[] rgb = codes.isEmpty() ? new int[3] : of(codes.split(" ")).mapToInt(Integer::parseInt).toArray();
    int max = Math.max(rgb[0], Math.max(rgb[1], rgb[2]));
    int i = max > 0 ? (rgb[0] == max ? 1 : 0) | (rgb[1] == max ? 2 : 0) | (rgb[2] == max ? 4 : 0) : 0;
    return new String[]{"black", "red", "green", "yellow", "blue", "magenta", "cyan", "white"}[i];
  }
}