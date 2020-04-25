import static java.util.stream.Stream.of;

interface Kata {
  static boolean evalLikes(String[] words) {
    return .05 * words.length < of(words).filter("like"::equalsIgnoreCase).count();
  }
}