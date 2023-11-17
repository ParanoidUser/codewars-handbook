import static java.util.regex.Pattern.compile;
import static java.util.stream.Collectors.joining;

interface LoneChar {
  static char[] loneliest(String s) {
    var chars = compile("(\\s*\\w)(?=(\\s*))").matcher(s.trim()).results().map(c -> c.group(1) + c.group(2)).toList();
    int max = chars.stream().mapToInt(String::length).max().orElse(0);
    return chars.stream().filter(c -> c.length() == max).map(String::trim).collect(joining()).toCharArray();
  }
}