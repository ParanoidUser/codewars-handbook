import java.util.Collection;

interface ShapeUtilities {
  static double sumAllAreas(Collection<? extends Shape> shapes) {
    return shapes.stream().mapToDouble(Shape::getArea).sum();
  }
}