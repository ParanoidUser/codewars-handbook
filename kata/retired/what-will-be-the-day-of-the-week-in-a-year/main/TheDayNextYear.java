import static java.time.LocalDate.of;
import static java.time.format.TextStyle.FULL;
import static java.util.Locale.getDefault;

interface TheDayNextYear {
  static String getDayOfWeek(int year, int month, int day) {
    return of(year + 1, month, day).getDayOfWeek().getDisplayName(FULL, getDefault());
  }
}
