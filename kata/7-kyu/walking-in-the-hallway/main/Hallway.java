import static java.util.regex.Pattern.compile;

interface Hallway {
  static int contact(String hallway) {
    return compile(">-*<").matcher(hallway).results().mapToInt(r -> r.group().length() / 2).min().orElse(-1);
  }
}