import java.util.function.ToDoubleFunction;

class FunctionalProgramming {
 static ToDoubleFunction<Triangle> f = t -> {
   t.setArea(.5 * t.height * t.base);
   return t.getArea();
 };
}
