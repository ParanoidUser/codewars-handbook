import static java.lang.Integer.parseInt;

interface Bud {
  static int howManyYears(String d1, String d2) {
    return Math.abs(parseInt(d1.substring(0, 4)) - parseInt(d2.substring(0, 4)));
  }
}