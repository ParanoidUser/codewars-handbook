import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

interface SmartDogOwner {
  static String woofDecoder(String str) {
    String decoded = of(str.toLowerCase().split("!"))
        .mapToInt(w -> of(w.split("-")).mapToInt(l -> l.matches(".*w.*o.*o*f*") ? 1 : 0).sum())
        .mapToObj(n -> n > 0 ? (char) (n + 96) + "" : "").collect(joining());
    return decoded.isEmpty() ? "nothing to decode!" : decoded.matches("[a-z]+") ? decoded : "just barking!";
  }
}