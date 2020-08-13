import static java.time.LocalDate.of;

interface DateDays {
  static String dateNbDays(double a0, double a, double p) {
    return of(2016, 1, 1).plusDays((long) (Math.log(a / a0) / Math.log(p / 36000 + 1) + 1)).toString();
  }
}
