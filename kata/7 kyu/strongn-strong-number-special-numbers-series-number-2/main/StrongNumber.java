import static java.util.stream.IntStream.rangeClosed;

class StrongNumber {
  static String isStrongNumber(int num) {
    return ("" + num).chars().map(Character::getNumericValue)
                     .map(i -> rangeClosed(1, i).reduce(1, (a, b) -> a * b))
                     .sum() == num ? "STRONG!!!!" : "Not Strong !!";
  }
}
