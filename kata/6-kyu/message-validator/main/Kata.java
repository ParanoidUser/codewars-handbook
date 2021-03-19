import static java.util.regex.Pattern.compile;

interface Kata {
  static boolean isAValidMessage(String message) {
    return compile("(\\d*)(\\D*)").matcher(message).results()
        .allMatch(m -> Integer.parseInt("0" + m.group(1)) == m.group(2).length());
  }
}