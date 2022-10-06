import static java.util.stream.Stream.of;

interface Subsets {
  static <T> long count(T[] elems) {
    return (1L << of(elems).distinct().count()) - 1;
  }
}