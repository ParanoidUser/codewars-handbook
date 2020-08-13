import static java.util.stream.Collectors.joining;
import static java.util.stream.LongStream.range;

interface Progression {
  static String arithmeticSequenceElements(int first, int step, long total) {
    return range(0, total).mapToObj(i -> first + step * i + "").collect(joining(", "));
  }
}
