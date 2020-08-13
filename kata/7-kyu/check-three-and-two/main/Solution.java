import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Set;

class Solution {
  boolean checkThreeAndTwo(char[] chars) {
    return new String(chars).chars().boxed()
        .collect(groupingBy(identity(), counting()))
        .values().containsAll(Set.of(2L, 3L));
  }
}
