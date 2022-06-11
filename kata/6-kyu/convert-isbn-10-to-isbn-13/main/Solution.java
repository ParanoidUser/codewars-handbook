import static java.util.stream.IntStream.range;

interface Solution {
  static String isbnConverter(String isbn) {
    final String chunk = isbn.replace("-", "");
    int check = (range(0, chunk.length() - 1).map(i -> (chunk.charAt(i) - 48) * (i % 2 > 0 ? 1 : 3)).sum() + 38) % 10;
    return "978-" + isbn.substring(0, 12) + (check > 0 ? 10 - check : 0);
  }
}
