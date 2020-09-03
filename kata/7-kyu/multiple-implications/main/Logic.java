import static java.util.stream.IntStream.range;

interface Logic {
  static boolean multImplication(boolean[] lst) {
    return range(0, lst.length).mapToObj(i -> lst[i]).reduce((x, y) -> !x || y).orElse(false);
  }
}
