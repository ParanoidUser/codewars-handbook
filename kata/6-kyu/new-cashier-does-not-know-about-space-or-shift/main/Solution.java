import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

interface Solution {
  static String getOrder(String input) {
    return of("Burger", "Fries", "Chicken", "Pizza", "Sandwich", "Onionrings", "Milkshake", "Coke")
        .map(i -> (i + " ").repeat((input.length() - input.replaceAll(i.toLowerCase(), "").length()) / i.length()))
        .collect(joining(" ")).replaceAll("\\s+", " ").trim();
  }
}