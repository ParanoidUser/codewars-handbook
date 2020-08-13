import static java.util.stream.IntStream.of;

interface Solution {
  static int predictAge(int... ages) {
    return (int) (Math.sqrt(of(ages).map(a -> a * a).sum()) / 2);
  }
}
