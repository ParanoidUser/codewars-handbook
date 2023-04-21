import static java.util.stream.Stream.of;

interface Solution {
  static String[] sortEmotions(boolean order, String[] emotions) {
    return of(emotions).sorted((a, b) -> (order ? -1 : 1) *
            ("_(|)D".indexOf(a.charAt(1)) - "_(|)D".indexOf(b.charAt(1)))).toArray(String[]::new);
  }
}