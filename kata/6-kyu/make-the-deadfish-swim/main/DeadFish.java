import java.util.ArrayList;

interface DeadFish {
  static int[] parse(String data) {
    var value = 0;
    var results = new ArrayList<Integer>();
    for (char c : data.toCharArray()) {
      if (c == 'i') value++;
      if (c == 'd') value--;
      if (c == 's') value *= value;
      if (c == 'o') results.add(value);
    }
    return results.stream().mapToInt(i -> i).toArray();
  }
}
