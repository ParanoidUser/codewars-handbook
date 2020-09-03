import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;
import static org.apache.commons.lang3.StringUtils.countMatches;

interface ValidTeamsAndNames {
  static String validate(String s) {
    s = of(s.split("[A-Z]:")).filter(t -> t.contains(",")).collect(joining(":"));
    return 1 + countMatches(s, ":") + ":" + s.replace(':', ',');
  }
}
