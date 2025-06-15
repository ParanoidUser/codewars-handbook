import static java.util.stream.IntStream.range;

interface Kata {
  static int[] vowelIndices(String word) {
    return range(0, word.length()).filter(i -> "aeiou".indexOf(word.charAt(i)) >= 0).map(i -> i + 1).toArray();
  }
}