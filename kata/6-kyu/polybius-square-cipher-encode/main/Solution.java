import static java.util.Map.entry;
import static java.util.Map.ofEntries;
import static java.util.stream.Collectors.joining;

interface Solution {
  static String polybius(String text) {
    var block = ofEntries(
        entry(65, "11"), entry(66, "12"), entry(67, "13"), entry(68, "14"), entry(69, "15"),
        entry(70, "21"), entry(71, "22"), entry(72, "23"), entry(73, "24"), entry(74, "24"), entry(75, "25"),
        entry(76, "31"), entry(77, "32"), entry(78, "33"), entry(79, "34"), entry(80, "35"),
        entry(81, "41"), entry(82, "42"), entry(83, "43"), entry(84, "44"), entry(85, "45"),
        entry(86, "51"), entry(87, "52"), entry(88, "53"), entry(89, "54"), entry(90, "55")
    );
    return text.chars().mapToObj(c -> block.getOrDefault(c, (char) c + "")).collect(joining());
  }
}
