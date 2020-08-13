import static java.util.Comparator.comparing;
import static java.util.stream.IntStream.of;

interface Kata {
  static int[] menFromBoys(int[] values) {
    return of(values).distinct().boxed()
        .sorted(comparing(i -> i % 2 == 0 ? i : -i))
        .sorted(comparing(i -> Math.abs(i % 2)))
        .mapToInt(i -> i).toArray();
  }
}
