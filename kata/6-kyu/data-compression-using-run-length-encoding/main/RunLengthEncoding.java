import static java.util.regex.Pattern.compile;

interface RunLengthEncoding {
  static String encode(String input) {
    return compile("(.)\\1*").matcher(input).replaceAll(m -> m.end() - m.start() + m.group(1));
  }

  static String decode(String input) {
    return compile("(\\d+)(\\D)").matcher(input).replaceAll(m -> m.group(2).repeat(Integer.parseInt(m.group(1))));
  }
}
