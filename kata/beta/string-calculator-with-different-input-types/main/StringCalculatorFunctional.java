import static java.util.stream.Stream.of;

import java.util.function.ToIntFunction;

interface StringCalculatorFunctional {
  static String sum(String input) {
    ToIntFunction<String> toInt = s -> {
      try {
        return Integer.parseInt(s);
      } catch (NumberFormatException invalid) {
        return 0;
      }
    };
    int sum = of(input.split(", ")).mapToInt(toInt).sum();
    return sum > 0 ? sum + "" : "Calculation failed";
  }
}