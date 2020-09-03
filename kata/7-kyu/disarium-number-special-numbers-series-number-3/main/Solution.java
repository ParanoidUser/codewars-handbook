import static java.util.stream.IntStream.range;

interface Solution {
  static String disariumNumber(int number) {
    return range(1, (number + "").length() + 1)
                .map(n -> (int) Math.pow((number + "").charAt(n - 1) - 48., n))
                .sum() == number ? "Disarium !!" : "Not !!";
  }
}
