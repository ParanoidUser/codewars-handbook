import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

class SolarSystem {
  static char[] annotate(String[] celestialBodies) {
    var planets = "AsteroidPlutoMercuryMarsVenusEarthNeptuneUranusSaturnJupiter";
    return range(1, celestialBodies.length)
        .map(i -> planets.indexOf(celestialBodies[i - 1]) - planets.indexOf(celestialBodies[i]))
        .mapToObj(i -> i > 0 ? "<" : i < 0 ? ">" : "=")
        .collect(joining()).toCharArray();
  }
}