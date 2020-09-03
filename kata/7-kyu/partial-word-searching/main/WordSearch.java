import static java.util.stream.Stream.of;

interface WordSearch {
  static String[] findWord(String x, String[] y) {
    y = of(y).filter(s -> s.toLowerCase().contains(x)).toArray(String[]::new);
    return y.length > 0 ? y : new String[] {"Empty"};
  }
}
