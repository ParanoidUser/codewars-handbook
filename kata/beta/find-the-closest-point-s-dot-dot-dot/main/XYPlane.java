import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.TreeMap;

interface XYPlane {
  static List<Point> findClosestPoints(Point origin, List<Point> points) {
    return points.stream().collect(groupingBy(origin::distanceTo, TreeMap::new, toList())).firstEntry().getValue();
  }
}