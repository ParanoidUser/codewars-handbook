import static java.util.Collections.addAll;

import java.util.HashSet;

class MySolution {
  static int computeDepth(int n) {
    var digits = new HashSet<String>();
    for (int i = 1; ; i++) {
      if (addAll(digits, (n * i + "").split("")) && digits.size() > 9) {
        return i;
      }
    }
  }
}
