import static java.time.DayOfWeek.FRIDAY;
import static java.time.LocalDate.of;
import static java.util.stream.IntStream.range;

interface Kata {
  static int unluckyDays(int year) {
    return range(1, 13).map(i -> of(year, i, 13).getDayOfWeek().equals(FRIDAY) ? 1 : 0).sum();
  }
}
