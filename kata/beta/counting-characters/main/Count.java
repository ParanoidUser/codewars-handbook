import static org.apache.commons.lang3.StringUtils.countMatches;

class Count {
  static int count_one_char(String s, char c) {
    return countMatches(s, c);
  }
}