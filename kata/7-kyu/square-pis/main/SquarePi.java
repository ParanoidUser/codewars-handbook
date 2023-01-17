import static java.util.stream.IntStream.range;

class SquarePi {
  private final int square;

  SquarePi(int digits) {
    var pi = "3141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117068";
    square = (int) Math.ceil(Math.sqrt(range(0, digits).mapToDouble(i -> Math.pow(pi.charAt(i) - 48., 2)).sum()));
  }

  int calculate() {
    return square;
  }
}