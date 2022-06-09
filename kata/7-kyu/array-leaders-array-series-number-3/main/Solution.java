import java.util.ArrayList;
import java.util.List;

interface Solution {
  static List<Integer> arrayLeaders(int[] numbers) {
    var arr = new ArrayList<Integer>();
    int sum = 0;
    for (int i = numbers.length - 1; i >= 0; i--) {
      if (numbers[i] > sum) arr.add(0, numbers[i]);
      sum += numbers[i];
    }
    return arr;
  }
}
