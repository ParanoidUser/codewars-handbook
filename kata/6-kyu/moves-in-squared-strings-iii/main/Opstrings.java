import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.of;

import java.util.function.UnaryOperator;

interface Opstrings {
  static String diag1Sym(String strng) {
    return range(0, strng.indexOf('\n')).mapToObj(i -> of(strng.split("\n")).map(s -> "" + s.charAt(i)).collect(joining())).collect(joining("\n"));
  }

  static String rot90Clock(String strng) {
    return of(diag1Sym(strng).split("\n")).map(s -> new StringBuilder(s).reverse().toString()).collect(joining("\n"));
  }

  static String selfieAndDiag1(String strng) {
    return range(0, strng.indexOf('\n')).mapToObj(i -> strng.split("\n")[i] + "|" + diag1Sym(strng).split("\n")[i]).collect(joining("\n"));
  }

  static String oper(UnaryOperator<String> operator, String s) {
    return operator.apply(s);
  }
}
