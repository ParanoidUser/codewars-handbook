import static java.util.function.Predicate.not;
import static java.util.stream.Stream.of;

import java.util.Set;

interface Kata {
  static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
    return of(citiesOffered).filter(not(Set.of(citiesVisited)::contains)).findFirst()
        .orElse("No worthwhile conferences this year!");
  }
}
