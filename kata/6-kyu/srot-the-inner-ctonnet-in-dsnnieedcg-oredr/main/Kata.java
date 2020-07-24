import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

import java.util.ArrayList;

interface Kata {
  static String sortTheInnerContent(String words) {
    var reversed = new ArrayList<String>();
    for (var word : words.split(" ")) {
      if (word.length() > 3) {
        word = word.charAt(0) + of(word.substring(1, word.length() - 1).split("")).sorted(reverseOrder()).collect(joining())+ word.charAt(word.length() - 1);
      }
      reversed.add(word);
    }
    return String.join(" ", reversed);
  }
}
