import static java.util.stream.IntStream.of;

class FindOutlier {
  static int find(int[] i) {
    return of(i).filter(n -> (i[0] % 2 == 0 && i[1] % 2 == 0 || i[1] % 2 == 0 && i[2] % 2 == 0 || i[0] % 2 == 0 && i[2] % 2 == 0) == (n % 2 != 0)).findFirst().orElse(0);
  }
}
