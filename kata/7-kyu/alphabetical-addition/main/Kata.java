import static java.util.stream.Stream.of;

interface Kata {
  static String addLetters(String... letters) {
    int sum = of(letters).mapToInt(l -> l.charAt(0) - 96).sum() % 26 + 96;
    return "" + (char) (sum != 96 ? sum : 122);
  }
}
