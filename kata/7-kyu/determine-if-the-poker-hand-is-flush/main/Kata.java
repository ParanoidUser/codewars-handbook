import static java.util.Arrays.stream;

interface Kata {
  static boolean CheckIfFlush(String[] cards) {
    return stream(cards).map(s -> s.charAt(s.length() - 1)).distinct().count() == 1;
  }
}
