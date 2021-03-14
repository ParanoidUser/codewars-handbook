import static java.util.stream.Collectors.toMap;
import static java.util.stream.Stream.iterate;
import static java.util.stream.Stream.of;

import java.util.ArrayDeque;

class Routes {
  String findRoutes(String[][] routes) {
    var itineraries = of(routes).collect(toMap(r -> r[1], r -> r[0]));
    var lastPlace = of(routes).filter(r -> !itineraries.containsValue(r[1])).findFirst().orElseThrow()[1];
    var backtrack = iterate(lastPlace, itineraries::get).limit(itineraries.size() + 1L)
        .collect(ArrayDeque<String>::new, ArrayDeque::addFirst, ArrayDeque::addAll);
    return String.join(", ", backtrack);
  }
}