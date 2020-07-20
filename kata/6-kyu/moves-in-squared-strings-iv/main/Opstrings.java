import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.of;

import java.util.function.UnaryOperator;

interface Opstrings {
  static String rot90Counter(String strng) {
    return of(diag2Sym(strng).split("\n")).map(s -> new StringBuilder(s).reverse().toString()).collect(joining("\n"));
  }

  static String diag2Sym(String strng) {
    return new StringBuilder(range(0, strng.indexOf('\n')).mapToObj(i -> of(strng.split("\n")).map(s -> "" + s.charAt(i)).collect(joining())).collect(joining("\n"))).reverse().toString();
  }

  static String selfieDiag2Counterclock(String strng) {
    return range(0, strng.indexOf('\n')).mapToObj(i -> strng.split("\n")[i] + "|" + diag2Sym(strng).split("\n")[i] + "|" + rot90Counter(strng).split("\n")[i]).collect(joining("\n"));
  }

  static String oper(UnaryOperator<String> operator, String s) {
    return operator.apply(s);
  }
}
