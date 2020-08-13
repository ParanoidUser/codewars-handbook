import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

import java.util.function.UnaryOperator;

interface Opstrings {
  static String vertMirror(String strng) {
    return stream(strng.split("\n")).map(s -> new StringBuilder(s).reverse().toString()).collect(joining("\n"));
  }

  static String horMirror(String strng) {
    return new StringBuilder(vertMirror(strng)).reverse().toString();
  }

  static String oper(UnaryOperator<String> operator, String s) {
    return operator.apply(s);
  }
}
