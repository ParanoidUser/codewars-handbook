import static java.util.stream.IntStream.range;

class Quicksum {
  int quicksum(String packet) {
    return packet.matches("[A-Z\\s]+") ? range(0, packet.length())
        .filter(i -> packet.charAt(i) != 32)
        .map(i -> (packet.charAt(i++) - 64) * i).sum() : 0;
  }
}
