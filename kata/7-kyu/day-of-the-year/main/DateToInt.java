import static java.time.LocalDate.of;

interface DateToInt {
  static int toDayOfYear(int[] date) {
    return of(date[2], date[1], date[0]).getDayOfYear();
  }
}