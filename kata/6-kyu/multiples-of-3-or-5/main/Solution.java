import static java.util.stream.IntStream.range;

class Solution {
  int solution(int number) {
    return range(3, number).filter(i -> i % 3 == 0 || i % 5 == 0).sum();
  }
}
