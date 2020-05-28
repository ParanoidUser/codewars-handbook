import static java.time.DayOfWeek.MONDAY;
import static java.time.Period.ofWeeks;
import static java.time.temporal.TemporalAdjusters.nextOrSame;

import java.time.LocalDate;

interface Mondays {
  static long count(LocalDate birthday, LocalDate today) {
    return (birthday = birthday.plusYears(22)).isAfter(today) ? 0 :
        birthday.with(nextOrSame(MONDAY)).datesUntil((birthday = birthday.plusYears(56)).isBefore(today) ? birthday : today.plusDays(1), ofWeeks(1)).count();
  }
}
