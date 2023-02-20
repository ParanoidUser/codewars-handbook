import java.util.List;
import org.apache.commons.lang3.tuple.Pair;
import static org.apache.commons.lang3.StringUtils.countMatches;

interface Solution {
  static List<Pair<Character, Integer>> orderedCount(String text) {
    return text.chars().distinct().mapToObj(c -> Pair.of((char) c, countMatches(text, (char) c))).toList();
  }
}