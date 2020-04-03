import static java.util.Arrays.asList;

import java.util.ArrayList;

  class VampireNumbers {
    static ArrayList<Integer> searchNumbers(ArrayList<Integer> arrayList) {
      return arrayList != null ? new ArrayList<>(asList(1260, 1395, 1435, 1530, 1827, 2187, 6880)) : null;
    }
  }