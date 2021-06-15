interface Dinglemouse {
  static String histogram(int[] results) {
    var graph = new StringBuilder();
    for (var i = 5; i >= 0; i--) {
      graph.append(i + 1).append("|");
      if (results[i] > 0) {
        graph.append("#".repeat(results[i])).append(" ").append(results[i]);
      }
      graph.append("\n");
    }
    return graph.toString();
  }
}
