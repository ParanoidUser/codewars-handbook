import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface Solution {
  static String rangeExtraction(int[] arr) {
    return arr[0] + range(1, arr.length).mapToObj(i -> (arr[i - 1] == arr[i] - 1 ? "~" : ",") + arr[i])
        .collect(joining()).replaceAll("~([^,]+)~+", "-").replace("~", ",");
  }
}