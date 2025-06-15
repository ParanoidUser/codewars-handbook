import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

interface Solution {
  static String parseIPv6(String ip) {
    return of(ip.split("[^0-9A-F]")).map(s -> s.chars().map(c -> Character.digit(c, 16)).sum() + "").collect(joining());
  }
}