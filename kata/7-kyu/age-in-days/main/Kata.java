import static java.time.LocalDate.now;
import static java.time.LocalDate.of;
import static java.time.temporal.ChronoUnit.DAYS;

interface Kata {
  static String ageInDays(int year, int month, int day) {
    return "You are " + DAYS.between(of(year, month, day), now()) + " days old";
  }
}
