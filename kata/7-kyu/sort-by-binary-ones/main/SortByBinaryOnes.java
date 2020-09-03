import static java.lang.Integer.bitCount;

import java.util.Arrays;

class SortByBinaryOnes {
  Integer[] sort(Integer[] list) {
    Arrays.sort(list, (a, b) -> bitCount(a) > bitCount(b) ? -1 : bitCount(a) < bitCount(b) ? 1 : a.compareTo(b));
    return list;
  }
}
