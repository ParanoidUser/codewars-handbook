import java.util.ArrayList;
import java.util.List;

interface Kata {
  static List<String> maxMatch(String sentence) {
    var words = new ArrayList<String>();
    for (int i = sentence.length(); i > 0; i--) {
      var w = sentence.substring(0, i);
      if (i == 1 || Preloaded.VALID_WORDS.contains(w)) {
        words.add(w);
        words.addAll(maxMatch(sentence.substring(i)));
        break;
      }
    }
    return words;
  }
}