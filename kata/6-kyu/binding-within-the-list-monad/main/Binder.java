import java.util.List;
import java.util.function.Function;

class Binder<T, I> {
  List<I> bind(List<T> list, Function<T, List<I>> func) {
    return list.stream().map(func).flatMap(List::stream).toList();
  }
}
