import static java.util.Map.entry;
import static java.util.Map.ofEntries;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

interface Backronym {
  static String makeBackronym(String acronym) {
    var dictionary = ofEntries(entry("A", "awesome"), entry("B", "beautiful"), entry("C", "confident"), entry("D", "disturbing"), entry("E", "eager"), entry("F", "fantastic"), entry("G", "gregarious"), entry("H", "hippy"), entry("I", "ingestable"), entry("J", "joke"), entry("K", "klingon"), entry("L", "literal"), entry("M", "mustache"), entry("N", "newtonian"), entry("O", "oscillating"), entry("P", "perfect"), entry("Q", "queen"), entry("R", "rant"), entry("S", "stylish"), entry("T", "turn"), entry("U", "underlying"), entry("V", "volcano"), entry("W", "weird"), entry("X", "xylophone"), entry("Y", "yogic"), entry("Z", "zero"));
    return acronym.isBlank() ? "" : of(acronym.toUpperCase().split("")).map(dictionary::get).collect(joining(" "));
  }
}
