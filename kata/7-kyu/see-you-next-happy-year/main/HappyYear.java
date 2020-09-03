import static java.util.stream.Collectors.joining;

interface HappyYear {
  static int nextHappyYear(int year) {
    while ((++year + "").chars().distinct().mapToObj(n -> n - 48 + "").collect(joining()).length() != 4);
    return year;
  }
}
