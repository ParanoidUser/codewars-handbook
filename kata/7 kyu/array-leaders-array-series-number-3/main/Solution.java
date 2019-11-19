import java.util.ArrayList;
import java.util.List;

class Solution {
  static List<Integer> arrayLeaders(int[] numbers) {
    var arr = new ArrayList<Integer>();
    for (int i = numbers.length - 1, sum = 0; i >= 0; i--) {
      if (numbers[i] > sum) arr.add(0, numbers[i]);
      sum += numbers[i];
    }
    return arr;
  }
}
