import static java.util.stream.Collectors.joining;

interface Solution {
  static String explode(String digits) {
    return digits.chars().mapToObj(c -> ((char) c + "").repeat(c - 48)).collect(joining());
  }
}