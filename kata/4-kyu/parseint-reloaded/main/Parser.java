import static java.util.Map.entry;
import static java.util.Map.ofEntries;

interface Parser {
  static int parseInt(String numStr) {
    var terms = ofEntries(
            entry("zero", 0), entry("one", 1), entry("two", 2), entry("three", 3), entry("four", 4), entry("five", 5), entry("six", 6),
            entry("seven", 7), entry("eight", 8), entry("nine", 9), entry("ten", 10), entry("eleven", 11), entry("twelve", 12),
            entry("thirteen", 13), entry("fourteen", 14), entry("fifteen", 15), entry("sixteen", 16), entry("seventeen", 17),
            entry("eighteen", 18), entry("nineteen", 19), entry("twenty", 20), entry("thirty", 30), entry("forty", 40),
            entry("fifty", 50), entry("sixty", 60), entry("seventy", 70), entry("eighty", 80), entry("ninety", 90)
    );

    int number = 0;
    String[] chunks = numStr.replaceAll("-|( and )", " ").replace("million", "thousand thousand").split(" ");
    for (int i = 0; i < chunks.length; i++) {
      switch (chunks[i]) {
        case "thousand" -> number *= 1000;
        case "hundred" -> number += 100 * terms.get(chunks[i - 1]) - terms.get(chunks[i - 1]);
        default -> number += terms.get(chunks[i]);
      }
    }
    return number;
  }
}