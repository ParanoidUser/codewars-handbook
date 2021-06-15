import static java.util.stream.IntStream.range;

import java.awt.Point;

interface PeacefulYard {
  static boolean peacefulYard(String[] yard, int minDistance) {
    var catPoints = range(0, yard.length).boxed().flatMap(y ->
        range(0, yard[y].length()).boxed().filter(x -> yard[y].charAt(x) != '-')
            .map(x -> new Point(x, y))).toArray(Point[]::new);

    for (var i = 0; i < catPoints.length; i++) {
      for (var j = i + 1; j < catPoints.length; j++) {
        if (catPoints[i].distance(catPoints[j]) < minDistance) {
          return false;
        }
      }
    }
    return true;
  }
}
