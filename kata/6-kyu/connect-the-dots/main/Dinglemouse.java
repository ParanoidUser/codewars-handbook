import static java.util.Comparator.comparingInt;
import static java.util.stream.IntStream.range;

interface Dinglemouse {
  static String connectTheDots(String paper) {
    var conn = new StringBuilder(paper);
    var dots = range(0, paper.length()).boxed().filter(i -> paper.charAt(i) > 96).sorted(comparingInt(paper::charAt)).toList();
    for (int i = 0, l = paper.indexOf('\n') + 1; i < dots.size() - 1; i++) {
      int a = dots.get(i);
      int b = dots.get(i + 1);

      int dx = b / l - a / l;
      int dy = b % l - a % l;
      int d = (dx == 0 ? 0 : dx / Math.abs(dx) * l) + (dy == 0 ? 0 : dy / Math.abs(dy));

      conn.setCharAt(a, '*');
      while (a != b) {
        a += d;
        conn.setCharAt(a, '*');
      }
    }
    return conn.toString();
  }
}