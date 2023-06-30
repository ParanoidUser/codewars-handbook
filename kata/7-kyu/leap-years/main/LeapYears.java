import static java.time.Year.of;

interface LeapYears {
  static boolean isLeapYear(int year) {
    return of(year).isLeap();
  }
}