import java.util.Map;

interface Change {
  static Map<String, Integer> looseChange(int cent) {
    return Map.of(
        "Quarters", cent / 25,
        "Dimes", cent % 25 / 10,
        "Nickels", cent % 25 % 10 / 5,
        "Pennies", Math.max(cent % 5, 0)
    );
  }
}