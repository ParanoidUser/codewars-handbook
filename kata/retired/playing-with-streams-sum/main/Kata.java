import java.util.List;

interface Kata {
  static int sum(List<Integer> list) {
    return list.stream().mapToInt(Integer::intValue).sum();
  }
}