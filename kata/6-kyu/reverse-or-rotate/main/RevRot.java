import static java.util.stream.IntStream.range;

interface RevRot {
  static String revRot(String strng, int sz) {
    if (strng.isEmpty() || sz <= 0 || sz > strng.length()) return "";

    var result = new StringBuilder();
    for (var i = 0; i <= strng.length() - sz; i += sz) {
      var chunk = new StringBuilder(strng.substring(i, sz + i));
      if (range(0, sz).mapToDouble(j -> Math.pow(chunk.charAt(j) - 48., 3)).sum() % 2 > 0) {
        result.append(chunk.substring(1, sz)).append(chunk.charAt(0));
      } else {
        result.append(chunk.reverse());
      }
    }
    return result.toString();
  }
}
