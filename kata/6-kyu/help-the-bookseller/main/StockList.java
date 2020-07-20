import static java.util.Arrays.stream;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.summingInt;

interface StockList {
  static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
    if (lstOfArt.length > 0 && lstOf1stLetter.length > 0) {
      var counts = stream(lstOfArt).collect(groupingBy(s -> s.substring(0, 1), summingInt(s -> Integer.parseInt(s.split(" ")[1]))));
      return stream(lstOf1stLetter).map(s -> "(" + s + " : " + counts.getOrDefault(s, 0) + ")").collect(joining(" - "));
    }
    return "";
  }
}
