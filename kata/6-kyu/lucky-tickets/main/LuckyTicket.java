import static java.util.stream.IntStream.rangeClosed;

class LuckyTicket {
  int numberOfTickets(int from, int to) {
    return (int) rangeClosed(from, to).mapToObj(n -> n + "")
        .filter(s -> s.charAt(0) + s.charAt(1) + s.charAt(2) == s.charAt(3) + s.charAt(4) + s.charAt(5))
        .count();
  }
}