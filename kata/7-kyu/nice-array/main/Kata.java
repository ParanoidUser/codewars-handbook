import java.util.Arrays;
import java.util.HashSet;

interface Kata {
  static boolean isNice(Integer[] arr) {
    var set = new HashSet<>(Arrays.asList(arr));
    return !set.isEmpty() && set.stream().filter(n -> set.contains(n - 1) || set.contains(n + 1)).count() == set.size();
  }
}
