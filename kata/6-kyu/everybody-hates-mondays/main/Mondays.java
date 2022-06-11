import static java.time.DayOfWeek.MONDAY;
import static java.time.Period.ofWeeks;
import static java.time.temporal.TemporalAdjusters.nextOrSame;

import java.time.LocalDate;

interface Mondays {
  static long count(LocalDate birthday, LocalDate today) {
    birthday = birthday.plusYears(22);
    if (birthday.isAfter(today)) {
      return 0;
    }
    var nextMonday = birthday.with(nextOrSame(MONDAY));
    birthday = birthday.plusYears(56);
    return nextMonday.datesUntil(birthday.isBefore(today) ? birthday : today.plusDays(1), ofWeeks(1)).count();
  }
}
