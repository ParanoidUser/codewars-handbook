import static java.util.stream.Collectors.joining;

class SpyGraduation {
  static String decrypt(String encrypted) {
    return encrypted.chars().map(c -> c & 255).mapToObj(c -> (char) c + "").collect(joining());
  }
}
