import static java.util.stream.IntStream.range;

class SquarePi {
  int square;

  SquarePi(int digits) {
    var pi = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
    square = (int) Math.ceil(Math.sqrt(range(0, digits).mapToDouble(i -> Math.pow(pi.charAt(i) - 48., 2)).sum()));
  }

  int calculate() {
    return square;
  }
}
