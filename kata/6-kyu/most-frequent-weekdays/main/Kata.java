  import static java.time.LocalDate.of;
  import static java.time.format.TextStyle.FULL;
  import static java.util.Locale.getDefault;

  import java.time.Year;

  interface Kata {
    static String[] mostFrequentDays(int year) {
      var jan1 = of(year, 1, 1).getDayOfWeek().getDisplayName(FULL, getDefault());
      var jan2 = of(year, 1, 2).getDayOfWeek().getDisplayName(FULL, getDefault());
      return Year.of(year).isLeap() ? jan1.startsWith("Su") ? new String[] {jan2, jan1} : new String[] {jan1, jan2} : new String[] {jan1};
    }
  }
