import static java.util.stream.IntStream.range;

interface Kata {
  static String[] scrollingText(String t) {
    return range(0, t.length())
        .mapToObj(i -> (t.substring(i) + t.substring(0, i)).toUpperCase())
        .toArray(String[]::new);
  }
}