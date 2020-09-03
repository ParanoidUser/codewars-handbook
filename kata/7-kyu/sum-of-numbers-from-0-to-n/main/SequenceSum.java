import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;

interface SequenceSum {
  static String showSequence(int value) {
    return value < 0 ? value + "<0"
        : rangeClosed(0, value).mapToObj(i -> i + "").collect(joining("+")) + (value < 1 ? "=" : " = ") + value * (value + 1) / 2;
  }
}
