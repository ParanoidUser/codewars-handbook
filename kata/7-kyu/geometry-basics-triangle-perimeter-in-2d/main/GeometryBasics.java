import java.util.function.ToDoubleBiFunction;

interface GeometryBasics {
  static double trianglePerimeter(Geometry.Triangle t) {
    ToDoubleBiFunction<Geometry.Point, Geometry.Point> dist = (p1, p2) -> Math.hypot(p2.x - p1.x, p2.y - p1.y);
    return dist.applyAsDouble(t.a, t.b) + dist.applyAsDouble(t.b, t.c) + dist.applyAsDouble(t.a, t.c);
  }
}
