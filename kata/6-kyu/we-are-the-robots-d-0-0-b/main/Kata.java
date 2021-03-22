import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Stream.of;

interface Kata {
  static String[] countRobots(String[] a) {
    var robots = of(a).filter(s -> s.matches("(?i).*(automatik|mechanik).*"))
        .collect(groupingBy(s -> s.matches("(?i).*automatik.*"),
                 summingInt(s -> (s.length() - s.replaceAll("\\w\\S\\S0\\S\\S0\\S\\S\\w", "").length()) / 10)));
    return new String[]{
        robots.getOrDefault(true, 0) + " robots functioning automatik",
        robots.getOrDefault(false, 0) + " robots dancing mechanik"
    };
  }
}