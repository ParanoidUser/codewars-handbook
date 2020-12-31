import java.util.HashSet;
import java.util.List;

interface Kata {
  static int solve(List<List<Integer>> data) {
    return data.stream().map(l -> new HashSet<>(l).size()).reduce(1, (a, b) -> a * b);
  }
}