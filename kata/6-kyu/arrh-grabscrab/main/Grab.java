import java.util.Arrays;
import java.util.List;

interface Grab {
  static List<String> grabscrab(String s, List<String> words) {
    int[] stats = s.chars().sorted().toArray();
    return words.stream().filter(w -> Arrays.equals(stats, w.chars().sorted().toArray())).toList();
  }
}