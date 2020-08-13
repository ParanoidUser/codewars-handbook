import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.HashSet;

interface CharacterCounter {
  static boolean validateWord(String word) {
    return new HashSet<>(word.toLowerCase().chars().boxed()
        .collect(groupingBy(identity(), counting())).values()).size() == 1;
  }
}
