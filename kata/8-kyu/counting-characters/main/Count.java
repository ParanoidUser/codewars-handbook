import static org.apache.commons.lang3.StringUtils.countMatches;

interface Count {
  static int countCharOccurrences(String s, char c) {
    return countMatches(s, c);
  }
}