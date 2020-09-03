import java.util.ArrayList;
import java.util.Arrays;

interface Kata {
  static Object[] unflatten(int[] flatArray) {
    var list = new ArrayList<>();
    for (int i = 0; i < flatArray.length; ) {
      if (flatArray[i] < 3) {
        list.add(flatArray[i++]);
      } else {
        list.add(Arrays.copyOfRange(flatArray, i, Math.min(i += flatArray[i], flatArray.length)));
      }
    }
    return list.toArray();
  }
}
