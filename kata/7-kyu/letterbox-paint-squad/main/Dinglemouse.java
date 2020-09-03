import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;

interface Dinglemouse {
  static int[] paintLetterboxes(int start, int end) {
    String seq = rangeClosed(start, end).mapToObj(n -> "" + n).collect(joining());
    return rangeClosed(0, 9).map(i -> seq.length() - seq.replace("" + i, "").length()).toArray();
  }
}
