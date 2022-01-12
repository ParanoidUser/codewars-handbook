import static java.util.stream.Collectors.joining;

interface Bud {
  static String computerToPhone(String number) {
    return number.chars().mapToObj(c -> "0789456123".indexOf(c) + "").collect(joining());
  }
}