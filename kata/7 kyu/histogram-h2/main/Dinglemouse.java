import static java.util.stream.IntStream.of;

class Dinglemouse {
  static String histogram(int[] results) {
    var graph = new StringBuilder();
    int sum = of(results).sum();
    for (int i = 5; i >= 0; i--) {
      graph.append(i + 1).append("|");
      if (results[i] > 0) {
        int percent = results[i] * 100 / sum;
        graph.append("\u2588".repeat(percent / 2)).append(" ").append(percent).append("%");
      }
      graph.append("\n");
    }
    return graph.toString();
  }
}
