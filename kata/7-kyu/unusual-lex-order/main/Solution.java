import static java.util.Comparator.comparing;
import static java.util.stream.Stream.of;

class Solution {
  String[] unusualLexOrder(String[] words) {
    return of(words).sorted(comparing(w -> new StringBuilder(w).reverse() + "")).toArray(String[]::new);
  }
}
