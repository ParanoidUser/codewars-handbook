import static java.util.stream.IntStream.of;

class UniqueArray {
  static int[] unique(int[] integers) {
    return of(integers).distinct().toArray();
  }
}
