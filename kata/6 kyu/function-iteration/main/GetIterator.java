import java.util.function.Function;

class GetIterator {
  static Function<Integer, Integer> getIterator(Function<Integer, Integer> func, int times) {
    return times > 1 ? func.andThen(getIterator(func, --times)) : func;
  }
}
