import java.util.LinkedList;

interface Solution {
  static int[] solve(int[] arr) {
    var unique = new LinkedList<Integer>();
    for (int i = arr.length - 1; i >= 0; i--) {
      if (!unique.contains(arr[i])) {
        unique.addFirst(arr[i]);
      }
    }
    return unique.stream().mapToInt(i -> i).toArray();
  }
}
