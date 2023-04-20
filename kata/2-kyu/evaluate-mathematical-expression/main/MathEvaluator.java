import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MathEvaluator {
  private final Pattern parens = Pattern.compile("(-?)\\(([^()]+)\\)");
  private final Pattern divMul = Pattern.compile("(-?[\\d.]+)\\s*([/*])\\s*(-?[\\d.]+)");
  private final Pattern addSub = Pattern.compile("(-?[\\d.]+)\\s*([+\\-])\\s*(-?[\\d.]+)");

  double calculate(String exp) {
    Matcher m;
    while ((m = parens.matcher(exp)).find()) {
      String eval = evaluate(m.group(2));
      if (!m.group(1).isEmpty()) {
        eval = eval.startsWith("-") ? eval.substring(1) : "-" + eval;
      }
      exp = exp.substring(0, m.start()) + eval + exp.substring(m.end());
    }
    return Double.parseDouble(evaluate(exp));
  }

  private String evaluate(String exp) {
    Matcher m;
    while ((m = divMul.matcher(exp)).find()) {
      exp = exp.substring(0, m.start()) + math(m) + exp.substring(m.end());
    }
    while ((m = addSub.matcher(exp)).find()) {
      exp = exp.substring(0, m.start()) + math(m) + exp.substring(m.end());
    }
    return exp;
  }

  private double math(Matcher m) {
    double x = Double.parseDouble(m.group(1));
    String op = m.group(2);
    double y = Double.parseDouble(m.group(3));
    return op.equals("*") ? x * y :
            op.equals("/") ? x / y :
                    op.equals("+") ? x + y : x - y;
  }
}