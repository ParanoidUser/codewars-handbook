import static java.util.Arrays.stream;

import java.util.List;

interface InmutableList {
  static <E> List<E> alternativeOf(E... varargs) {
    return stream(varargs).toList();
  }
}