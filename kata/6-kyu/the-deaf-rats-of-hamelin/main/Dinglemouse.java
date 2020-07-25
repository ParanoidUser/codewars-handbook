import static java.util.stream.IntStream.iterate;

interface Dinglemouse {
  static int countDeafRats(String town) {
    var s = town.replace(" ", "");
    return (int) iterate(0, i -> i < s.length(), i -> i + 2).filter(i -> s.charAt(i) == 'O').count();
  }
}
