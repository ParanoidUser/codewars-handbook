import static java.util.stream.IntStream.rangeClosed;

interface SandwichUtils {
  static String slicesToName(Object n) {
    return n instanceof Integer i && i > 1 ? (i % 2 > 0 ? "bread " : "") + "sandwich ".repeat(i / 2).trim() : null;
  }

  static Integer nameToSlices(Object n) {
    return rangeClosed(2, 100).filter(i -> n != null && n.equals(slicesToName(i))).boxed().findFirst().orElse(null);
  }
}