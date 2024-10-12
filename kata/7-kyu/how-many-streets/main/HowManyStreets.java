import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.IntStream.range;

interface HowManyStreets {
  static int[] countStreets(String[] streets, String[][] drivers) {
    var map = range(0, streets.length).boxed().collect(toMap(i -> streets[i], i -> i));
    return stream(drivers).mapToInt(d -> Math.abs(map.get(d[1]) - map.get(d[0])) - 1).toArray();
  }
}