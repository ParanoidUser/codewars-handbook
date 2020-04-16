import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

class ArrayPrinter {
  static String printArray(Object[] array) {
    return stream(array).map(Object::toString).collect(joining(","));
  }
}
