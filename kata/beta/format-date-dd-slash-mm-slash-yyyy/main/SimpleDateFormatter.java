import static java.time.LocalDate.of;
import static java.time.format.DateTimeFormatter.ofPattern;

interface SimpleDateFormatter {
  static String formatDate(String day, String month, String year) {
    try {
      return of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day)).format(ofPattern("dd/MM/yyyy"));
    } catch (RuntimeException invalid) {
      return "Not a Date";
    }
  }
}