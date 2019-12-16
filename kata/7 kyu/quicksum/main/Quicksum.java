import static java.util.stream.IntStream.range;

class Quicksum {
  static int quicksum(String packet) {
    return packet.matches("[A-Z\\s]+") ? range(0, packet.length())
            .map(i -> packet.charAt(i) == 32 ? 0 : (packet.charAt(i++) - 64) * i).sum() : 0;
  }
}
