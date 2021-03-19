import static java.time.LocalDate.of;
import static java.time.temporal.ChronoUnit.DAYS;

interface DaysBetween {
  static long getDaysAlive(int year, int month, int day, int year2, int month2, int day2) {
    return DAYS.between(of(year, month, day), of(year2, month2, day2));
  }
}