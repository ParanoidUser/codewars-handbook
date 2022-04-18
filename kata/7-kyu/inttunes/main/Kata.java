import static java.util.stream.IntStream.of;

import java.util.List;

interface Kata {
  static boolean isTune(int[] notes) {
    var tunes = List.of(-10, -8, -6, -5, -3, -1, 0, 2, 4, 5, 6, 7, 9, 11);
    return notes != null && of(notes)
        .mapToObj(i -> of(notes).map(j -> (j - i) % 12).boxed().toList())
        .anyMatch(tunes::containsAll);
  }
}
