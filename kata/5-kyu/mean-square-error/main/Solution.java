import static java.util.stream.IntStream.range;

interface Solution {
  static double solution(int[] a1, int[] a2) {
    return range(0, a1.length).map(i -> (a1[i] - a2[i]) * (a1[i] - a2[i])).average().orElse(0);
  }
}