import static java.util.stream.IntStream.rangeClosed;

interface Runes {
  static int solveExpression(String exp) {
    return rangeClosed(0, 9)
            .filter(i -> !exp.contains("" + i) && (i > 0 || !exp.matches(".*([+\\-*=]\\?[^+\\-*=]).*")))
            .filter(i -> eval(exp.replace("?", "" + i))).findFirst().orElse(-1);
  }

  private static boolean eval(String exp) {
    char op = exp.contains("+") ? '+' : exp.contains("*") ? '*' : '-';
    int n1 = Integer.parseInt(exp.substring(0, exp.indexOf(op, 1)));
    int n2 = Integer.parseInt(exp.substring(exp.indexOf(op, 1) + 1, exp.indexOf('=')));
    int n3 = Integer.parseInt(exp.substring(exp.indexOf('=') + 1));
    return switch (op) {
      case '+' -> n1 + n2 == n3;
      case '-' -> n1 - n2 == n3;
      case '*' -> n1 * n2 == n3;
      default -> false;
    };
  }
}