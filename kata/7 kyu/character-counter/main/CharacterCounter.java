import static java.util.Set.of;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

class CharacterCounter {
  static boolean validateWord(String word) {
    return of(word.toLowerCase().chars().boxed().collect(groupingBy(identity(), counting())).values()).size() == 1;
  }
}
