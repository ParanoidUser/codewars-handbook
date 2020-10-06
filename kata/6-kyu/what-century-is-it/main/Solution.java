import static java.util.Map.of;

interface Solution {
  static String whatCentury(int y) {
    return (y = (int) Math.ceil(y / 100.)) + of(1, "st", 2, "nd", 3, "rd").getOrDefault(y > 13 ? y % 10 : 0, "th");
  }
}