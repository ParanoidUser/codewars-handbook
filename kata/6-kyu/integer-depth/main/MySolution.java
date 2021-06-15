import static java.util.Collections.addAll;

import java.util.HashSet;

class MySolution {
  int computeDepth(int n) {
    var digits = new HashSet<String>();
    for (var i = 1; ; i++) {
      if (addAll(digits, (n * i + "").split("")) && digits.size() > 9) {
        return i;
      }
    }
  }
}
