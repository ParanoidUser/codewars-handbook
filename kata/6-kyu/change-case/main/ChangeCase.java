import static java.util.regex.Pattern.compile;

import java.util.function.UnaryOperator;

class ChangeCase {
  String toSentenceCase(String string) {
    return compile("(?<=[.!?] |^)\\w").matcher(string.toLowerCase()).replaceAll(m -> m.group().toUpperCase());
  }

  String toLowerCase(String string) {
    return string.toLowerCase();
  }

  String toUpperCase(String string) {
    return string.toUpperCase();
  }

  String capitalizeEachWord(String string) {
    UnaryOperator<String> replace = s -> Character.toUpperCase(s.charAt(0)) + s.substring(1);
    return compile("\\w+").matcher(string.toLowerCase()).replaceAll(m -> replace.apply(m.group()));
  }

  String toToggleCase(String string) {
    UnaryOperator<String> replace = s -> Character.isLowerCase(s.charAt(0)) ? s.toUpperCase() : s.toLowerCase();
    return compile("[a-zA-Z]").matcher(string).replaceAll(m -> replace.apply(m.group()));
  }
}
