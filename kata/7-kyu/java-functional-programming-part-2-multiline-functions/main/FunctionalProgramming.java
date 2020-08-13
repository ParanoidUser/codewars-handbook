import java.util.function.ToDoubleFunction;

final class FunctionalProgramming {
  private FunctionalProgramming() {}

  static final ToDoubleFunction<Triangle> f = t -> {
    t.setArea(.5 * t.height * t.base);
    return t.getArea();
  };
}
