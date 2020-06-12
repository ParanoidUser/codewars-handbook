import static java.time.LocalDate.parse;
import static java.time.temporal.IsoFields.WEEK_OF_WEEK_BASED_YEAR;

interface Kata {
  static int getCalendarWeek(String dateString) {
    return parse(dateString).get(WEEK_OF_WEEK_BASED_YEAR);
  }
}
