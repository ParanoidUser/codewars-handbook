import static java.util.stream.IntStream.of;

interface UniqueArray {
  static int[] unique(int[] integers) {
    return of(integers).distinct().toArray();
  }
}
