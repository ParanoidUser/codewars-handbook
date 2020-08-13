import static java.util.Arrays.stream;

import java.util.Map;

interface TheOffice {
  static String boredom(Person[] staff) {
    var boredom = Map.of("accounts", 1,"finance", 2, "regulation", 3, "cleaning", 4, "retail", 5, "change", 6, "trading", 6, "IS", 8, "canteen", 10, "pissing about", 25);
    int score = stream(staff).mapToInt(p -> boredom.get(p.department)).sum();
    return score > 99 ? "party time!!" : score < 81 ? "kill me now" : "i can handle this";
  }
}
