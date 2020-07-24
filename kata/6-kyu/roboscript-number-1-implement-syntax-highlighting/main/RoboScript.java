import java.util.function.UnaryOperator;

interface RoboScript {
  static String highlight(String code) {
    UnaryOperator<String> span = c -> String.format("<span style=\"color: %s\">$1</span>", c);
    return code.replaceAll("(F+)", span.apply("pink"))
        .replaceAll("(L+)", span.apply("red"))
        .replaceAll("(R+)", span.apply("green"))
        .replaceAll("(\\d+)", span.apply("orange"));
  }
}
