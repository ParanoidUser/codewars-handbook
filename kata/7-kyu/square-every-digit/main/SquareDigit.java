import static java.util.stream.Collectors.joining;

class SquareDigit {
  int squareDigits(int n) {
    return Integer.parseInt(("" + n).chars().mapToObj(i -> "" + (i - 48) * (i - 48)).collect(joining()));
  }
}
