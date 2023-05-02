import java.time.LocalDate;

interface PeriodTime {
  static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
    return today.minusDays(cycleLength).isAfter(last);
  }
}