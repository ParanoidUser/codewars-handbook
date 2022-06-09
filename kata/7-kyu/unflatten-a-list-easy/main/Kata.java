import java.util.ArrayList;
import java.util.Arrays;

interface Kata {
  static Object[] unflatten(int[] flatArray) {
    var list = new ArrayList<>();
    int i = 0;
    while (i < flatArray.length) {
      if (flatArray[i] < 3) {
        list.add(flatArray[i++]);
      } else {
        list.add(Arrays.copyOfRange(flatArray, i, Math.min(i + flatArray[i], flatArray.length)));
        i += flatArray[i];
      }
    }
    return list.toArray();
  }
}
