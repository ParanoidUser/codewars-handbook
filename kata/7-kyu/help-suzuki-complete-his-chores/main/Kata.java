import static java.util.stream.IntStream.range;

import java.util.Arrays;

interface Kata {
  static int[] choreAssignments(int[] chores) {
    Arrays.sort(chores);
    return range(0, chores.length / 2).map(i -> chores[i] + chores[chores.length - i - 1]).sorted().toArray();
  }
}
