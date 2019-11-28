import static java.util.Arrays.stream;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.joining;

public class Solution {
  public static long maxNumber(long n) {
    return Long.parseLong(stream(("" + n).split("")).sorted(reverseOrder()).collect(joining()));
  }
}
