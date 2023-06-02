import java.util.ArrayList;
import java.util.List;

interface CreateTwoSetsOfEqualSum {
  static List<List<Integer>> createTwoSetsOfEqualSum(int n) {
    List<List<Integer>> groups = List.of(new ArrayList<>(), new ArrayList<>());
    if (n % 4 == 1 || n % 4 == 2) {
      return groups;
    }

    long[] sums = new long[2];
    for (int i = n; i > 0; i--) {
      int group = sums[0] > sums[1] ? 1 : 0;
      groups.get(group).add(i);
      sums[group] += i;
    }
    return groups;
  }
}