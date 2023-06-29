import java.util.function.BiFunction;

import static java.util.Comparator.comparing;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;

interface Mixing {
  static String mix(String s1, String s2) {
    BiFunction<String, Character, Integer> len = (s, c) -> s.replaceAll("[^" + c + "]+", "").length();
    return rangeClosed('a', 'z')
            .mapToObj(c -> new int[]{len.apply(s1, (char) c), len.apply(s2, (char) c), c})
            .filter(a -> a[0] > 1 || a[1] > 1)
            .map(a -> (a[0] > a[1] ? "1:" : a[0] < a[1] ? "2:" : "=:") + ((char) a[2] + "").repeat(Math.max(a[0], a[1])))
            .sorted(comparing(String::length).reversed().thenComparing(identity())).collect(joining("/"));
  }
}