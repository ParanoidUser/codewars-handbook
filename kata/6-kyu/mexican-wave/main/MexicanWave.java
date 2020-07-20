import static java.util.stream.IntStream.range;

interface MexicanWave {
  static String[] wave(String str) {
    return range(0, str.length())
        .filter(n -> str.charAt(n) != ' ')
        .mapToObj(n -> str.substring(0, n) + Character.toUpperCase(str.charAt(n)) + str.substring(n + 1))
        .toArray(String[]::new);
  }
}
