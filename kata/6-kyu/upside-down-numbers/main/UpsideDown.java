import static java.util.stream.IntStream.range;

import java.util.function.UnaryOperator;

class UpsideDown {
  int solve(int x, int y) {
    UnaryOperator<String> upside = s -> new StringBuilder(s.replaceAll("[23457]", "0").replace('6', '_').replace('9', '6').replace('_', '9')).reverse().toString();
    return (int) range(x, y).filter(i -> i == Integer.parseInt(upside.apply(i + ""))).count();
  }
}
