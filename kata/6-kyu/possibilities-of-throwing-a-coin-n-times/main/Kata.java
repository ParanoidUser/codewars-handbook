import static java.util.stream.IntStream.range;

class Kata {
  String[] coin(int n) {
    return range(0, (int) Math.pow(2, n)).mapToObj(
      i -> String.format("%" + n + "s", Integer.toBinaryString(i)).replaceAll("[ 0]", "H").replace('1', 'T')
    ).toArray(String[]::new);
  }
}