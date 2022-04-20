import static java.util.Comparator.reverseOrder;

import java.util.List;

interface Kata {
  static List<Integer> getNumbers(List<Integer> nums, int n) {
    return nums.stream().filter(i -> nums.contains(n - i)).distinct().sorted(reverseOrder()).toList();
  }
}