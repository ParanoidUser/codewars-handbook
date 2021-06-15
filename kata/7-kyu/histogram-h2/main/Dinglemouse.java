import static java.util.stream.IntStream.of;

interface Dinglemouse {
  static String histogram(int[] results) {
    var graph = new StringBuilder();
    int sum = of(results).sum();
    for (var i = 5; i >= 0; i--) {
      graph.append(i + 1).append("|");
      if (results[i] > 0) {
        int percent = results[i] * 100 / sum;
        graph.append("█".repeat(percent / 2)).append(" ").append(percent).append("%");
      }
      graph.append("\n");
    }
    return graph.toString();
  }
}
