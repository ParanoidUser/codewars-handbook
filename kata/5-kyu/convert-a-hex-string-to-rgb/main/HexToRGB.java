import static java.util.stream.Stream.of;

interface HexToRGB {
  static int[] hexStringToRGB(String hex) {
    return of(hex.split("#|(?<=\\G..)")).skip(1).mapToInt(s -> Integer.parseInt(s, 16)).toArray();
  }
}