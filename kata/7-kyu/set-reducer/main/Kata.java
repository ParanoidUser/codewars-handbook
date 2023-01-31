import java.util.LinkedList;

interface Kata {
  static int setReducer(int[] input) {
    return input.length > 1 ? setReducer(reduce(input)) : input[0];
  }

  private static int[] reduce(int[] input) {
    var stats = new LinkedList<Integer>();
    int j = 0;
    for (int i = 1; i < input.length; i++) {
      if (input[i] != input[j]) {
        stats.add(i - j);
        j = i;
      }
    }
    stats.add(input.length - j);
    return stats.stream().mapToInt(i -> i).toArray();
  }
}