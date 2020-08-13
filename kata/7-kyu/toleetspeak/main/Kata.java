import static java.util.stream.Collectors.joining;

interface Kata {
  static String toLeetSpeak(String speak) {
    return speak.chars().mapToObj(c -> "" + (char) (c > 64 && c < 91 ? "@8(D3F6#!JK1MN0PQR$7UVWXY2".charAt(c - 65) : c)).collect(joining());
  }
}
