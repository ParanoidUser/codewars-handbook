import static java.util.stream.Collectors.joining;

class SpyGraduation {
  String decrypt(String encrypted) {
    return encrypted.chars().map(c -> c & 255).mapToObj(c -> (char) c + "").collect(joining());
  }
}
