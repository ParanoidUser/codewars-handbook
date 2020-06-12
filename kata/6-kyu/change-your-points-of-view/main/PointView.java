import java.awt.Point;
import java.util.function.Function;

interface PointView {
  static Function<Void, Point> point(Integer x, Integer y) {
    return nil -> new Point(x, y);
  }

  static Integer fst(Function<Void, Point> pt) {
    return pt.apply(null).x;
  }

  static Integer snd(Function<Void, Point> pt) {
    return pt.apply(null).y;
  }

  static int sqrDist(Function<Void, Point> pt1, Function<Void, Point> pt2) {
    int dx = fst(pt2) - fst(pt1);
    int dy = snd(pt2) - snd(pt1);
    return dx * dx + dy * dy;
  }

  static int[] line(Function<Void, Point> pt1, Function<Void, Point> pt2) {
    int l = snd(pt1) - snd(pt2);
    int m = fst(pt2) - fst(pt1);
    return new int[] {l, m, -(l * fst(pt1) + m * snd(pt1))};
  }
}
