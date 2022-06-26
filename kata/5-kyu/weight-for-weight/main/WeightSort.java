import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

import java.util.function.Function;

interface WeightSort {
  static String orderWeight(String weights) {
    Function<String, Integer> sum = s -> s.chars().map(c -> c - 48).sum();
    return of(weights.split(" ")).sorted(comparing(sum).thenComparing(String::compareTo)).collect(joining(" "));
  }
}