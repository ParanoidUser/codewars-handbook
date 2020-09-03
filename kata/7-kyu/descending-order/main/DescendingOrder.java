import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.joining;

interface DescendingOrder {
  static int sortDesc(int num) {
    return Integer.parseInt(("" + num).chars().mapToObj(i -> "" + (char) i).sorted(reverseOrder()).collect(joining()));
  }
}
