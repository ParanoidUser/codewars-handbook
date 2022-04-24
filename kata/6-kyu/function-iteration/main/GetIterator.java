import java.util.function.Function;
import java.util.function.UnaryOperator;

interface GetIterator {
  static Function<Integer, Integer> getIterator(UnaryOperator<Integer> func, int times) {
    return times > 1 ? func.andThen(getIterator(func, --times)) : func;
  }
}
