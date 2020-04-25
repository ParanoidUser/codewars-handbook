import static java.time.LocalDate.parse;
import static java.time.format.DateTimeFormatter.ofPattern;
import static java.util.List.of;

interface Weton {
  static String getWeton(String date) {
    for (var format : of("MMMM d, yyyy", "d MMMM yyyy", "d MMMM, yyyy", "M/d/yyyy", "yyyy-M-d")) {
      try {
        int daysSince = (int) (35 + parse(date, ofPattern(format)).toEpochDay() % 35);
        return of("Kemis", "Jemuwah", "Setu", "Minggu", "Senin", "Selasa", "Rebo").get(daysSince % 7)
             + of(" Wage", " Kliwon", " Legi", " Pahing", " Pon").get(daysSince % 5);
      } catch (RuntimeException ignore) { /* try another format */ }
    }
    throw new IllegalArgumentException("Invalid format: " + date);
  }
}
