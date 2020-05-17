import static java.util.stream.IntStream.of;

class FindThePoison {
  int find(int[] rats) {
    return of(rats).map(r -> (int) Math.pow(2, r)).sum();
  }
}