import java.util.function.UnaryOperator;

interface Opstrings1 {
  static String rot(String strng) {
    return new StringBuilder(strng).reverse().toString();
  }

  static String selfieAndRot(String strng) {
    var dots = ".".repeat(strng.indexOf('\n'));
    return (strng.replaceAll("\n", dots + "\n") + dots + "\n" + dots + rot(strng).replaceAll("\n", "\n" + dots));
  }

  static String oper(UnaryOperator<String> operator, String s) {
    return operator.apply(s);
  }
}
