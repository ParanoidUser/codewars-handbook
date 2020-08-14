import static java.util.stream.IntStream.range;

interface ShadesOfGrey {
  static String[] shadesOfGrey(int num) {
    return range(1, Math.min(++num, 255)).mapToObj(i -> String.format("#%1$02x%1$02x%1$02x", i)).toArray(String[]::new);
  }
}