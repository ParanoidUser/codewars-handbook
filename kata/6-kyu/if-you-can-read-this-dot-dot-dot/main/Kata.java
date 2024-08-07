import static java.util.stream.Collectors.joining;

interface Kata {
  static String toNATO(String string) {
    return string.replace(" ", "").toUpperCase().chars()
        .mapToObj(c -> Helper.NATO.getOrDefault((char) c, (char) c + "")).collect(joining(" "));
  }
}