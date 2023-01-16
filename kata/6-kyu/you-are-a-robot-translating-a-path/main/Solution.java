import static java.util.Map.of;
import static java.util.regex.Pattern.compile;
import static java.util.stream.Collectors.joining;

interface Solution {
  static String walk(String path) {
    var directions = of('^', "up", 'v', "down", '>', "right", '<', "left");
    return path.isEmpty() ? "Paused" : compile("(.)\\1*").matcher(path).results()
        .map(r -> String.format("Take %d step%s %s", r.group().length(), r.group().length() > 1 ? "s" : "",
            directions.get(r.group().charAt(0)))).collect(joining("\n"));
  }
}