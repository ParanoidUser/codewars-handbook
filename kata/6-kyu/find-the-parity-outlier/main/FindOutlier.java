import static java.util.stream.IntStream.of;

interface FindOutlier {
  static int find(int[] i) {
    return of(i).filter(n -> (i[0] % 2 < 1 && i[1] % 2 < 1 || i[1] % 2 < 1 && i[2] % 2 < 1 || i[0] % 2 < 1 && i[2] % 2 < 1) == (n % 2 != 0)).findFirst().orElse(0);
  }
}
