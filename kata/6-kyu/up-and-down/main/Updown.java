import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface Updown {
  static String arrange(String strng) {
    var words = strng.split(" ");
    for (var i = 1; i < words.length; i++) {
      if (i % 2 == 0 && words[i].length() > words[i - 1].length() || i % 2 != 0 && words[i].length() < words[i - 1].length()) {
        var tmp = words[i];
        words[i] = words[i - 1];
        words[i - 1] = tmp;
      }
    }
    return range(0, words.length).mapToObj(i -> i % 2 != 0 ? words[i].toUpperCase() : words[i].toLowerCase()).collect(joining(" "));
  }
}
