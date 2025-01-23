import static java.util.stream.Stream.of;

import java.util.function.ToDoubleFunction;

interface HowManyPizzas {
  static int numberOfPizzasToOrder(String[] slicesOfPizza) {
    ToDoubleFunction<String> fr = s -> s.isEmpty() ? 0 : Double.parseDouble(s.split("/")[0]) / Integer.parseInt(s.split("/")[1]);
    return slicesOfPizza == null ? 0 : (int) Math.ceil(of(slicesOfPizza).mapToDouble(fr).sum());
  }
}