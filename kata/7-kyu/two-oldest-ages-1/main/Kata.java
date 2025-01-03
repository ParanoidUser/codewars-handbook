import static java.util.stream.IntStream.of;

interface Kata {
  static int[] twoOldestAges(int[] ages) {
    return of(ages).sorted().skip(ages.length - 2L).toArray();
  }
}